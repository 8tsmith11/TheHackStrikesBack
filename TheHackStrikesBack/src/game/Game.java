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
		wd.drawWorld();
	}
	
	
	public void keyReleased() {
		if(key == CODED) {
			if (keyCode == RIGHT) {
				world.getRobot().moveX(1);
			}
			
			if(keyCode == LEFT) {
				world.getRobot().moveX(-1);
			}
			//afsjkjkfadjkfaddfskajdfaskjafdjksafkdskfdsajjk
			if(keyCode == UP) {
				world.getRobot().moveX(1);
			}
			if(keyCode == DOWN) {
				world.getRobot().moveY(-1);
			}
			
		}
	}
	
}