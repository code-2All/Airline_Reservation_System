package Ams;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.*;
import javax.swing.text.View;
import java.awt.*;
import java.awt.event.*;



public class Updata_data extends JFrame implements ActionListener {

    Font f,f1;
    Choice ch;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JButton bt1,bt2;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;



    JPanel p1,p2,p3;
        Updata_data() {

            super("Update Passenger");

            setLocation(450, 10);

            setSize(740, 600);

            f=new Font("Arial",Font.BOLD,25);
            f1=new Font("Arial",Font.BOLD,18);

            ch = new Choice();

            try {
                ConnectionClass obj = new ConnectionClass();
                String q = "select UserName from passenger";
                ResultSet rest = obj.sta.executeQuery(q);
                while (rest.next()) {
                    ch.add(rest.getString("UserName"));
                }
            } catch( Exception e)
                {
                    e.printStackTrace();
                }

                    l1 = new JLabel("Update Passenger details");
                    l2 = new JLabel("UserName");
                    l3 = new JLabel("Name");
                    l4 = new JLabel("Age");
                    l5 = new JLabel("Dob");
                    l6 = new JLabel("Address");
                    l7 = new JLabel("Phone");
                    l8 = new JLabel("Email");
                    l9 = new JLabel("Nationality");
                    l10 = new JLabel("Gender");
                    l11 = new JLabel("passport");

                    tf1 = new JTextField();
                    tf2 = new JTextField();
                    tf3 = new JTextField();
                    tf4 = new JTextField();
                    tf5 = new JTextField();
                    tf6 = new JTextField();
                    tf7 = new JTextField();
                    tf8 = new JTextField();
                    tf9 = new JTextField();

                    bt1 = new JButton("Update Passenger");
                    bt2 = new JButton("Back");

                    l1.setHorizontalAlignment(JLabel.CENTER);

                    bt1.addActionListener(this);
                    bt2.addActionListener(this);

                    p1 = new JPanel();
                    p1.setLayout(new GridLayout(1, 1, 10, 10));
                    p1.add(l1);

                    p2 = new JPanel();
                    p2.setLayout(new GridLayout(11, 2, 10, 10));

                    p2.add(l2);
                    p2.add(ch);
                    p2.add(l3);
                    p2.add(tf1);
                    p2.add(l4);
                    p2.add(tf2);
                    p2.add(l5);
                    p2.add(tf3);
                    p2.add(l6);
                    p2.add(tf4);
                    p2.add(l7);
                    p2.add(tf5);
                    p2.add(l8);
                    p2.add(tf6);
                    p2.add(l10);
                    p2.add(tf8);
                    p2.add(l11);
                    p2.add(tf9);
                    p2.add(bt1);
                    p2.add(bt2);

                    p3 = new JPanel();
                    p3.setLayout(new GridLayout(1, 1, 10, 10));

                    ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Ams/icons/istockphoto-155439315-612x612.jpg"));
                    Image i1 = img.getImage().getScaledInstance(300, 500, Image.SCALE_SMOOTH);
                    ImageIcon img2 = new ImageIcon(i1);
                    l12 = new JLabel(img2);

                    p3.add(l12);

                    setLayout(new BorderLayout(10, 10));
                    add(p1, "North");
                    add(p2, "Center");
                    add(p3, "West");

                    ch.addMouseListener(new MouseAdapter()
                    {
                        public void mouseClicked(MouseEvent arg0)
                        {
                            try
                            {
                                ConnectionClass obj2 = new ConnectionClass();
                                String username = ch.getSelectedItem();
                                String q1 = "Select * from passenger where username='"+username+"'";
                                ResultSet rest1 = obj2.sta.executeQuery(q1);
                                while(rest1.next())
                                {
                                    tf1.setText(rest1.getString("name"));
                                    tf2.setText(rest1.getString("age"));
                                    tf3.setText(rest1.getString("dob"));
                                    tf4.setText(rest1.getString("address"));
                                    tf5.setText(rest1.getString("phone"));
                                    tf6.setText(rest1.getString("email"));

                                    tf7.setText(rest1.getString("nationality"));
                                    tf8.setText(rest1.getString("gender"));
                                    tf9.setText(rest1.getString("passport"));


                                }

                            } catch (Exception e) {
                             e.printStackTrace();
                            }
                        }
                    });
                }
            @Override
            public void actionPerformed(ActionEvent e) {
            if(e.getSource()==bt1)
            {
                String username = ch.getSelectedItem();
                String name = tf1.getText();
                String age =tf2.getText();
                String dob  = tf3.getText();
                String address = tf4.getText();
                String phone = tf5.getText();
                String email =tf6.getText();
                String nationality = tf7.getText();
                String gender =tf8.getText();
                String passport =tf9.getText();

                try {
                    ConnectionClass obj3 = new ConnectionClass();
                    String q1 = "update passenger set name='" + name + "',age='" + age + "',dob='" + dob + "',address='" + address + "',phone='" + phone + "',email='" + email + "',nationality='" + nationality + "',gender='" + gender + "',passport='" + passport + "'where username='" + username + "'";
                    int aa = obj3.sta.executeUpdate(q1);
                    if (aa == 1) {
                        JOptionPane.showMessageDialog(null, "Your data update successfully");
                        this.setVisible(false);
                        new viewpassanger().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please!, Fill the all details carefully");
                    }


                } catch (SQLException ex) {
                   ex.printStackTrace();
                }
            }
            if(e.getSource()==bt2)
            {
                this.setVisible(false);
            }

        }
    public static void main(String args[])
    {
        new Updata_data().setVisible(true);
    }


}
