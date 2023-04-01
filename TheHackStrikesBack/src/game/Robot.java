package game;

import processing.core.PImage;

public class Robot extends Creature {
	
	private int compost;
	private int recyling;
	
	private boolean moving;
	
	private float timer;
	private int animationIndex;
	
	private PImage[] sprites;
	
	//test
	public Robot(float x, float y ) 
	{
		super(x, y,100);
		moving = false;
		compost = 0; 
		recyling = 0;
		animationIndex = 0;
		
	}
	
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
			
		}
		// TODO Auto-generated method stub
		
	}
	
	
}
