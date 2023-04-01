package game;

public abstract class Creature extends Entity {
	
	
	private float damage;
	protected String direction;
	
	public Creature(float x, float y) 
	{
		super(x, y);
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
