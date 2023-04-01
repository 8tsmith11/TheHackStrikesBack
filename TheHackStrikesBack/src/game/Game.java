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
		world = new World(this, 1000);
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
	
	
	public void keyPressed() {
		if(key == CODED) {
			world.getRobot().setMoving(true);
			if (keyCode == RIGHT) {
				world.getRobot().moveX(1);
			}
			
			if(keyCode == LEFT) {
				world.getRobot().moveX(-1);
			}
			//afsjkjkfadjkfaddfskajdfaskjafdjksafkdskfdsajjk
			if(keyCode == UP) {
				world.getRobot().moveY(-1);
			}
			if(keyCode == DOWN) {
				world.getRobot().moveY(1);
			}
			//world.getRobot().setMoving(false); s
			
		}
	}
	
	public void keyReleased() {
		if(key == CODED) {
			world.getRobot().setMoving(false);
		
	
			//world.getRobot().setMoving(false);
			
		}
	}
	
	
}