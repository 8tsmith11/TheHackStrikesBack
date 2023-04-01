package game;

import java.util.ArrayList;

public class World 
{
	private int[][] map;
	private Robot player;
	private ArrayList<Entity> entities;;
	
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
		player = new Robot(size / 2, size / 2);
	}
	
	public int getTile(int x, int y)
	{
		return map[x][y];
	}
	
	public float getPlayerX()
	{
		return player.getX();
	}
	
	public float getPlayerY()
	{
		return player.getY();
	}
	
	public int getMapWidth()
	{
		return map[0].length;
	}
	
	public int getMapHeight()
	{
		return map.length;
	}
}