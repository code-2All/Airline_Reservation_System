package Ams;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Payment_details {
    JFrame jFrame;

    Payment_details()
    {
        JFrame jFrame = new JFrame("Payment details");
        jFrame.setLayout(null);
        jFrame.setBounds(200,100,900,600);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);


        JLabel  j  =  new JLabel();
        j.setBounds(0,0,2000,600);
        j.setLayout(null);
        j.setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Ams/icons/img2.jpeg"));
        Image i1= img.getImage().getScaledInstance(900,600,Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(i1);
        j.setIcon(img2);
        jFrame.add(j);

        JLabel jLabel1 = new JLabel("Payment Details");
        jLabel1.setBounds(350,20,220,30);
        jLabel1.setFont(new Font("Arial",Font.BOLD,20));
        j.add(jLabel1);


        JLabel jLabel3 = new JLabel("Username");
        jLabel3.setBounds(220,100,300,50);
        jLabel3.setFont(new Font("Arial",Font.BOLD,20));

        j.add(jLabel3);

        JButton jButton1 = new JButton("Show");
        jButton1.setBounds(520,110,200,30);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.WHITE);
        j.add(jButton1);

        JLabel jLabel4  = new JLabel("TicketId");
        jLabel4.setBounds(120,170,200,30);
        jLabel4.setFont(new Font("Arial",Font.BOLD,15));
        j.add(jLabel4);

        JLabel jLabel5  = new JLabel("Price");
        jLabel5.setBounds(220,170,200,30);
        jLabel5.setFont(new Font("Arial",Font.BOLD,15));
        j.add(jLabel5);

        JLabel jLabel6  = new JLabel("Journey Date");
        jLabel6.setBounds(300,170,200,30);
        jLabel6.setFont(new Font("Arial",Font.BOLD,15));
        j.add(jLabel6);

        JLabel jLabel7  = new JLabel("Journey Time");
        jLabel7.setBounds(460,170,200,30);
        jLabel7.setFont(new Font("Arial",Font.BOLD,15));
        j.add(jLabel7);

        JLabel jLabel8  = new JLabel("UserName");
        jLabel8.setBounds(600,170,200,30);
        jLabel8.setFont(new Font("Arial",Font.BOLD,15));
        j.add(jLabel8);

        JLabel jLabel9  = new JLabel("Status");
        jLabel9.setBounds(710,170,200,30);
        jLabel9.setFont(new Font("Arial",Font.BOLD,15));
        j.add(jLabel9);




//        JLabel jLabel4 = new JLabel("Payment");
//        jLabel4.setBounds(300,50,300,50);
//        j.add(jLabel4);

        jFrame.setVisible(true);



    }
  public static void main(String args[])
  {
      Payment_details obj = new Payment_details();
  }

}
////package airline.management.system;
//package Ams;
//import java.util.*;
//
//import java.awt.*;
//import java.util.*;
//import java.awt.event.*;
//import java.sql.*;
//import javax.swing.*;
////import net.proteanit.sql.DbUtils;
//
//public class Payment_details extends JFrame{ //Fifth
//
//    JTextField textField;
//    JTable table;
//    JLabel Sector;
//    JLabel FlightCode, Capacity, Classcode, Classname, label;
//
//    public static void main(String[] args) {
//        new Payment_details();
//    }
//
//    public Payment_details(){
//        initialize();
//    }
//
//    private void initialize(){
//        setTitle("PAYMENT_DETAILS");
//        getContentPane().setBackground(Color.WHITE);
//        setSize(860,486);
//        setLayout(null);
//
//        JLabel Fcode = new JLabel("PNR NO");
//        Fcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
//        Fcode.setBounds(60, 160, 150, 26);
//        add(Fcode);
//
//        textField = new JTextField();
//        textField.setBounds(200, 160, 150, 26);
//        add(textField);
//
//        table = new JTable();
//        table.setBounds(45, 329, 766, 87);
//        add(table);
//
//        JButton Show = new JButton("SHOW");
//        Show.setFont(new Font("Tahoma", Font.PLAIN, 17));
//        Show.setBackground(Color.BLACK);
//        Show.setForeground(Color.WHITE);
//        Show.setBounds(200, 210, 150, 26);
//        add(Show);
//
//        Sector = new JLabel("PAYMENT DETAILS");
//        Sector.setForeground(Color.BLUE);
//        Sector.setFont(new Font("Tahoma", Font.PLAIN, 31));
//        Sector.setBounds(51, 17, 300, 39);
//        add(Sector);
//
//        FlightCode = new JLabel("PNR_NO");
//        FlightCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
//        FlightCode.setBounds(84, 292, 108, 26);
//        add(FlightCode);
//
//        Capacity = new JLabel("PAID_AMOUNT");
//        Capacity.setFont(new Font("Tahoma", Font.PLAIN, 13));
//        Capacity.setBounds(183, 298, 92, 14);
//        add(Capacity);
//
//        Classcode = new JLabel("PAY_DATE");
//        Classcode.setFont(new Font("Tahoma", Font.PLAIN, 13));
//        Classcode.setBounds(322, 294, 101, 24);
//        add(Classcode);
//
//        Classname = new JLabel("CHEQUE_NO");
//        Classname.setFont(new Font("Tahoma", Font.PLAIN, 13));
//        Classname.setBounds(455, 298, 114, 14);
//        add(Classname);
//
//        label = new JLabel("");
//        label.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/payment.png")));
//        label.setBounds(425, 15, 239, 272);
//        add(label);
//
//        JLabel Cardno = new JLabel("CARD_NO");
//        Cardno.setFont(new Font("Tahoma", Font.PLAIN, 13));
//        Cardno.setBounds(602, 299, 101, 19);
//        add(Cardno);
//
//        JLabel Phoneno = new JLabel("PHONE_NO");
//        Phoneno.setFont(new Font("Tahoma", Font.PLAIN, 13));
//        Phoneno.setBounds(712, 294, 86, 24);
//        add(Phoneno);
//
//        setVisible(true);
//
////        Show.addActionListener(new ActionListener(){
////            public void actionPerformed(ActionEvent ae){
////
////                try {
////                    String code  = textField.getText();
////
////                    conn c = new conn();
////                    String str = "select pnr_no,paid_amt,pay_date,cheque_no,card_no,ph_no from payment where pnr_no = '"+code+"'";
////
////                    ResultSet rs = c.s.executeQuery(str);
////
////                    table.setModel(DbUtils.resultSetToTableModel(rs));
////
////                }catch(SQLException e) {
////                    e.printStackTrace();
////                }
////            }
////        });
//
//        setSize(960,590);
//        setLocation(400,200);
//        setVisible(true);
//
//    }
//}
