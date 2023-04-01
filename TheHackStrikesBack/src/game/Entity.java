package game;

public abstract class Entity {
	
	protected float x;

	protected float y;
	
	private int health;
	
	public Entity(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
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


}
