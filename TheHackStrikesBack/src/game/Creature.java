package game;

import processing.core.PApplet;

public abstract class Creature extends Entity {
	
	private int speed;
	private float damage;
	protected String direction;
	
	private PApplet parent;
	
	public Creature(PApplet parent, float x, float y, int health) 
	{
		super(parent,x, y, health);
	}//jldsjkdsjkallasdfhjkfdkshjahdfkjfdkahjhkjfdaskadsadsdfdfdfsjkladsadsdasads
	
	public void moveX(float displacement) {
		x += displacement * speed;
	}
	public void moveY(float displacement) {
		y += displacement * speed;
	}
	
	
	public float getDamage() {
		return damage;
	}
}
