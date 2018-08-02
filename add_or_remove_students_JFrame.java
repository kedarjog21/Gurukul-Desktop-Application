import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class add_or_remove_students_JFrame extends JFrame{


   add_or_remove_students_JFrame(){

    setLayout(new FlowLayout());
    setVisible(true);
    setSize(new Dimension(950, 600));

    //adding panels to frame..
    add(new enter_details_JPanel());
    add(new buttons_JPanel());
    add(new table_JPanel());
  }

}
