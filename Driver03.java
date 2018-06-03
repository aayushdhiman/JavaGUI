import javax.swing.JFrame;

public class Driver03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hailstone");
		frame.setSize(500, 100);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel03());
		frame.setVisible(true);
	}
}