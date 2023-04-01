package game;

public abstract class Entity {
	
	protected float X;

	protected float Y;
	
	private int health;
	
	public void ChangeHealth(int change) {
		health+= change;
	}
	
	public int getHealth() {
		return health;
	}
	
	public float getX() {
		return X;
	}
	
	public float getY() {
		return Y;
	}


}
