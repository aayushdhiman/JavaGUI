import javax.swing.*;
import java.awt.*;

public class Display05 extends JPanel {
	private JLabel answer;
	private int numAns;

	public Display05() {
		setLayout(new FlowLayout());
		setBackground(Color.BLACK);

		answer = new JLabel("Ask and you shall recieve");

		answer.setForeground(Color.white);
		//answer.setOpaque(true);
		
		add(answer);

	}

	public void update() {
		numAns =(int) Math.ceil(Math.random() * 3);
		if(numAns == 1) {
			answer.setText("Yes, of course.");
		}else if(numAns == 2) {
			answer.setText("No, never.");
		}else if(numAns == 3) {
			answer.setText("Reply hazy, try again.");
		}
	}
}