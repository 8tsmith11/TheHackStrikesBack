package game;

public abstract class Creature extends Entity {
	
	
	private float damage;
	
	public Creature(float x, float y, int health) 
	{
		super(x, y, health);
	}
	
	public void moveX(float displacement) {
		x += displacement;
	}
	public void moveY(float displacement) {
		y += displacement;
	}
	
	
	public float getDamage() {
		return damage;
	}
}
