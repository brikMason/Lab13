package lab13;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class colorGenerator extends JFrame {

	private JPanel buttonPanel;
	private int numClicks = 0;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;

	public colorGenerator() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setTitle("Color Generator");

		// create buttons
		JButton changeButton = new JButton("Change");
		JButton resetButton = new JButton("Reset");
		JButton closeButton = new JButton("Close");

		buttonPanel = new JPanel();

		// add buttons to panel
		buttonPanel.add(changeButton);
		buttonPanel.add(resetButton);
		buttonPanel.add(closeButton);

		// add panel to frame
		add(buttonPanel);

		// associate actions with buttons
		changeButton.addActionListener(new ChangeAction());
		resetButton.addActionListener(new ResetAction());
		closeButton.addActionListener(new CloseListener());
	}

	public Color setColor() {
		numClicks = numClicks % 4;
		if (numClicks == 0) {
			return Color.PINK;
		} else if (numClicks == 1) {
			return Color.BLACK;
		} else if (numClicks == 2) {
			return Color.GREEN;
		} else {
			return Color.ORANGE;
		}
	}

	// An action listener that sets the panel's background color
	private class ChangeAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			numClicks++;
			buttonPanel.setBackground(setColor());
		}
	}

	// An action listener that resets the panel's background color
	private class ResetAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			numClicks = 0;
			buttonPanel.setBackground(Color.LIGHT_GRAY);
		}
	}

	// An action listener that closes the panel
	private class CloseListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// DO SOMETHING, PERHAPS CLOSE?
			System.exit(0);
		}
	}

}
