package game;

import processing.core.PApplet;

public abstract class Entity {
	
	private PApplet parent;
	
	protected float x,y;
	
	private int health;
	
	public Entity(PApplet parent, float x, float y, int health)
	{
		this.x = x;
		this.y = y;
		this.health = health;
	}
	
	public abstract void draw(float imageX, float imageY);
	
	public abstract void behavior();
	
	public void ChangeHealth(int change) {
		health+= change;
	}
	
	public int getHealth() {
		return health;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public void damage(float damage) {
		health-= damage;
	}
	
}
