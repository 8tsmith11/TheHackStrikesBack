package game;

import processing.core.PApplet;
import processing.core.PImage;

public class WorldDrawer 
{
	private PApplet p;
	private World world;
	private int tileSize;
	// Width of the screen in tiles
	private int width;
	// Height of the screen in tiles
	private int height;
	
	private PImage ground;
	private PImage deadGround;
	private PImage water;
	private PImage deadWater;
	
	public WorldDrawer(PApplet parent, World world, int tileSize, int width, int height)
	{
		p = parent;
		this.world = world;
		
		ground = parent.loadImage("images/ground.png");
		deadGround = parent.loadImage("images/deadground.png");
		water = parent.loadImage("images/water.png");
		deadWater = parent.loadImage("images/deadwater.png");
	}
}
