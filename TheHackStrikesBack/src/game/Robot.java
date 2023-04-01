package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Robot extends Creature {
	
	private int compost;
	private int recyling;
	
	private PImage idleFrame;
	private PImage moveFrame1;
	private PImage moveFrame2;
	
	//test
	public Robot(float x, float y) 
	{
		super(x, y);
		ground = parent.loadImage("art/ground.png");
	}

	@Override
	public void behavior() {
		// TODO Auto-generated method stu
		
	}
	
	public void draw(float imageX, float imageY)
	{
		
	}

	
}
