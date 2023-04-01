package game;

import processing.core.PApplet;
import processing.core.PImage;

public class Robot extends Creature {

	private PApplet parent;

	private int compost;
	private int plastic;

	private boolean moving;

	private String direction = "up";

	private float changeTime;

	private int animationIndex;

	private PImage[] sprites;

	//test
	public Robot(PApplet parent,float x, float y ) 
	{

		super(parent,x, y,100);

		this.parent = parent;

		moving = false;
		compost = 0; 
<<<<<<< HEAD
=======
		plastic = 0;
>>>>>>> branch 'master' of git@github.com:8tsmith11/TheHackStrikesBack.git
		animationIndex = 0;

		sprites = new PImage[3];

		setupImages() ;

	}
	//akkdajakdjsdjaksj
	private void setupImages() {
		for(int i = 0; i < sprites.length; i++) {



			sprites[i] = parent.loadImage("art/robot" + i + ".png");
		}
	}

	public void setMoving(boolean b) {
		moving = b;
	}

	@Override
	public void behavior() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(float imageX, float imageY) {

		if(moving) {
			if(changeTime <= parent.millis()) {
				animationIndex++;
				changeTime = parent.millis() + 100;
			}

			if(animationIndex >= sprites.length)
				animationIndex = 0;


		}
		else {
			animationIndex = 0;
		}


		if(moving) {
			if(changeTime <= parent.millis()) {
				animationIndex++;
				changeTime = parent.millis() + 100;
			}

			if(animationIndex >= sprites.length)
				animationIndex = 0;


		}
		else {
			animationIndex = 0;
		}

	
		parent.imageMode(parent.CENTER);
		
	
		int rotationDegrees = 0;

		if(direction.equals("up"))
			rotationDegrees = 0;
		else if(direction.equals("right"))
			rotationDegrees = 90;
		else if(direction.equals("down"))
			rotationDegrees  = 180 ;
		else if(direction.equals("left"))
			rotationDegrees = 270;
		
		rotationDegrees++;
		
		parent.translate(imageX,imageY);

		parent.rotate(PApplet.radians(rotationDegrees));


		System.out.println(direction);
		parent.image(sprites[animationIndex], 0, 0);
		

		parent.rotate(PApplet.radians(rotationDegrees * -1));
//
		parent.translate(imageX * -1 ,imageY * -1 );

		parent.imageMode(parent.CORNER);

		// TODO Auto-generated method stu

	}

	public void setDirection(String s) {
		direction = s;
	}

	public int getCompost() {return compost;}
	public int getPlastic() {return plastic;}


}
