package game;

public class Plant extends Entity{
	
	
	public Plant(int radiusOfGrowth, int growthSpeed) {
		
	}
	
	private void behavior()
	{
		double success = Math.random();
		if (success < .001 * growthSpeed)
		{
			cleanse();
		}
	}
	
	private void cleanse()
	{
		for (int )//
	}
}
