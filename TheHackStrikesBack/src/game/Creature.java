package game;

import processing.core.PApplet;

public abstract class Creature extends Entity {
	
	private float speed;
	protected float damage;
	protected String direction;
	
	private PApplet parent;
	
	public Creature(PApplet parent, float x, float y, int health, int WorldSize) 
	{
		super(parent,x, y, health,WorldSize);
		speed = .1f;
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
