package com.ak.streetfighter.gaming.sprites;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.ak.streetfighter.gaming.utils.GameConstants;

public class KenPlayer extends CommonPlayer{
	private BufferedImage damageEffectImages[]=new BufferedImage[5];
	private BufferedImage walkImages[]=new BufferedImage[6];
	private BufferedImage kickImages[]=new BufferedImage[6];
	private BufferedImage punchImages[]=new BufferedImage[6];
	//
	public KenPlayer() throws Exception {
		x=GWIDTH-200;
		y=FLOOR-h;
		img=ImageIO.read(KenPlayer.class.getResource(OPP_PLAYER_IMG));
		speed=0;
		currentMove2=WALK;
		loadWalkImages();
		loadKickImages();
		loadPunchImages();
		loadDamageEffect();
	}
	
	private void loadDamageEffect() {
		damageEffectImages[0]=img.getSubimage(1440, 3273, 83, 94);
		damageEffectImages[1]=img.getSubimage(1541, 3278, 69, 88);
		damageEffectImages[2]=img.getSubimage(1630, 3280, 65, 88);
		damageEffectImages[3]=img.getSubimage(2038, 3278, 56, 84);
		damageEffectImages[4]=img.getSubimage(1710, 3276, 64, 89);
		
		
	}
	

	private void loadWalkImages() {
		walkImages[0]=img.getSubimage(1266, 866, 59, 88);
		walkImages[1]=img.getSubimage(1336, 866, 59, 88);
		walkImages[2]=img.getSubimage(1409, 864, 61, 90);
		walkImages[3]=img.getSubimage(1480, 864, 61, 92);
		walkImages[4]=img.getSubimage(1548, 864, 63, 92);
		walkImages[5]=img.getSubimage(1617, 867, 63, 89);
		
	}

	private void loadKickImages() {
		// TODO Auto-generated method stub
		kickImages[0]=img.getSubimage(2035, 1564, 60, 98);
		kickImages[1]=img.getSubimage(1970, 1564, 66, 95);
		kickImages[2]=img.getSubimage(1839, 1563, 115, 96);
		kickImages[3]=img.getSubimage(1429, 1563, 64, 95);
		kickImages[4]=img.getSubimage(1352, 1567, 62, 94);
		kickImages[5]=img.getSubimage(1243, 1568, 90, 94);								
	}
	
	private void loadPunchImages() {
		// TODO Auto-generated method stub
		punchImages[0]=img.getSubimage(2031, 1153, 63, 91);
		punchImages[1]=img.getSubimage(1931, 1151, 93, 91);
		punchImages[2]=img.getSubimage(1865, 1152, 66, 91);
		punchImages[3]=img.getSubimage(1789, 1147, 73, 94);
		punchImages[4]=img.getSubimage(1669, 1146, 108, 97);
		punchImages[5]=img.getSubimage(1589, 1147, 77, 96);
		
	}
	
	public BufferedImage printDamageImage() {
		if(imageIndex2>damageEffectImages.length-1) {
			imageIndex2=0;
			currentMove2=WALK;
		}
		BufferedImage img=damageEffectImages[imageIndex2];
		imageIndex2++;
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
		if(imageIndex2>5) {
			imageIndex2=0;
		}
		BufferedImage img=walkImages[imageIndex2];
		imageIndex2++;
		return img;
	}
	public BufferedImage printKick() {
		if(imageIndex2>5) {
			imageIndex2=0;
			//if kick ended , make it walk again	
			currentMove2=WALK;
			isAttacking=false;
		}
		isAttacking=true;
		BufferedImage img=kickImages[imageIndex2];
		imageIndex2++;
		return img;
	}
	
	public BufferedImage printPunch() {
		if(imageIndex2>5) {
			imageIndex2=0;
			//if punch ended , make it walk again	
			currentMove2=WALK;
			isAttacking=false;
		}
		isAttacking=true;
		BufferedImage img=punchImages[imageIndex2];
		imageIndex2++;
		return img;
	}


	@Override
	public BufferedImage defaultImage() {
       if(currentMove2==KICK) {
        	return printKick();
        }
       else if(currentMove2==PUNCH) {
         	return printPunch();   
       }	
       else if(currentMove2==DAMAGE) {
    	   return printDamageImage();
       }
       else
    	   return printWalk();
	}
}
