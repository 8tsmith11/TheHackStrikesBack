package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Monster extends Creature {
	
	
	private Entity target;
	private boolean targeting;
	
	private float changeTime;
	
	private int animationIndex;
	
	private PImage[] sprites;
	
	private PApplet parent;
	
	public Monster(PApplet parent, float x, float y, int health, World world) {
		super(parent, x,y, health,world);
		this.parent = parent;
		targeting = false;
		
		sprites = new PImage[4];
		setupImages();
	}
	
	public void setTarget(Creature target) {
		this.target = target;
		targeting = true;
	}
	
	public boolean isTargeting() {
		return targeting;
	}

	@Override
	public void draw(float imageX, float imageY) {
			if(changeTime <= parent.millis()) {
				animationIndex++;
				changeTime = parent.millis() + 100;
			}
			
			if(animationIndex >= sprites.length)
				animationIndex = 0;

		
		parent.image(sprites[animationIndex], imageX, imageY);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void behavior() {
		if(targeting) {//jkadsjkadskjdsjk
			target.damage(damage);
		}
		
		if (!targeting)
		{
			Entity closest = world.getRobot();
			for (int i = 1; i < world.getEntitiesLength(); i++)
			{
				
				if (Math.hypot(world.getEntity(i).getX() - this.getX(), world.getEntity(i).getY() - this.getY()) > Math.hypot(closest.getX() - this.getX(), closest.getY() - this.getY()))
				{
					closest = world.getEntity(i);
				}
			}
			target = closest;
		}
	}
	
	private void setupImages() {
		for(int i = 0; i < sprites.length; i++) {
			
			
			
			sprites[i] = parent.loadImage("art/sludge" + i + ".png");
		}
	}
	
}

//commentcommentcomme



