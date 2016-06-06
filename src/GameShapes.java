import java.awt.*;
import javax.swing.JPanel;
public abstract class GameShapes {
	// variables to store the coordinates of the shape(s)
	private int x, y;
	// variables to store the dimensions of the shape(s)
	private int width, height;
	// declaring a random variable 
	private Color[] colors = {Color.BLUE, Color.RED, Color.MAGENTA, Color.GREEN};
	
	// accessor/mutator methods
	
	private boolean upPressed, downPressed;
	private int SPEED = 2;
	private int dx = SPEED, dy = SPEED;
	
	public void UpPressed(boolean upIsPressed) {
		this.upPressed = upIsPressed;
	}
	
	public void DownPressed(boolean downIsPressed) {
		this.downPressed = downIsPressed;
		
	}
	
	public void setSpeed(int SPEED) {
		this.SPEED = SPEED;
	}
	public void setdx(int dx) {
		this.dx = dx;
	}
	
	public void setdy(int dy) {
		this.dy = dy;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean isUpPressed() {
		return this.upPressed;
	}
	
	public boolean isDownPressed() {
		return this.downPressed;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	
	public int getdx() {
		return this.dx;
	}
	
	public int getdy() {
		return this.dy;
	}
	
	public int getSpeed() {
		return this.SPEED;
	}
	// abstract methods
	abstract void draw(JPanel panel, Graphics g); 
	abstract void move(JPanel panel);
	
}
