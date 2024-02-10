package Ams;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.util.EventObject;

public class Book_Flight implements ActionListener{

    JButton jButton1;
    JButton jButton2;
    JFrame jFrame;
    JTextField jTextField, jTextField1, jTextField2, jTextField3, jTextField4, jTextField6, jTextField7,
            jTextField8, jTextField9, jTextField10;

    Book_Flight() {


        jFrame = new JFrame("Book Flight");
        jFrame.setLayout(null);
        jFrame.setSize(900, 700);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel10 = new JLabel();
        jLabel10.setBounds(0, 0, 450, 700);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Ams/icons/360_F_71318503_9g1UATIOZzwELZg2DZb7w4oaVyenhQkh-removebg-preview.png"));
        Image i1 = img.getImage().getScaledInstance(460, 600, Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(i1);
        jLabel10.setIcon(img2);
        jFrame.add(jLabel10);

        JLabel jLabel15 = new JLabel("Book Your Flights");
        jLabel15.setBounds(150, 12, 300, 40);
        jLabel15.setFont(new Font("Arial", Font.BOLD, 30));
        jFrame.add(jLabel15);


        JLabel jLabel = new JLabel("Ticket Id");
        jLabel.setBounds(450, 10, 200, 100);
        jLabel.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel.setForeground(Color.RED);
        jFrame.add(jLabel);


        JTextField jTextField = new JTextField();
        jTextField.setBounds(670, 45, 180, 30);
        jFrame.add(jTextField);

        JLabel jLabel1 = new JLabel("Source");
        jLabel1.setBounds(450, 60, 200, 100);
        jLabel1.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel1.setForeground(Color.RED);
        jFrame.add(jLabel1);

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(670, 95, 180, 30);
        jFrame.add(jTextField1);

        String city[] = {"delhi", "Lucknow", "Mumbai", "Kolkaata", "Dehradun"};
        JComboBox jComboBox = new JComboBox(city);
        jComboBox.setBounds(670, 95, 180, 30);
        jFrame.add(jComboBox);


        JLabel jLabel2 = new JLabel("Destination");
        jLabel2.setBounds(450, 110, 200, 100);
        jLabel2.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel2.setForeground(Color.RED);
        jFrame.add(jLabel2);

        JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(670, 145, 180, 30);
        jFrame.add(jTextField2);

        String city1[] = {"Raachi", "Dehradun", "Patna", "Kathmaandu", "Shrinagar", "Jamshedpur"};
        JComboBox jComboBox1 = new JComboBox(city1);
        jComboBox1.setBounds(670, 145, 180, 30);
        jFrame.add(jComboBox1);


        JLabel jLabel3 = new JLabel("Class");
        jLabel3.setBounds(450, 160, 200, 100);
        jLabel3.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel3.setForeground(Color.RED);
        jFrame.add(jLabel3);

        JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(670, 195, 180, 30);
        jFrame.add(jTextField3);


        JLabel jLabel4 = new JLabel("Price");
        jLabel4.setBounds(450, 210, 200, 100);
        jLabel4.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel4.setForeground(Color.RED);
        jFrame.add(jLabel4);

        JTextField jTextField4 = new JTextField();
        jTextField4.setBounds(670, 245, 180, 30);
        jFrame.add(jTextField4);


        JLabel jLabel5 = new JLabel("Flight Code");
        jLabel5.setBounds(450, 260, 200, 100);
        jLabel5.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel5.setForeground(Color.RED);
        jFrame.add(jLabel5);

        JTextField jTextField5 = new JTextField();
        jTextField5.setBounds(670, 295, 180, 30);
        jFrame.add(jTextField5);


        JLabel jLabel6 = new JLabel("Flight Name");
        jLabel6.setBounds(450, 310, 200, 100);
        jLabel6.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel6.setForeground(Color.RED);
        jFrame.add(jLabel6);

        JTextField jTextField6 = new JTextField();
        jTextField6.setBounds(670, 345, 180, 30);
        jFrame.add(jTextField6);


        JLabel jLabel7 = new JLabel("Journey Date");
        jLabel7.setBounds(450, 360, 200, 100);
        jLabel7.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel7.setForeground(Color.RED);
        jFrame.add(jLabel7);

        JTextField jTextField7 = new JTextField();
        jTextField7.setBounds(670, 395, 180, 30);
        jFrame.add(jTextField7);

        JLabel jLabel8 = new JLabel("Journey Time");
        jLabel8.setBounds(450, 410, 200, 100);
        jLabel8.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel8.setForeground(Color.RED);
        jFrame.add(jLabel8);

        JTextField jTextField8 = new JTextField();
        jTextField8.setBounds(670, 445, 180, 30);
        jFrame.add(jTextField8);

        JLabel jLabel9 = new JLabel("Username");
        jLabel9.setBounds(450, 460, 200, 100);
        jLabel9.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel9.setForeground(Color.RED);
        jFrame.add(jLabel9);

        JTextField jTextField9 = new JTextField();
        jTextField9.setBounds(670, 495, 180, 30);
        jFrame.add(jTextField9);

        JLabel jLabel11 = new JLabel("Name");
        jLabel11.setBounds(450, 510, 200, 100);
        jLabel11.setFont(new Font("Arial", Font.BOLD, 20));
        jLabel11.setForeground(Color.RED);
        jFrame.add(jLabel11);

        JTextField jTextField10 = new JTextField();
        jTextField10.setBounds(670, 545, 180, 30);
        jFrame.add(jTextField10);

        jButton1 = new JButton("Book Cab");
        jButton1.setBounds(450, 600, 180, 30);
        jButton1.setBackground(Color.RED);
        jFrame.add(jButton1);

        jButton2 = new JButton("Back");
        jButton2.setBounds(670, 600, 180, 30);
        jButton2.setBackground(Color.RED);
        jFrame.add(jButton2);

        jButton1.addActionListener(this);
        jButton2.addActionListener(this);

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);


        jFrame.setVisible(true);
    }





//        jButton1.addActionListener(new ActionListener() {
            @Override




        public void actionPerformed (ActionEvent e) {
                if (e.getSource() == jButton1)

                    try {

                        ConnectionClass conn = new ConnectionClass();
                        String TicketId = jTextField.getText();
                        String Source = jTextField1.getText();
                        String Destination = jTextField2.getText();
                        String Class = jTextField3.getText();
                        String Price = jTextField4.getText();
                        String FlightName = jTextField6.getText();
                        String FlightDate = jTextField7.getText();
                        String FlighTime = jTextField8.getText();
                        String UserName = jTextField9.getText();
                        String Name = jTextField10.getText();


                        PreparedStatement pst = conn.conn.prepareStatement("INSERT INTO  bookflight(TicketId,Source,Destination,Class,Price,FlightName,FlightDate,FlighTime,UserName,Name) values(?,?,?,?,?,?,?,?,?,?)");

                        pst.setString(1, TicketId);  // indexing starting from 0 in db
                        pst.setString(2, Source);

                        pst.setString(3, Destination);
                        pst.setString(4, Class);
                        pst.setString(5, Price);
                        pst.setString(6, FlightName);
                        pst.setString(7, FlightDate);
                        pst.setString(8, FlighTime);
                        pst.setString(9, UserName);
                        pst.setString(10, Name);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Ticket Confirm successfully");
                        new Book_Flight();
                        jFrame.setVisible(false);

                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }






                if (e.getSource() == jButton2) {
                    JOptionPane.showMessageDialog(null, "Are U Sure");
                    new Home_Page().setVisible(true);
                    jFrame.setVisible(false);
                }

            }
//    });
//    }
    public static void main(String args[])
    {
       Book_Flight obj = new Book_Flight();
    }


    public void setVisible(boolean b) {
        setVisible(true);
    }
}
