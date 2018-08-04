import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class buttons_JPanel extends JPanel{
  private JButton add_button, delete_button, edit_button;
  buttons_JPanel(){
    add_button = new JButton("Add Student");
    delete_button = new JButton("Delete Entry");
    edit_button = new JButton("Edit Entry");

    add_button.setActionCommand("add");
    delete_button.setActionCommand("delete");
    edit_button.setActionCommand("edit");

    //adding listeners..
    buttonActionListener actionListener = new buttonActionListener();
    add_button.addActionListener(actionListener);
    delete_button.addActionListener(actionListener);
    edit_button.addActionListener(actionListener);

    add(add_button);
    add(delete_button);
    add(edit_button);

    delete_button.setEnabled(false);
    edit_button.setEnabled(false);
    add_button.setEnabled(false);





  }
}
