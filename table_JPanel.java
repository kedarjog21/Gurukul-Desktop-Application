import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class table_JPanel extends JPanel{
  private JTable student_details_table;
  table_JPanel(){
    student_details_table = new JTable(10, 6);
    add(student_details_table);

  }
}
