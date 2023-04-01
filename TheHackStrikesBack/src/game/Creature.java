package game;

public abstract class Creature extends Entity {
	
	private float speed;
	
	private float damage;
	
	public Creature(float x, float y) 
	{
		super(x, y);
		speed = 20;
	}
	
	public void moveX(float displacement) {
		x += displacement;
	}
	public void moveY(float displacement) {
		y += displacement;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public float getDamage() {
		return damage;
	}

}
