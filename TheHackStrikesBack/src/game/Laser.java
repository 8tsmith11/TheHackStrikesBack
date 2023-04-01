package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Laser extends Entity{
	
	private float distX, distY;
	
	private boolean isDead;
	
	private World world;
	
	private PImage laserImage;
	private PApplet parent;
	
	public Laser(PApplet parent, float x, float y, World world) {
		super(parent, x, y, 100000, world);
		distX = parent.mouseX - x;
		distY = parent.mouseY - y;
		laserImage = new PImage();
		parent.loadImage("art/laser.png");
	}
	
	public void draw(float imageX, float imageY) {
		parent.image(laserImage, imageX, imageY);
	}

	public boolean isDead() {
		return isDead;
	}
	
	@Override
	public void behavior() {
		if(!isDead) {
			x+=distX/30;
			y+=distY/30;
		}
	}
	
	
}
