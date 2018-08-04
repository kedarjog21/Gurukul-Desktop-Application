import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class table_JPanel extends JPanel{
  private JTable student_details_table;


  table_JPanel(){
    String columnNames[] = {"First Name", "Last Name", "Mobile", "Address", "Area"};
    String rowTemp[][] = {{"Omkar", "Borkar", "8169749255", "F-11 Shanti Society", "Mahim"}, {"Kedar", "Jog", "9594885551", "Shahajiraje Road", "Vile Parle"},
  {"Shivani", "Datar", "9930199292", " ",  "Dombivali"} };

    student_details_table = new JTable(rowTemp, columnNames);
    add(new JScrollPane(student_details_table));


  }
}
