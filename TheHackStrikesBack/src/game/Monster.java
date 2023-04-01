package game;

public class Monster extends Creature {
	private Entity target;
	private boolean targeting;
	
	public Monster(float x, float y) {
		super(x);
		super(y);
		targeting = false;
	}
	
	public void setTarget(Creature target) {
		this.target = target;
		targeting = true;
	}
	
	public boolean isTargeting() {
		return targeting;
	}
	
}




