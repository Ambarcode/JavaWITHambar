package com.ak.streetfighter.gaming.sprites;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Power extends CommonPlayer  {
	
    String playerName;
	public Power(int x,String playerName) {
		this.x=x;
		y=100;
		h=32;
		w=280;
		this.playerName=playerName;
	}
      
	@Override
	public BufferedImage defaultImage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void printRectangle(Graphics pen) {
		pen.setColor(Color.RED);
		pen.fillRect(x, y, w, h);
		pen.setColor(Color.GREEN);
		pen.fillRect(x, y, health, h);
		pen.setColor(Color.white);
		pen.setFont(new Font("times",Font.BOLD,30));
		pen.drawString(playerName, x, y+h+25);
	}

}
