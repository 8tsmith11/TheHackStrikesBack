package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Laser extends Entity{
	
	private float toX, toY;
	
	private PImage laserImage;
	private PApplet parent;
	
	public Laser(PApplet parent, float x, float y) {
		super(parent, x, y, 100000);
		toX = parent.mouseX;
		toY = parent.mouseY;
		laserImage = new PImage();
		parent.loadImage("art/laser.png");
	}
	
	public void draw(float imageX, float imageY) {
		parent.image(laserImage, imageX, imageY);
	}

	
	
	@Override
	public void behavior() {
		x+=(toX - x)/30;
		y+=(toY - y)/30;
		
	}
	
	
}
