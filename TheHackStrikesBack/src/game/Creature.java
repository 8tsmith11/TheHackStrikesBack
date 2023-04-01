package game;

public abstract class Creature extends Entity {
	
	private int speed;
	private float damage;
	
	public Creature(float x, float y, int health) 
	{
		super(x, y, health);
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
