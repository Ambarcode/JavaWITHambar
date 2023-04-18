package com.ak.streetfighter.gaming.sprites;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.ak.streetfighter.gaming.utils.GameConstants;


public abstract class CommonPlayer implements GameConstants {
	//this will be an abstract class , as it contains common feature
	protected int x;
	protected int y;
	protected int h;
	protected int w;
	protected BufferedImage img;
	public abstract BufferedImage defaultImage();
	protected int speed;
	protected int imageIndex=0;
	protected  int imageIndex2=0;
	protected int currentMove;
	protected int currentMove2;
	protected int force;
	protected boolean isCollide;
	protected boolean isJump;
	protected boolean isAttacking;  
	protected int health;
	

	
	public int getHealth() {
		return health;
	}


	public void setHealth() {
		this.health = (int)(health-MAX_HEALTH*0.10);
	}


	public boolean isCollide() {
		return isCollide;
	}


	public boolean isAttacking() {
		return isAttacking;
	}


	public void setAttacking(boolean isAttacking) {
		this.isAttacking = isAttacking;
	}


	public void setCollide(boolean isCollide) {
		this.isCollide = isCollide;
	}


	public CommonPlayer() {
		this.h=100;
		this.w=120;
		health=MAX_HEALTH;
	}
	
	
	public int getCurrentMove2() {
		return currentMove2;
	}

	public void setCurrentMove2(int currentMove2) {
		this.currentMove2 = currentMove2;
	}
	
	
	
	public int getCurrentMove() {
		return currentMove;
	}

	public void setCurrentMove(int currentMove) {
		this.currentMove = currentMove;
	}

	public void drawPlayer(Graphics Pen) {
		Pen.drawImage(defaultImage(),x,y,w,h, null); //null means we'll not resize the image	
	}
	
	public void move() {
		if(!isCollide) {
		x=x+speed;
		}
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public BufferedImage getImg() {
		return img;
		
	}
	public void setImg(BufferedImage img) {
		this.img = img;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

}
