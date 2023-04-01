package ballCloud;

import processing.core.PApplet;

public class BallCloud extends PApplet
{
	Ball[] ballCloud = new Ball[36000];
	int moveSpeed = 10;

	public static void main(String[] args) 
	{
		PApplet.main("ballCloud.BallCloud");
	}

    public void settings()
    {
        size(1000, 1000);
    }
    
    public void setup()
    {
    	noStroke();
    	
    	for(int i = 0; i < ballCloud.length; i++)
    	{
    		float speedX = (sin(PApplet.radians((float)i / 100)) * moveSpeed);
			float speedY = (cos(PApplet.radians((float)i / 100)) * moveSpeed);
    		
    		ballCloud[i] = new Ball(this, width / 2, height / 2, speedX, speedY);
    	}
    }
    
    public void draw()
    {
    	background(100, 0, 0);
    	
    	for(int i = 0; i < ballCloud.length; i++)
    	{
    		ballCloud[i].drawSelf();
    		ballCloud[i].move();
    	}
    }
}