import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class enter_details_JPanel extends JPanel{
  private JTextField fname_textfield, lname_textfield, mobile_no_textfield, address_textfield, area_textField;
  enter_details_JPanel(){
    fname_textfield = new JTextField("First Name", 15);
    lname_textfield = new JTextField("Last Name", 15);
    mobile_no_textfield = new JTextField("Mobile", 10);
    address_textfield = new JTextField("Address(Optional)", 20);
    area_textField = new JTextField("Area", 10);

    add(fname_textfield);
    add(lname_textfield);
    add(mobile_no_textfield);
    add(address_textfield);
    add(area_textField);
  }


}
