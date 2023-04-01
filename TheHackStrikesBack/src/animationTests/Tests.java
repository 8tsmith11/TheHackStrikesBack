package animationTests;

import game.Monster;
import game.Robot;
import processing.core.PApplet;

public class Tests extends PApplet{
	
	
	
	
	private Robot bob;
	private Monster kevin;

	public static void main(String[] args) {

		
		PApplet.main("animationTests.Tests");
		
		
		
		// TODO Auto-generated constructor stub
	}
	
	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		bob = new Robot(this, 100.0f, 100.0f);
		
		kevin = new Monster(this, 100.0f, 100.0f,2000);
	}
	
	public void draw() {
		
		background(0);
		
		bob.draw(100, 100);
		
		kevin.draw(400, 400);
		bob.setMoving(true);
	}

}
