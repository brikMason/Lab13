package lab13;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ColorGeneratorTest {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
		{
			public void run() {
				colorGenerator frame = new colorGenerator();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		}
);

	}

}