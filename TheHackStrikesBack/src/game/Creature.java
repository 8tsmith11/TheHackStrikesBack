package game;

public abstract class Creature extends Entity {
	
	public int tilesPerSecond; 

	public Creature() {
		// TODO Auto-generated constructor stub
	}
	
	public void moveX(float displacement) {
		X+= displacement;
	}
	public void moveY(float displacement) {
		Y+= displacement;
	}
	
	public void setSpeed(int speed) {
		tilesPerSecond = speed;
	}

}
