package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Plant extends Entity {

	private int startX, startY, level,radius,speed;
	private PImage image;
	private World world;
	private PApplet parent;

	public Plant(PApplet parent, float x, float y, int health, World world) {
		super(parent, x, y, health,world);
		this.parent = parent;
		upgrade();

		this.world = world;
		startX = Math.round(x) - radius;
		startY = Math.round(y) - radius;
	}

	public void behavior() {
		if (!checkArea()) {
			double success = Math.random();
			if (success < .001 * speed) {
				cleanse();
			}
		}
	}

	private void cleanse() {
		boolean cleanedTile = false;
		while(!cleanedTile) {
			int randomX = (int) (Math.random()*(radius * 2 + 1))+startX;
			int randomY = (int) (Math.random()*(radius * 2 + 1))+startY;
			if(world.getMap()[randomX][randomY] < 0) {
				cleanedTile = true;
				world.getMap()[randomX][randomY] *= 1;
			}//s
		}
	}

	private boolean checkArea() {
		
		for (int r = startY; r < startY + (radius * 2 + 1); r++) {
			for (int c = startX; c < startX + (radius * 2 + 1); c++) {
				if (world.getTile(r, c) == -1)
					return false;
			}
		}
		return true;
	}
	
	public void upgrade() {
		if(level < 3)
			level++;
		
		if(level == 1) {
			radius = 3;
			speed = 3;
		}
		else if(level == 2) {
			radius = 5;
			speed = 5;
			
		}
		else if(level == 3) {
			radius = 9;
			speed = 9;
			
		}
		
		image = parent.loadImage("art/plant" + level + ".png");
		
	}

	public void draw(float imageX, float imageY) {
		parent.image(image, imageX,imageY);//
	}
	
	
}
