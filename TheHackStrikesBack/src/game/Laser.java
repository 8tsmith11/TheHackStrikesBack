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
		laserImage = new PImage();//hjk
		parent.loadImage("art/laser.png");
	}
	
	public void draw(float imageX, float imageY) {
		parent.imageMode(parent.CENTER);
		parent.translate(imageX,imageY);

		parent.rotate((float) Math.atan(distY/distX));

		parent.image(laserImage, imageX, imageY);
		
		parent.rotate((float) Math.atan(distY/distX));

		parent.translate(imageX * -1 ,imageY * -1 );

		parent.imageMode(parent.CORNER);
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
