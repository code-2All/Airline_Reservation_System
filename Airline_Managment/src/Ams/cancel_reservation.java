package Ams;
import javax.swing.*;
//import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class cancel_reservation extends JFrame{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JButton bt1,bt2;
    JPanel p1,p2,p3;
    JTextField tf1, tf2, tf3, tf4,tf5,tf6,tf7,tf8,tf9,tf10;
    Font f,f1;
    Choice ch1,ch2,ch3,ch4,ch5,ch6;
    cancel_reservation()
    {
        super("Cancel Flight");
        setLocation(50,10);
        setSize(1100,650);

        f = new Font("Arial",Font.BOLD,25);
        f1 = new Font("Arial",Font.BOLD,10);

        ch1 = new Choice();
        try{
            ConnectionClass obj = new ConnectionClass();
            String q = "Select distinct TicketId from bookflight where Class = '1' ";
            ResultSet rest = obj.sta.executeQuery(q);
            while(rest.next())
            {
                ch1.add(rest.getString("tid"));

            }
            rest.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        l1 = new JLabel("Cancle your Flight Ticket");
        l2 = new JLabel("TicketId ");
        l3 = new JLabel("Source ");
        l4 = new JLabel("Destination");
        l5 = new JLabel("Class ");
        l6 = new JLabel("Price");
        l7 = new JLabel("FlightName");
        l8 = new JLabel("FlightDate");
        l9 = new JLabel("FlightTime");
        l10 = new JLabel("UserName");
        l11 = new JLabel("Name ");
//        l12 = new JLabel("Reason");

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();

        tf5 = new JTextField();
        tf6 = new JTextField();

        tf7 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();
        tf10 = new JTextField();
//        tf11 = new JTextField();

        tf1.setEditable(true);
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);

        tf5 .setEditable(false);
        tf6.setEditable(false);
        tf7 .setEditable(false);
        tf8.setEditable(false);
        tf9 .setEditable(false);
        tf10.setEditable(false);
//        tf11.setEditable(false);

        bt1 = new JButton("Cancel Ticket");
        bt2 = new JButton("Back");

//        bt1.addActionListener(this);
//        bt2.addActionListener(this);

        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(new java.awt.Color(176,4,21));

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
        l11.setFont(f1);
//        l12.setFont(f1);
        ch1.setFont(f1);

        tf1.setFont(f1);
        tf2.setFont(f1);
        tf3.setFont(f1);
        tf4.setFont(f1);

        tf5 .setFont(f1);
        tf6.setFont(f1);
        tf7 .setFont(f1);
        tf8 .setFont(f1);
        tf9 .setFont(f1);
        tf10.setFont(f1);
//        tf11.setFont(f1);

        bt1.setFont(f1);
        bt2.setFont(f1);

        l2.setForeground(new java.awt.Color(20,2,117));
        l3.setForeground(new java.awt.Color(20,2,117));
        l4.setForeground(new java.awt.Color(20,2,117));
        l5.setForeground(new java.awt.Color(20,2,117));
        l6.setForeground(new java.awt.Color(20,2,117));
        l7.setForeground(new java.awt.Color(20,2,117));
        l8.setForeground(new java.awt.Color(20,2,117));
        l9.setForeground(new java.awt.Color(20,2,117));
        l10.setForeground(new java.awt.Color(20,2,117));
        l11.setForeground(new java.awt.Color(20,2,117));
//        l12.setForeground(new java.awt.Color(20,2,117));
//       l13.setForeground(new java.awt.Color(20,2,117));

        bt1.setBackground(new java.awt.Color(176,4,21));
        bt2.setBackground(Color.BLACK);

        bt2.setForeground(new java.awt.Color(230,225,225));
        bt1.setForeground(Color.WHITE);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(13,2,10,10));
        p2.add(l2);
        p2.add(ch1);
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
        p2.add(l9);
        p2.add(tf7);
        p2.add(l10);
        p2.add(tf8);
        p2.add(l11);
        p2.add(tf9);
//        p2.add(l12);
        p2.add(tf10);
//        p2.add(l13);
//        p2.add(tf11);
        p2.add(bt1);
        p2.add(bt2);

        p3 = new JPanel();
        p3.setLayout(new GridLayout(1,1,10,10));

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Ams/icons/img2.jpeg"));
        Image i1 = img.getImage().getScaledInstance(600, 350, Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(i1);
        l11.setIcon(img2);
        p3.add(l11);

        setLayout(new BorderLayout(10,10));

        add(p1,"North");
        add(p2,"Center");
        add(p3,"West");

    }




//        JFrame jFrame;
//
//        jFrame = new JFrame("Book Flight");
//        jFrame.setLayout(null);
//        jFrame.setSize(900, 700);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JLabel jLabel10 = new JLabel();
//        jLabel10.setBounds(0,0,450,700);
//
//        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Ams/icons/360_F_71318503_9g1UATIOZzwELZg2DZb7w4oaVyenhQkh-removebg-preview.png"));
//        Image i1= img.getImage().getScaledInstance(460,600,Image.SCALE_SMOOTH);
//        ImageIcon img2 = new ImageIcon(i1);
//        jLabel10.setIcon(img2);
//        jFrame.add(jLabel10);
//
//        JLabel jLabel15 = new JLabel("Cancel Your Flights");
//        jLabel15.setBounds(150,12,300,40);
//        jLabel15.setFont(new Font("Arial",Font.BOLD,30))   ;
//        jFrame.add(jLabel15);
//
//
//
//        JLabel jLabel = new JLabel("Ticket Id");
//        jLabel.setBounds(450,10,200,100);
//        jLabel.setFont(new Font("Arial",Font.BOLD,20))   ;
//        jLabel.setForeground(Color.RED);
//        jFrame.add(jLabel);
//
//
//
//        JTextField jTextField = new JTextField();
//        jTextField.setBounds(670,45,180,30);
//        jFrame.add(jTextField);
//
//        JLabel jLabel1 = new JLabel("Source");
//        jLabel1.setBounds(450,60,200,100);
//        jLabel1.setFont(new Font("Arial",Font.BOLD,20))   ;
//        jLabel1.setForeground(Color.RED);
//        jFrame.add(jLabel1);
//
//        JTextField jTextField1 = new JTextField();
//        jTextField1.setBounds(670,95,180,30);
//        jFrame.add(jTextField1);
//
//
//        JLabel jLabel2 = new JLabel("Destination");
//        jLabel2.setBounds(450,110,200,100);
//        jLabel2.setFont(new Font("Arial",Font.BOLD,20))   ;
//        jLabel2.setForeground(Color.RED);
//        jFrame.add(jLabel2);
//
//        JTextField jTextField2 = new JTextField();
//        jTextField2.setBounds(670,145,180,30);
//        jFrame.add(jTextField2);
//
//
//        JLabel jLabel3 = new JLabel("Class");
//        jLabel3.setBounds(450,160,200,100);
//        jLabel3.setFont(new Font("Arial",Font.BOLD,20))   ;
//        jLabel3.setForeground(Color.RED);
//        jFrame.add(jLabel3);
//
//        JTextField jTextField3 = new JTextField();
//        jTextField3.setBounds(670,195,180,30);
//        jFrame.add(jTextField3);
//
//
//        JLabel jLabel4 = new JLabel("Price");
//        jLabel4.setBounds(450,210,200,100);
//        jLabel4.setFont(new Font("Arial",Font.BOLD,20))   ;
//        jLabel4.setForeground(Color.RED);
//        jFrame.add(jLabel4);
//
//        JTextField jTextField4 = new JTextField();
//        jTextField4.setBounds(670,245,180,30);
//        jFrame.add(jTextField4);
//
//
//        JLabel jLabel5 = new JLabel("Flight Code");
//        jLabel5.setBounds(450,260,200,100);
//        jLabel5.setFont(new Font("Arial",Font.BOLD,20))   ;
//        jLabel5.setForeground(Color.RED);
//        jFrame.add(jLabel5);
//
//        JTextField jTextField5 = new JTextField();
//        jTextField5.setBounds(670,295,180,30);
//        jFrame.add(jTextField5);
//
//
//        JLabel jLabel6 = new JLabel("Flight Name");
//        jLabel6.setBounds(450,310,200,100);
//        jLabel6.setFont(new Font("Arial",Font.BOLD,20))   ;
//        jLabel6.setForeground(Color.RED);
//        jFrame.add(jLabel6);
//
//        JTextField jTextField6 = new JTextField();
//        jTextField6.setBounds(670,345,180,30);
//        jFrame.add(jTextField6);
//
//
//        JLabel jLabel7 = new JLabel("Journey Date");
//        jLabel7.setBounds(450,360,200,100);
//        jLabel7.setFont(new Font("Arial",Font.BOLD,20))   ;
//        jLabel7.setForeground(Color.RED);
//        jFrame.add(jLabel7);
//
//        JTextField jTextField7 = new JTextField();
//        jTextField7.setBounds(670,395,180,30);
//        jFrame.add(jTextField7);
//
//        JLabel jLabel8 = new JLabel("Journey Time");
//        jLabel8.setBounds(450,410,200,100);
//        jLabel8.setFont(new Font("Arial",Font.BOLD,20))   ;
//        jLabel8.setForeground(Color.RED);
//        jFrame.add(jLabel8);
//
//        JTextField jTextField8 = new JTextField();
//        jTextField8.setBounds(670,445,180,30);
//        jFrame.add(jTextField8);
//
//        JLabel jLabel9 = new JLabel("Username");
//        jLabel9.setBounds(450,460,200,100);
//        jLabel9.setFont(new Font("Arial",Font.BOLD,20))   ;
//        jLabel9.setForeground(Color.RED);
//        jFrame.add(jLabel9);
//
//        JTextField jTextField9= new JTextField();
//        jTextField9.setBounds(670,495,180,30);
//        jFrame.add(jTextField9);
//
//        JLabel jLabel11 = new JLabel("Name");
//        jLabel11.setBounds(450,510,200,100);
//        jLabel11.setFont(new Font("Arial",Font.BOLD,20))   ;
//        jLabel11.setForeground(Color.RED);
//        jFrame.add(jLabel11);
//
//        JTextField jTextField10= new JTextField();
//        jTextField10.setBounds(670,545,180,30);
//        jFrame.add(jTextField10);
//
//        JButton jButton1 = new JButton("Cancel Flight");
//        jButton1.setBounds(450,600,180,30);
//        jButton1.setBackground(Color.RED);
//        jFrame.add(jButton1);
//
//        JButton jButton2= new JButton("Back");
//        jButton2.setBounds(670,600,180,30);
//        jButton2.setBackground(Color.RED);
//        jFrame.add(jButton2);
//
//        jFrame.setVisible(true);
//    }
    public static void main(String args[])
    {
       new cancel_reservation().setVisible(true);
    }
}

