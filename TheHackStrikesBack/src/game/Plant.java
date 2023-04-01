package game;

import processing.core.PApplet;

public class Plant extends Entity {

	private int radius, speed, startX, startY;
	private World world;

	public Plant(PApplet parent, float x, float y, int health, int radiusOfGrowth, int growthSpeed, World world) {
		super(parent, x, y, health);
		radius = radiusOfGrowth;
		speed = growthSpeed;
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
			if(world.getMap()[randomX][randomY] < 0)
				cleanedTile = true;
				world.getMap()[randomX][randomY] *= -1;
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

	@Override
	public void draw(float imageX, float imageY) {
		// TODO Auto-generated method stub
		
	}
	
	
}
