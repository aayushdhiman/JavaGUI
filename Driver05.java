
//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
//version 4.4.2003

import javax.swing.JFrame;

public class Driver05 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Magic 8Ball");
		frame.setSize(200, 250);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel05());
		frame.setVisible(true);
	}
}