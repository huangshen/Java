package shenh.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingConsole {
	public static void run(final JFrame f, final int width, final int height) {
		f.setTitle(f.getClass().getSimpleName());
		f.setSize(width, height);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);		
	}
}

public class Button1 extends JFrame {
	private JButton
	b1 = new JButton("Button1"),
	b2 = new JButton("Button2");
	private JTextField
	txt = new JTextField("init value");
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String name = ((JButton)e.getSource()).getText();
			txt.setText(name);
		}
	}
	private ButtonListener bl = new ButtonListener();
	
	public Button1() {
		b1.addActionListener(bl);
		b2.addActionListener(bl);
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(txt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingConsole.run(new Button1(), 100, 200);
	}

}
