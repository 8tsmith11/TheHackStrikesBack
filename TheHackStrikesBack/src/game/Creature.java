package game;

public abstract class Creature extends Entity {
	
	public int tilesPerSecond; 
	
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
	
	public void setSpeed(int speed) {
		tilesPerSecond = speed;
	}

}
