package game;

import java.util.ArrayList;

public class World 
{
	private int[][] map;
	private Robot player;
	private ArrayList<Entity> entities;
	private int worldWidth;
	private int worldHeight;
	
	public World(int size)
	{
		map = new int[size][size];
		for (int r = 0; r < map.length; r++)
		{
			for (int c = 0; c < map.length; c++)
			{
				map[r][c] = -1;
			}
		}
		
		entities = new ArrayList<Entity>();
	}
	
	public double getPlayerX()
	{
		
	}
	
	public double getPlayerY()
	{
		
	}
	
	public int getMapWidth()
	{
		
	}
	
	public int getMapHeight()
	{
		
	}
}