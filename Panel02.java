import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel02 extends JPanel {
	private JLabel label; // a private field

	public Panel02() {
		setLayout(new FlowLayout());

		JButton randomButton = new JButton("Random"); // local
		randomButton.addActionListener(new RandomListener());
		add(randomButton);
		
		JButton cbRtButton = new JButton("Cube Root"); // local
		cbRtButton.addActionListener(new CubeRootListener());
		add(cbRtButton);
		
		JButton reciButton = new JButton("Reciprocal"); // local
		reciButton.addActionListener(new ReciprocalListener());
		add(reciButton);
		
		JButton quitButton = new JButton("Quit"); // local
		quitButton.addActionListener(new QuitListener());
		add(quitButton);
		
		label = new JLabel("0.0");
		label.setFont(new Font("Serif", Font.BOLD, 20));
		label.setForeground(Color.BLUE);
		add(label);
	}

	private class RandomListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double x = Math.random(); // local variable
			label.setText("" + x);
		}
	}
	
	private class CubeRootListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double d = Double.parseDouble(label.getText());
			if(d > 0) {
				d = Math.cbrt(d);	
				label.setText(d + "");
			}else {
				label.setText(d + "i");
			}
		}
	}
	
	
	private class ReciprocalListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double d = Double.parseDouble(label.getText());
				d = 1.0/d;	
				label.setText(d + "");			
		}
	}
	
	private class QuitListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);			
		}
	}
}