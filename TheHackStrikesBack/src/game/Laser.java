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
	}
	
	public void draw() {
		parent.image()//
	}
	
	
}
