
package GUI_BASICS;
import javax.swing.JFrame; 

public class MyFrame {
	
	// Create a frame
	JFrame frame = new JFrame("MyFrame"); 
	
	// set the size
	frame.setSize(400, 300);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
}
