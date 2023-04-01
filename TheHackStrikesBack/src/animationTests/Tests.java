package animationTests;

import game.Monster;
import game.Plant;
import game.Robot;
import processing.core.PApplet;

public class Tests extends PApplet{
	
	
	
	
	private Robot bob;
	private Monster kevin;
	private Plant Monkey;

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
		Monkey = new Plant(this, 200f,300f,100000, display, display, null);
	}
	
	public void draw() {
		
		background(0);
		
		bob.draw(100, 100);
		
		kevin.draw(400, 400);
		bob.setMoving(true);
	}
	
	public void keyReleased() {
		if(key == CODED) {
			if (keyCode == RIGHT) {
				bob.moveX(1);
			}
			
			if(keyCode == LEFT) {
				bob.moveX(-1);
			}
			//afsjkjkfadjkfaddfskajdfaskjafdjksafkdskfdsajjk
			if(keyCode == UP) {
				bob.moveX(1);
			}
			if(keyCode == DOWN) {
				bob.moveY(-1);
			}
			
		}
	}

}
