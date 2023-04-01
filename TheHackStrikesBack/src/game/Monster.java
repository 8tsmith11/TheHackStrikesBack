package game;

public class Monster extends Creature {
	private Entity target;
	private boolean targeting;
	
	public Monster(float x, float y, int health) {
		super(x,y, health);
		targeting = false;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		
	}
	
}



