package shenh.graphics;

import javax.swing.*;
import java.util.concurrent.*;

public class GraphDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello!");
		JLabel label = new JLabel("A label");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.add(label);
		frame.setVisible(true);
		//TimeUnit.SECONDS.sleep(2);
		label.setText("Changed");
	}

}
