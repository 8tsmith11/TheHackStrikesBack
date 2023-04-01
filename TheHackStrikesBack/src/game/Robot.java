package game;

public class Robot extends Creature {
	
	private int posX;
	private int posY;
	
	public Robot(int positionX, int positionY) {
		posX = positionX;
		posY = positionY;
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
