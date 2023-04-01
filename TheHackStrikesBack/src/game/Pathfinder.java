package game;

import java.util.ArrayList;

public class Pathfinder 
{
	private World world;
	private ArrayList<PathTile> openList;
	private ArrayList<PathTile> closedList;
	
	public Pathfinder(World world)
	{
		this.world = world;
		openList = new ArrayList<PathTile>();
		closedList = new ArrayList<PathTile>();
	}
	
	public int[] calculatePath(int posX, int posY, int targetX, int targetY, int range)
	{
		openList.clear();
		closedList.clear();
		
		//if(posX != targetX || posY != targetY)
		if (Math.hypot(targetX - posX, targetY - posY) > range)
		{
			PathTile startTile = new PathTile(posX, posY, null, targetX, targetY, 1);
			closedList.add(startTile);
			addAdjacentTiles(startTile);
			
			while (openList.size() > 0)
			{
				int cheapestTile = 0;
				for(int i = 1; i < openList.size(); i++)
				{
					if (openList.get(i).getScore() 
							<= openList.get(cheapestTile).getScore())
					{
						cheapestTile = i;
					}
				}
						
				PathTile tile = openList.get(cheapestTile);
				closedList.add(tile);
				openList.remove(tile);
				addAdjacentTiles(tile);
						
				//if(tile.getX() == targetX && tile.getY() == targetY)
				if (Math.hypot(targetX - tile.getX(), targetY - tile.getY()) <= range)
				{						
					while(tile.getParent().getParent() != null)
					{
						tile = tile.getParent();
					}
							
					return new int[] {tile.getX(), tile.getY()};
				}
			}	
		}
		
		return new int[] {posX, posY};
	}
	
	private void addAdjacentTiles(PathTile tile)
	{
		int tileX = tile.getX();
		int tileY = tile.getY();
		
		for(int x = -1; x <= 1; x++)
		{
			for(int y = -1; y <= 1; y++)
			{
				if(x != 0 || y != 0)
				{
					int adjX = tileX + x;
					int adjY = tileY + y;
					
					if(adjX >= 0 && adjY >= 0 && world.getTile(adjX, adjY) != 1)
					{
						boolean inClosedList = false;
						
						for(int i = 0; i < closedList.size(); i++)
						{
							if(adjX == closedList.get(i).getX() && adjY == closedList.get(i).getY())
							{
								inClosedList = true;
							}
						}
						
						if(!inClosedList)
						{
							boolean inOpenList = false;
							PathTile openListTile = null;
							
							for(int i = 0; i < openList.size(); i++)
							{
								if(adjX == openList.get(i).getX() && adjY == openList.get(i).getY())
								{
									inOpenList = true;
									openListTile = openList.get(i);
								}
							}
							
							if(!inOpenList)
							{
								openList.add(new PathTile(adjX, adjY, tile, tile.getTargetX(), tile.getTargetY(), 1));
							}
							else
							{
								PathTile temp = new PathTile(adjX, adjY, tile, tile.getTargetX(), tile.getTargetY(), 1);
								if (temp.getScore() < openListTile.getScore())
								{
									openListTile.changeParent(tile);
								}
							}
						}
					}
				}
			}
		}
	}
}