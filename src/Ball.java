import javax.swing.JPanel;
import java.util.Random;
import java.awt.*;
public class Ball extends GameShapes {
	Random rand = new Random();
	
	Ball() {
		setWidth(30);
		setHeight(30);
		setX(350);
		setY(40);
	}
	
	void draw(JPanel panel, Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		move(panel);
		g2d.fillOval(getX(), getY(), getWidth(), getHeight());
	}
	
	void move(JPanel panel) {
		
		if (getX() + getWidth() < 0)
			setdx(getSpeed());
		else if (getX() + getWidth() > panel.getWidth())
			setdx(-getSpeed());
		if (getY() +getHeight() < 0)
			setdy(getSpeed());
		else if  (getY()+getHeight() > panel.getHeight())
			setdy(-getSpeed());
		
		
		
		setX(getX() + getdx());
		setY(getY()+getdy());
	}
		
	


}
