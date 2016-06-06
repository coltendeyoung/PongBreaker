import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
public class drawPanel extends JPanel implements ActionListener {
	private final int DELAY=5;
	private ArrayList<GameShapes> shapes = new ArrayList<GameShapes>();
	Timer t = new Timer(DELAY,this);
	Random r = new Random();
	GameShapes s = new Ball();
	GameShapes p1 = new Paddle(20,25);
	GameShapes p2 = new Paddle(460,40); // going to adjust this so that it changes based on window resizing
	GameShapes box = new Box(150,160,50,50);
	
	public drawPanel(){
		// starting the timer
		t.start();
		// adding the base shapes to the array of GameShapes
		shapes.add(s);
		shapes.add(p1);
		shapes.add(p2);
		shapes.add(box);
		System.out.println(box.equals(p1));
		this.setFocusable(true);
		this.addKeyListener(new KeyAdapter() {
			/* the following is the code for the paddle movement.
			 */
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch( keyCode ) { 
					case KeyEvent.VK_UP:
						p1.UpPressed(true);
						break;
					case KeyEvent.VK_DOWN:
						p1.DownPressed(true);
						break;
					case KeyEvent.VK_W:
							p2.UpPressed(true);
						break;
					case KeyEvent.VK_S :
						p2.DownPressed(true);
						break;
     }
} 
	        public void keyReleased(KeyEvent e) {
	        	int keyCode = e.getKeyCode();
				switch( keyCode ) { 
					case KeyEvent.VK_UP:
						p1.UpPressed(false);
						break;
					case KeyEvent.VK_DOWN:
						p1.DownPressed(false);
						break;
					case KeyEvent.VK_W:
							p2.UpPressed(false);
						break;
					case KeyEvent.VK_S :
						p2.DownPressed(false);
						break;
     }
	        		
	        }
	        
	        
	       
	    });
	}
	
	
	@Override
		public void paintComponent(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;

		super.paintComponent(g2d);
		this.setBackground(Color.BLACK);
		g.setColor(Color.GREEN);
		
		for(GameShapes s: shapes) {
			for(GameShapes ge: shapes)
				checkCollision(ge,s);
				
			s.draw(this, g2d);
		}
	}
	
				
	
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	void checkCollision(GameShapes s, GameShapes g){ 
		if(!g.equals(s) && !s.equals(g)) {
			if ((g.getX()+g.getWidth()+g.getY()+g.getHeight()) == (s.getX()+s.getWidth()+s.getY()+s.getHeight())) {
				g.setdx(-g.getdx());
				g.setdy(-g.getdy());
				s.setdx(-s.getdx());
				s.setdy(-s.getdy());
				System.out.println("Collide");
			}
				
		}

			
			
		}
	}






