package game;

import java.util.ArrayList;

import processing.core.PApplet;

public class World 
{
	private int[][] map;
	private Robot player;
	private ArrayList<Entity> entities;
	private PApplet p;
	
	public World(PApplet parent, int size)
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
		p = parent;
		player = new Robot(p, size / 2, size / 2);
		map[size / 2 + 1][size / 2] = 0;
		entities.add(player);
	}
	
	public Robot getRobot() {
		return player;
	}
	
	public int[][] getMap() {
		return map;
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
	
	public Entity getEntity(int index) {
		return entities.get(index);
	}
	public int getEntitiesLength() {
		return entities.size();
	}
}