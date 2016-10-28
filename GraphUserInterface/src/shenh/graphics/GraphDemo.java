package shenh.graphics;

import javax.swing.*;
import java.util.concurrent.*;
import java.util.*;

public class GraphDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello!");
		JLabel label = new JLabel("A label");
		
		// JLabel & JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.add(label);
		frame.setVisible(true);
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (Exception ex) {
			
		}
		label.setText("Changed");
		System.out.println("Program exit.");
	}
}
