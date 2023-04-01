package game;

import java.util.ArrayList;

import processing.core.PApplet;

public class World 
{
	private int[][] map;
	private Robot player;
	private ArrayList<Entity> entities;
	private PApplet p;
	
	private int seeds;
	
	public World(PApplet parent, int size)
	{
		map = new int[size][size];
		for(int r = 0; r < map.length; r++)
		{
			for (int c = 0; c < map.length; c++)
			{
				map[r][c] = -1;
				if(Math.random() < 0.02) {
					map[r][c] = -3;
				}
			}
		}
		
		for(int r = 0; r < map.length; r++) {
			for(int c = 0; c < map.length; c++) {
				if(Math.random() < 0.0005) 
				{
					formLake(c,r);
				}
			}
		}
		
		entities = new ArrayList<Entity>();
		p = parent;
		player = new Robot(p, size / 2, size / 2, this);
		map[size / 2 + 1][size / 2] = 0;
		entities.add(player);
		
		// Starter area
		for (int x = 0; x < 7; x++)
		{
			for (int y = 0; y < 7; y++)
			{
				if (map[x + size / 2 - 3][y + size / 2 - 3] != 0)
				{
					map[x + size / 2 - 3][y + size / 2 - 3] = 1;
				}
			}
		}
		entities.add(new Plant(p, size / 2, size / 2, 1, this));
	}
	
	public void update()
	{
		if (Math.random() < .0001)
		{
			int randX = (int) Math.random() * map[0].length;
			int randY = (int) Math.random() * map.length;
			
			if (map[randX][randY] < 0)
			{
				entities.add(new Monster(p, randX, randY, 100, this));
			}
		}
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
	
	public void formLake(int startX, int startY) {
		int lakeSize = (int) (Math.random() * 13) + 3;
		for(int r = startY; r < startY + lakeSize; r++) {
			for(int c = startX; c < startX + lakeSize; c++) {
				if(r < map.length && c < map[0].length) {
					map[r][c] = -2;
				}
			}
		}
	}
	
	public void addSeed() {
		seeds++;
	}
}

//commentcommentcommenasdkljdaskldasjkladsjklsklk