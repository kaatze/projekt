package de.rType.model;


public class Alien extends GameObject{

	int height;

    public Alien(int x, int y) {
    	super(x,y,"../resources/alien.png",-2,1);
    	height = y;
    }
    
    @Override
    public void move() {
    	super.move();
    	
    	int tempY = (int)(Math.sin(getX()*1/50)*50 +height);
    	if(tempY < 8) {
    		tempY = 8; 
    	}
    	else if(tempY > 715) {
    		tempY = 715;
    	}
    	System.out.println(tempY);
    	setY(tempY);
    }
}