   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.4.2003

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel04 extends JPanel
   {
      private Odometer odometer;
      public Panel04()
      {
         setLayout(new FlowLayout());
      
         odometer = new Odometer();
         add(odometer);
      
         JButton button = new JButton("Step");
         button.addActionListener(new Listener());
         add(button);
      }
      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            odometer.update();
         }
      }
   }