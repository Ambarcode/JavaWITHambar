package com.ak.streetfighter.gaming.canvas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.swing.Timer;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.ak.streetfighter.gaming.sprites.KenPlayer;
import com.ak.streetfighter.gaming.sprites.Power;
import com.ak.streetfighter.gaming.sprites.RyuPlayer;
import com.ak.streetfighter.gaming.utils.GameConstants;

public class Board extends JPanel implements GameConstants{
	BufferedImage myImg;
	private RyuPlayer player;
	private KenPlayer oppPlayer;
	private Power fullPowerRyu;
	private Power fullPowerKen;
	private boolean gameOver;
	
	private Timer timer;
	
	private void gameLoop() {
		timer=new Timer(GAME_LOOP,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				if(gameOver) {
					timer.stop();
				}
		        player.fall();
		        oppPlayer.fall();
		        collision();
		        isGameOver();
				
			}
		});
		timer.start();
	}
	public Board() throws Exception {
		player=new RyuPlayer();
		oppPlayer=new KenPlayer();
		loadBackGroundImg();
		setFocusable(true); //to focus on the board
		bindEvents();
		gameLoop();
		loadPower();
	}
	
	
	private void loadPower() {
		fullPowerRyu=new Power(30,"Ryu");
		fullPowerKen=new Power(GWIDTH-350,"Ken");
	}
	
	private void printFullPower(Graphics g) {
		fullPowerRyu.printRectangle(g);
		fullPowerKen.printRectangle(g);
	}
	
	//Now we'll make a method to check whether collision occur or not
	 public boolean isCollide() {
		 
		 //The logic for collision is : if the player lies within the range of any player's width and height , collision occurs
		 int xDis=Math.abs(player.getX()-oppPlayer.getX());
		 int yDis=Math.abs(player.getY()-oppPlayer.getY());
		 int maxH=Math.max(player.getH(), oppPlayer.getH());
		 int maxW=Math.max(player.getW(), oppPlayer.getW());
		 return xDis<=maxW && yDis<=maxH;
		 
	 }
	 
	 public void collision() {
		 if(isCollide()) {
			 if(player.isAttacking()) {
				 oppPlayer.setCurrentMove2(DAMAGE);
				 fullPowerKen.setHealth();
			 }
			 if(oppPlayer.isAttacking()) {
				 player.setCurrentMove(DAMAGE);
				 fullPowerRyu.setHealth();
			 }
			 player.setCollide(true);
			 player.setSpeed(0);
			 oppPlayer.setCollide(true);
			 oppPlayer.setSpeed(0);
		 }
		 else {
			 player.setCollide(false);
			 player.setSpeed(SPEED);
			 oppPlayer.setCollide(false);
			 oppPlayer.setSpeed(SPEED);
			 
		 }
	 }
	
	//action listeners to bind the key
	private void bindEvents() {
		KeyListener listener=new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Typed "+e.getKeyCode() + " "+ e.getKeyChar());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Reased "+e.getKeyCode() + " "+ e.getKeyChar());
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				//for left player
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.setCollide(false);
					player.setSpeed(-SPEED);
					player.move();
					//repaint();
					//System.out.println(player.getX());
				}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					player.setSpeed(SPEED);
					player.move();
					//repaint();
					//System.out.println(player.getX());
				}
				if(e.getKeyCode()==KeyEvent.VK_A) {
					
					oppPlayer.setSpeed(-SPEED);
					oppPlayer.move();
					//repaint();
					//System.out.println(player.getX());
				}
				if(e.getKeyCode()==KeyEvent.VK_D) {
					oppPlayer.setCollide(false);
					oppPlayer.setSpeed(SPEED);
					oppPlayer.move();
					//repaint();
					//System.out.println(player.getX());
				}
				
				if(e.getKeyCode()==KeyEvent.VK_S) {
					oppPlayer.setCurrentMove2(KICK);
				}
				
				if(e.getKeyCode()==KeyEvent.VK_K) {
					player.setCurrentMove(KICK);
				}
				
				if(e.getKeyCode()==KeyEvent.VK_P) {
					player.setCurrentMove(PUNCH);
				}
				if(e.getKeyCode()==KeyEvent.VK_L) {
					oppPlayer.setCurrentMove2(PUNCH);
				}
				
				if(e.getKeyCode()==KeyEvent.VK_J) {
					player.jump();
				}
				
				if(e.getKeyCode()==KeyEvent.VK_UP) {
					oppPlayer.jump();
				}
				// TODO Auto-generated method stub
				System.out.println("Pressed "+e.getKeyCode() + " "+ e.getKeyChar());
				
			}
		};
		
		this.addKeyListener(listener);
	}
	
	private void isGameOver() {
		if(fullPowerRyu.getHealth()<=0 || fullPowerKen.getHealth()<=0) {
		   gameOver = true;
		}
		
	}
	
	private void printGameOver(Graphics pen) {
		if(gameOver) {
		pen.setColor(Color.RED);
		pen.setFont(new Font("times",Font.BOLD,40));
		pen.drawString("Game Over", GWIDTH/2-50, GHEIGHT/2);
	}
	}

	
	//for rendering and painting , we'll use method of JPanel
	//the paintComponent method will run automatically after the constructor call
	public void paintComponent(Graphics pen) {
			printBackgroundImage(pen);
			player.drawPlayer(pen);	
			oppPlayer.drawPlayer(pen);
			printFullPower(pen);
			printGameOver(pen);
	}
	
	private void printBackgroundImage(Graphics Pen) {
		Pen.drawImage(myImg,0,0,GWIDTH,GHEIGHT,null); //here we had specified the last parameter as null , which means we are not observing whether the image is shrinking or expanding	
	}
	
	
   public void loadBackGroundImg() {
	  try {
			myImg=ImageIO.read(Board.class.getResource(BG_IMG));
			}
			catch(Exception e) {
				System.out.println("Sorry ! Image Loading Failed");
				System.exit(0);
			}
  }

}
