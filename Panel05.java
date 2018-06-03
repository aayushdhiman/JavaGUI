   //Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 4.4.2003

   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel05 extends JPanel
   {
      private Display05 dis;
      private JTextField box;
      public Panel05()
      {
         setLayout(new FlowLayout());
      
         box = new JTextField("Enter question here...");
         add(box);
         
         JButton button = new JButton("Ask?");
         button.addActionListener(new Listener());
         add(button);
         
         dis = new Display05();
         add(dis);
      }
      private class Listener implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            dis.update();
         }
      }
   }