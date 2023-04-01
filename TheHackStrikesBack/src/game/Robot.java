package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Robot extends Creature {
	
	private PApplet parent;
	
	private int compost;
	private int recyling;
	
	private boolean moving;
	
	private float changeTime;
	
	private int animationIndex;
	
	private PImage[] sprites;
	
	//test
	public Robot(PApplet parent,float x, float y ) 
	{
		
		super(parent,x, y,100);
		
		this.parent = parent;
		
		moving = false;
		compost = 0; 
		recyling = 0;
		animationIndex = 0;
		
		sprites = new PImage[3];
		
		setupImages() ;
		
	}
	//akkdajakdjsdjaksj
	private void setupImages() {
		for(int i = 0; i < sprites.length; i++) {
			
			
			
			sprites[i] = parent.loadImage("art/robot" + i + ".png");
		}
	}
	
	public void setMoving(boolean b) {
		moving = b;
	}

	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(float imageX, float imageY) {
		
		if(moving) {
			if(changeTime <= parent.millis()) {
				animationIndex++;
				changeTime = parent.millis() + 100;
			}
			
			if(animationIndex >= sprites.length)
				animationIndex = 0;
			
			
		}
		else {
			animationIndex = 0;
		}
		
		parent.image(sprites[animationIndex], imageX, imageY);
		// TODO Auto-generated method stub
		
	}
	
	
}
