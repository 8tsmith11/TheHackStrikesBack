package game;

import processing.core.PApplet;

public abstract class Creature extends Entity {

	private float speed;
	protected float damage;
	protected String direction;


	public Creature(PApplet parent, float x, float y, int health, World world) 
	{
		super(parent,x, y, health,world);
		direction = "up";

		speed = .1f;
	}//jldsjkdsjkallasdfhjkfdkshjahdfkjfdkahjhkjfdaskadsadsdfdfdfsjkladsadsdasads

	public void moveX(float displacement) {

		int xCheck = 0;

		if(direction.equals("right")) {
			xCheck += 1;
		}

		if(direction.equals("left")) {
			if(x != 0)
				xCheck -= 1;
		}

		if(world.getMap()[(int) (xCheck + x)][(int) y] == 1 || world.getMap()[ (int) (xCheck + x)][(int) y] == -1)
			x += displacement * speed;
	}
	public void moveY(float displacement) {

		int yCheck = 0;

		if(direction.equals("up")) {
			if(y != 0)
				yCheck -= 1;
		}
		if(direction.equals("down")) {

			yCheck += 1;
		}

		if(world.getMap()[(int) (x ) ][(int) (yCheck + y) ] == 1 || world.getMap()[ (int) (x) ][(int) (yCheck + y)] == -1)
			y += displacement * speed;
	}


	public float getDamage() {
		return damage;
	}


}
