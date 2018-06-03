import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel03 extends JPanel {
	private JLabel label; // a private field
	private JLabel iteration; // a private field
	private int hailstone = (int)(Math.random()*100) + 1;
	private int iterations = 0;
	private JTextField box;

	public Panel03() {
		setLayout(new FlowLayout());
		
		label = new JLabel("0.0");
		label.setFont(new Font("Serif", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		add(label);
		
		box = new JTextField("0.0", 10);
		box.setHorizontalAlignment(SwingConstants.RIGHT);
		add(box);

		JButton setButton = new JButton("Set"); // local
		setButton.addActionListener(new SetListener());
		add(setButton);
		
		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new NextListener());
		add(nextButton);
		
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(new QuitListener());
		add(quitButton);
		
		
		iteration = new JLabel("0");
		iteration.setFont(new Font("Serif", Font.BOLD, 20));
		iteration.setForeground(Color.BLUE);
		add(iteration);
		
	}

	private class SetListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			label.setText(box.getText());
		}
	}
	
	private class NextListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(hailstone % 2 == 0) {
				hailstone = hailstone * 2;
				iterations++;
				label.setText(hailstone + "");
				iteration.setText("Iterations = " + iterations + "");
			}else {
				hailstone = hailstone * 3 + 1;
				iterations++;
				label.setText(hailstone + "");
				iteration.setText("Iterations = " + iterations + "");
			}
		}
	}
	
	private class QuitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}