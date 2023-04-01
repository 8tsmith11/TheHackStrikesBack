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
	private PImage workshop;
	
	public WorldDrawer(PApplet parent, World world, int tileSize, int width, int height)
	{
		p = parent;
		this.world = world;
		this.tileSize = tileSize;
		this.width = width;
		this.height = height;
		
		ground = parent.loadImage("art/ground.png");
		deadGround = parent.loadImage("art/deadground.png");
		water = parent.loadImage("art/water.png");
		deadWater = parent.loadImage("art/deadwater.png");
		workshop = parent.loadImage("art/workshop.png");
	}
	
	public void drawWorld()
	{
		drawMap();
		drawEntities();
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
					if (t == 0)
					{
						p.image(workshop, imageX, imageY);
					}
					else if (t == -1)
					{
						p.image(deadGround, imageX, imageY);
					}
					else if (t == -2)
					{
						p.image(deadWater, imageX, imageY)
					}
				}
			}
		}
	}
	
	public void drawEntities()
	{
		for(int i = 0; i < world.getEntitiesLength(); i++)
		{
			float x = world.getEntity(i).getX();
			float y = world.getEntity(i).getY();
			
			if(Math.abs(world.getPlayerX() - x) <= width / 2 + tileSize / 2 
					&& Math.abs(world.getPlayerY() - y) <= height / 2 + tileSize / 2)
			{
				float imageX = (width / 2 - world.getPlayerX() + x) * tileSize;
				float imageY = (height / 2 - world.getPlayerY() + y) * tileSize;
				
				world.getEntity(i).draw(imageX, imageY);
			}
		}
	}
}
