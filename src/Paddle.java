import java.awt.*;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
public class Paddle extends GameShapes {

	Paddle(int x, int y) {
		
		setX(x);
		setY(y);
		setWidth(15);
		setHeight(125);
		System.out.println("Hello");
	}
	
	

	@Override
	// self explanatory; draws the shape.
	void draw(JPanel panel, Graphics g) {
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		move(panel);
	}
	@Override
	void move(JPanel panel) {
		/* Still need to figure out how I am going to approach the movement for the paddle; will I use
		mouse listeners, or listeners for certain keystrokes... or both?*/
		if (isUpPressed()) {
			setX(this.getX());
			setY(getY()-3);
		}
		if (isDownPressed()) {
			setX(this.getX());
			setY(getY()+3);
		}
		
	}
}
