import javax.swing.*;
import java.awt.*;

public class Odometer extends JPanel {
	private JLabel hundsL;
	private JLabel tensL;
	private JLabel onesL;
	private int ones;
	private int tens;
	private int hundreds; 
	private int total;

	public Odometer() {
		setLayout(new FlowLayout());
		setBackground(Color.BLACK);
		hundsL = new  JLabel();
		tensL = new  JLabel();
		onesL = new  JLabel();
		
		hundsL.setForeground(Color.WHITE);
		tensL.setForeground(Color.WHITE);
		onesL.setForeground(Color.BLACK);
		
		hundsL.setText(hundreds + "");
		tensL.setText(tens + "");
		onesL.setText(ones + "");
		
		onesL.setOpaque(true);
		
		add(hundsL);
		add(tensL);
		add(onesL);
		
	}

	public void update()
      {
    	  total++;
    	  hundreds = total/100;
    	  tens = (total % 100)/10;
    	  ones = total % 10;
    	  
    	  hundsL.setText(hundreds + "");
    	  tensL.setText(tens + "");
    	  onesL.setText(ones + "");
      
      }
}