package Ams;
import  java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;
import javax.swing.*;


public class Book_Flight1 extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JButton bt1,bt2;
    JPanel p1,p2,p3;
    JTextField tf1,tf2,tf3,tf4,tf5;
    Font f,f1;
    Choice ch1,ch2,ch3,ch4,ch5,ch6;


    Book_Flight1() {
        super("Book Airlines India Flights");
        setLocation(50, 10);
        setSize(1100, 650);

        f = new Font("Arial", Font.BOLD, 25);
        f1 = new Font("Arial", Font.BOLD, 18);

        ch1 = new Choice();
        ch2 = new Choice();
        ch3 = new Choice();
        ch4 = new Choice();
        ch5 = new Choice();
        ch6 = new Choice();

        try {
            ConnectionClass obj = new ConnectionClass();
            String q = "Select distinct Source from flight";
            ResultSet rest = obj.sta.executeQuery(q);
            while (rest.next()) {
                ch1.add(rest.getString("source"));
            }
            rest.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            ConnectionClass obj = new ConnectionClass();
            String q = "Select UserName Source from passanger";
            ResultSet rest = obj.sta.executeQuery(q);
            while (rest.next()) {
                ch2.add(rest.getString("UserName"));
            }
            rest.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        l1 = new JLabel("Book Airline India Flight");
        l2 = new JLabel("TicketId");
        l3 = new JLabel("Source");
        l4 = new JLabel("Destination");
        l5 = new JLabel("Class");
        l6 = new JLabel("Price");
        l7 = new JLabel("FlightName");
        l8 = new JLabel("FlighDate");
        l9 = new JLabel("FlightTime");
        l10 = new JLabel("UserName");
        l11 = new JLabel("Name");

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();

        tf1.setEditable(false);
        tf2.setEditable(false);

        tf5.setEditable(false);


        Random r = new Random();
        tf1.setText("" + Math.abs(r.nextInt() % 100000));
        tf1.setForeground(Color.RED);

        bt1 = new JButton("Book Flight");
        bt2 = new JButton("Back");


        bt1.addActionListener(this);
        bt2.addActionListener(this);

        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(new java.awt.Color(232, 2, 125));

        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        l5.setFont(f1);
        l6.setFont(f1);
        l7.setFont(f1);
        l8.setFont(f1);
        l9.setFont(f1);
        l10.setFont(f1);

        ch1.setFont(f1);
        ch2.setFont(f1);
        ch3.setFont(f1);
        ch4.setFont(f1);
        ch5.setFont(f1);
        ch6.setFont(f1);

        tf1.setFont(f1);
        tf2.setFont(f1);
        tf3.setFont(f1);
        tf4.setFont(f1);
        tf5.setFont(f1);

        bt1.setFont(f1);
        bt1.setFont(f1);


        l2.setForeground(new java.awt.Color(103, 3, 173));
        l3.setForeground(new java.awt.Color(103, 3, 173));
        l4.setForeground(new java.awt.Color(103, 3, 173));
        l5.setForeground(new java.awt.Color(103, 3, 173));
        l6.setForeground(new java.awt.Color(103, 3, 173));
        l7.setForeground(new java.awt.Color(103, 3, 173));
        l8.setForeground(new java.awt.Color(103, 3, 173));
        l9.setForeground(new java.awt.Color(103, 3, 173));
        l10.setForeground(new java.awt.Color(103, 3, 173));
        l11.setForeground(new java.awt.Color(103, 3, 173));

        bt1.setBackground(new java.awt.Color(232, 2, 125));
        bt2.setBackground((Color.BLACK));
        bt1.setForeground(new java.awt.Color(232, 2, 125));
        bt2.setForeground((Color.BLACK));


    }
        public void actionPerformed(ActionEvent e)
        {

          }
    public static void main(String args[])
    {
        new Book_Flight1().setVisible(true);
        }
    }


