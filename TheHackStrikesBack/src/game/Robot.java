package game;

public class Robot extends Creature {
	
	
	public Robot(float x, float y) 
	{
		super(x, y);
	}
	
	public void moveUp() {
		posY++;
	}
	
	public void moveDown() {
		posY--;
	}

	public void moveRight() {
		posX++;
	}
	
	public void moveLeft() {
		posX--;
	}

}
