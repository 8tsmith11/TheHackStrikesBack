package game;

import processing.core.PApplet;

public class Game extends PApplet
{
	
	private World world;
	private WorldDrawer wd;
	private int tileSize = 32;

	public static void main(String[] args) 
	{
		PApplet.main("game.Game");
	}
	
	public void setup() {
		world = new World(1000);
		wd = new WorldDrawer(this, world, tileSize, 30, 20);
	}
	
	public void settings()
	{
		size(tileSize * 30, tileSize * 20);
	}
	
	public void draw()
	{
		wd.drawMap();
	}
	
	
//	public void keyReleased() {
//		if(key == CODED) {
//			if (keyCode == RIGHT) {
//				world.getRobot().moveX()
//			}
//			
//			else if(keyCode == LEFT) {
//				
//			}
//			
//			else if(keyCode == UP) {
//				
//			}
//			else if(keyCode == DOWN) {
//				
//			}
//			
//		}
//	}
	
}