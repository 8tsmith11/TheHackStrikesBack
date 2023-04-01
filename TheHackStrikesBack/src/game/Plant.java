package game;

import processing.core.PApplet;

public class Plant extends Entity {

	private int radius, speed;
	private World world;

	public Plant(PApplet parent, float x, float y, int health, int radiusOfGrowth, int growthSpeed, World world) {
		super(parent, x, y, health);
		radius = radiusOfGrowth;
		speed = growthSpeed;
		this.world = world;
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
			
		}
	}

	private boolean checkArea() {
		int startX = Math.round(x) - radius;
		int startY = Math.round(y) - radius;
		for (int r = startY; r <= startY + (radius * 2) + 1; r++) {
			for (int c = startX; c <= startX + (radius * 2) + 1; c++) {
				if (world.getTile(r, c) == -1)
					return false;
			}
		}
		return true;
	}
}
