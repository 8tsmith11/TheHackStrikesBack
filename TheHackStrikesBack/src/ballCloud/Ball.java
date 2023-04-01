package ballCloud;

import processing.core.PApplet;

public class Ball 
{
	private PApplet parent;
	private float x, y;
	private int radius;
	
	private float speedX;
	private float speedY;
	
	public Ball(PApplet p, int initX, int initY, float initSpeedX, float initSpeedY)
	{
		parent = p;
        x = initX;
        y = initY; 
        speedX = initSpeedX;
        speedY = initSpeedY;
        
        radius = 2;
	}
	
	public void drawSelf()
	{
		parent.ellipse(x, y, radius * 2, radius * 2);
	}
	
	public void move()
	{
		checkBorderCollide();
		
		x += speedX;
		y += speedY;
	}
	
	private void checkBorderCollide()
	{
		if (x + radius > parent.width)
		{	
				speedX = -speedX;
				x = parent.width - radius;
		}
		if (x - radius < 0)
		{
				speedX = -speedX;
				x = radius;
		}
		if (y + radius > parent.height) 
		{
				speedY = -speedY;
				y = parent.height - radius;
		}
		if (y - radius < 0)
		{	
				speedY = -speedY;
				y = radius;
		}
	}
}