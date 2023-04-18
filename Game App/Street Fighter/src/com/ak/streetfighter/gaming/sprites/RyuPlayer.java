package com.ak.streetfighter.gaming.sprites;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class RyuPlayer extends CommonPlayer{
	private BufferedImage damageEffectImages[]=new BufferedImage[5];
	private BufferedImage walkImages[]=new BufferedImage[6];
	private BufferedImage kickImages[]=new BufferedImage[6];
	private BufferedImage punchImages[]=new BufferedImage[6];
	

	public RyuPlayer() throws Exception {
		x=100;
		y=FLOOR-h;
		speed=0;
		img=ImageIO.read(RyuPlayer.class.getResource(PLAYER_IMG));
		loadWalkImages();
		loadKickImages();
		loadPunchImages();
		loadDamageEffect();
	}
	
	private void loadDamageEffect() {
		damageEffectImages[0]=img.getSubimage(470, 2157,67 , 86);
		damageEffectImages[1]=img.getSubimage(395, 2155, 61, 90);
		damageEffectImages[2]=img.getSubimage(313, 2154, 73, 87);
		damageEffectImages[3]=img.getSubimage(235, 2156, 71, 87);
		damageEffectImages[4]=img.getSubimage(161, 2156, 66, 87);		
	}
	


	private void loadWalkImages() {
		walkImages[0]=img.getSubimage(6, 136, 60, 85);
		walkImages[1]=img.getSubimage(74, 129, 65, 91);
		walkImages[2]=img.getSubimage(151, 129, 65, 91);
		walkImages[3]=img.getSubimage(229, 131, 65, 91);
		walkImages[4]=img.getSubimage(306, 127, 55, 93);
		walkImages[5]=img.getSubimage(371, 126, 50, 94);
		
		
	}


	private void loadKickImages() {
		// TODO Auto-generated method stub
		kickImages[0]=img.getSubimage(14, 921, 62, 98);
		kickImages[1]=img.getSubimage(86, 921, 68, 95);
		kickImages[2]=img.getSubimage(160, 921, 116, 95);
		kickImages[3]=img.getSubimage(285, 921, 63, 96);
		kickImages[4]=img.getSubimage(356, 921, 49, 96);
		kickImages[5]=img.getSubimage(419, 921, 83, 96);
		
	}
	
	private void loadPunchImages() {
		// TODO Auto-generated method stub
		punchImages[0]=img.getSubimage(8, 679, 61, 97);
		punchImages[1]=img.getSubimage(88, 681, 76, 96);
		punchImages[2]=img.getSubimage(175, 683, 110, 92);
		punchImages[3]=img.getSubimage(292, 680, 65, 95);
		punchImages[4]=img.getSubimage(373, 682, 91, 95);
		punchImages[5]=img.getSubimage(474, 663, 83, 116);
		
	}
	public BufferedImage printDamageImage() {
		if(imageIndex>damageEffectImages.length-1) {
			imageIndex=0;
			currentMove=WALK;
		}
		BufferedImage img=damageEffectImages[imageIndex];
		imageIndex++;
		return img;
	
	}
	
	public void jump() {
		if(!isJump) {
		isJump=true;
		force=-20;
		y=y+force;
		}
	}
	public void fall() {
		if(y>=(FLOOR-h)) {
			isJump=false;
			return;
		}
		y=y+force;
		force=force+GRAVITY;	
	}
	public BufferedImage printWalk() {
		isAttacking=false;
		if(imageIndex>5) {
			imageIndex=0;
		}
		BufferedImage img=walkImages[imageIndex];
		imageIndex++;
		return img;
	}
	public BufferedImage printKick() {
		if(imageIndex>5) {
			imageIndex=0;
			//if kick ended , make it walk again	
			currentMove=WALK;
			isAttacking=false;
		}
		isAttacking=true;
		
		BufferedImage img=kickImages[imageIndex];
		imageIndex++;
		return img;
	}
	
	public BufferedImage printPunch() {
		if(imageIndex>5) {
			imageIndex=0;
			//if punch ended , make it walk again	
			currentMove=WALK;
			isAttacking=false;
		}
		isAttacking=true;
		
		BufferedImage img=punchImages[imageIndex];
		imageIndex++;
		return img;
	}


	@Override
	public BufferedImage defaultImage() {
	       if(currentMove==KICK) {
	        	return printKick();
	        }
	       else if(currentMove==PUNCH) {
	         	return printPunch();   
	       }	
	       else if(currentMove==DAMAGE) {
	    	   return printDamageImage();
	       }
	       else
	    	   return printWalk();
		}
	
}
