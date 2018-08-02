import java.util.*;
import javax.swing.*;

public class HomePage extends JFrame
  { 
  	JFrame frame;

  	HomePage()
  	 { 
  	 	setTitle(" GURUKUL ");  // Title for window

  	    JButton button1 = new JButton(" Worksheet ");	//creating Button 1 
        JButton button2 = new JButton(" Payment ");
        JButton button3 = new JButton(" Add/Modify ");

        button1.setBounds(350,135,215,55);
        button2.setBounds(350,200,215,55);
        button3.setBounds(350,265,215,55);

        add(button1);
        add(button2);
        add(button3);
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950,450);


        setLayout(null);
        setVisible(true);


  	   }
        
     public static void main(String args[])
       {
       	  new HomePage();
       }

    }
