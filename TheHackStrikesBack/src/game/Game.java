package game;

import processing.core.PApplet;

public class Game extends PApplet
{
	
	private World world;
	private WorldDrawer wd;

	public static void main(String[] args) 
	{
		PApplet.main("game.Game");
	}
	
	public void setup() {
		world = new World(1000);
	}
	
	public void settings()
	{
		
		
	}
	
	
	public void keyReleased() {
		if(key == CODED) {
			if (keyCode == RIGHT) {
				world.getRobot().moveX()
			}
			
			else if(keyCode == LEFT) {
				
			}
			
			else if(keyCode == UP) {
				
			}
			else if(keyCode == DOWN) {
				
			}
			
		}
	}
	
}