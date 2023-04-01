package game;

import processing.core.PApplet;

public class Game extends PApplet
{
	
	private World world;
	private WorldDrawer wd;
	private int tileSize = 32;
	
	private int leftInput;
	private int rightInput;
	private int upInput;
	private int downInput;

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
		world.update();
		background(0);
		wd.drawWorld();
		world.getRobot().moveX(leftInput + rightInput);
		world.getRobot().moveY(downInput + upInput);

		if (leftInput + rightInput + downInput + upInput == 0)
		{
			world.getRobot().setMoving(false);
		}
		
		text("Compost: " + world.getRobot().getCompost(), 10, 15);
		text("Plastic: " + world.getRobot().getPlastic(), 10, 30);
		
	}
	

	
	public void keyPressed()
	{	
		if (key == 'w' || keyCode == UP)
		{
			world.getRobot().setMoving(true);
			world.getRobot().setDirection("up");
			upInput = -1;
		}
		else if (key == 'a' || keyCode == LEFT)
		{
			world.getRobot().setMoving(true);
			world.getRobot().setDirection("left");
			leftInput = -1;
		}
		else if (key == 's' || keyCode == DOWN)
		{
			world.getRobot().setMoving(true);
			world.getRobot().setDirection("down");
			downInput = 1;
		}
		else if (key == 'd' || keyCode == RIGHT)
		{
			world.getRobot().setMoving(true);
			world.getRobot().setDirection("right");
			rightInput = 1;
		}
	}
	
	public void keyReleased()
	{
		
		if (key == 'w' || keyCode == UP)
		{
			
			upInput = 0;
		}//kjadfsjkfadjkfdasdfkjsl
		else if (key == 'a' || keyCode == LEFT)
		{
			leftInput = 0;
		}
		else if (key == 's' || keyCode == DOWN)
		{
			downInput = 0;
		}
		else if (key == 'd' || keyCode == RIGHT)
		{
			rightInput = 0;
		}
	}
}