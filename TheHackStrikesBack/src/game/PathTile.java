package game;

public class PathTile 
{
	private PathTile parent;
	private float score;
	private int x;
	private int y;
	private int targetX;
	private int targetY;
	private int baseScore;
	
	public PathTile(int x, int y, PathTile parent, int targetX, int targetY, int baseScore)
	{
		this.x = x;
		this.y = y;
		this.parent = parent;
		this.targetX = targetX;
		this.targetY = targetY;
		this.baseScore = baseScore;
		calculateScore();
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY() 
	{
		return y;
	}
	
	public float getScore()
	{
		return score;
	}
	
	public int getTargetX()
	{
		return targetX;
	}
	
	public int getTargetY()
	{
		return targetY;
	}
	
	public PathTile getParent()
	{
		return parent;
	}
	
	public void changeParent(PathTile tile)
	{
		parent = tile;
		calculateScore();
	}
	
	private void calculateScore()
	{
		float startToTile = 0;
		
		if (parent != null)
		{
			startToTile = parent.getScore() + baseScore;
		}
		else startToTile = 0;
		
		float tileToTarget = (float)Math.hypot(targetX - x, targetY - y);
		
		score = startToTile + tileToTarget;
	}
}