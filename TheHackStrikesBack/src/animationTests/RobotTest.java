package animationTests;

import game.Robot;
import processing.core.PApplet;

public class RobotTest extends PApplet{
	
	
	
	
	private Robot bob;


	public static void main(String[] args) {

		
		PApplet.main("animationTests.RobotTest");
		
		
		
		// TODO Auto-generated constructor stub
	}
	
	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		bob = new Robot(this, 100.0f, 100.0f);
	}
	
	public void draw() {
		background(0);
		bob.draw(IMAGE, IMAGE);
		bob.setMoving(true);
	}

}
