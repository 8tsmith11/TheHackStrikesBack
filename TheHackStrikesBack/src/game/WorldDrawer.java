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
		
		ground = parent.loadImage("art/ground.png");
		deadGround = parent.loadImage("art/deadground.png");
		water = parent.loadImage("art/water.png");
		deadWater = parent.loadImage("art/deadwater.png");
	}
	
	public void drawMap()
	{
		for (int x = 0; x <= width; x++)
		{
			for (int y = 0; y <= height; y++)
			{
				int tileX = x + (int)(world.getPlayerX()) - (width / 2);
				int tileY = y + (int)(world.getPlayerY()) - (height / 2);
				if (tileX >= 0 && tileY >= 0 && tileX < world.getMapWidth() && tileY < world.getMapHeight())
				{
					float offsetX = (world.getPlayerX() - (int)world.getPlayerX()) * tileSize;
					float offsetY = (world.getPlayerY() - (int)world.getPlayerY()) * tileSize;
					
					float imageX = x * tileSize - offsetX;
					float imageY = y * tileSize - offsetY;
							
					int t = world.getTile(tileX, tileY);
					if (t == -1)
					{
						p.image(deadGround, imageX, imageY);
					}
				}
			}
		}
	}
}
