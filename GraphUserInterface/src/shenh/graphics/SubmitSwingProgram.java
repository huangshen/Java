package shenh.graphics;

import javax.swing.*;
import java.util.concurrent.*;


public class SubmitSwingProgram extends JFrame {
	JLabel label;
	
	public SubmitSwingProgram() {
		JFrame frame;
		setTitle("Submit Swing Program");
		setLocation(100, 100);
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel();
		label.setText("A label.");
		add(label);
		setVisible(true);
	}

	static SubmitSwingProgram ssp;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SubmitSwingProgram start...");
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ssp = new SubmitSwingProgram();
			}
		});
		
		TimeUnit.SECONDS.sleep(2);
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ssp.label.setText("Changed.");
			}
		});
	}

}
