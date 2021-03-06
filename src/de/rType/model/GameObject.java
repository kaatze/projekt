package de.rType.model;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;


abstract public class GameObject {
	private int x;
	private int y;
	private Rectangle hitbox;
	private Image image;
	private int speed;
	private int hp;	//Healthpoints


	public GameObject(int x, int y, String image, int speed, int hp) {
		this.x = x;
		this.y = y;
		ImageIcon i = new ImageIcon(this.getClass().getResource(image));
		this.image = i.getImage();
		this.speed = speed;
		this.hp = hp;
		this.hitbox = new Rectangle(x,y,this.image.getWidth(null),this.image.getHeight(null));
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Rectangle getHitbox() {
		hitbox.setLocation(x,y);
		return hitbox;
	}

	public void setHitbox(Rectangle hitbox) {
		this.hitbox = hitbox;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void move() {
        x += speed;
        if (x > 1200 || x < 0) {
        }
            
	}
	
	public boolean isAlive() {
		return (hp > 0);
	}
	
	public void hit() {
		hp--;
	}
}
