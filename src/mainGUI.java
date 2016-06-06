import javax.swing.JFrame; 
import javax.swing.JPanel;
public class mainGUI {
	private JFrame mainframe;
	private JPanel p;
	private final int WIDTH = 500, HEIGHT = 500;
	public mainGUI() {
		initialize();
	}
	
	private void initialize() {
		p = new drawPanel();
		mainframe = new JFrame("PongBreaker");
		mainframe.setSize(WIDTH,HEIGHT);
		mainframe.setVisible(true);
		mainframe.add(p);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new mainGUI();
	}
}
