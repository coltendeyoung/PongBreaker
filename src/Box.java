import java.awt.*;
import javax.swing.JPanel;
public class Box extends GameShapes {
	private int hp;
	private boolean status;
	// constructor for the Box
	Box(int x, int y, int width, int height) {
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}
	
	// Accessor and mutator methods
	
	@Override
	void draw(JPanel panel,Graphics g) {
		g.fillRect(getX(), getY(),  getWidth(), getHeight());
		move(panel);
	}
	@Override
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
