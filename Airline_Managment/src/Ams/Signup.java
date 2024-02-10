package Ams;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Signup {

     //implements ActionListener  implements is used to actionListenner bec its is a abstract method
        JFrame jFrame;

        JButton jButton;
        JTextField jTextField;
        JTextField jTextField1;
        JTextField jTextField2;
        JPasswordField jPasswordField;
        JTextField jTextField4;
        JLabel jLabel;



        JLabel jLabel1;
        JLabel jLabel2;
        JLabel jLabel3;

        JLabel jLabel4;
        JLabel jLabel5;


//        Connection con;

        public Signup() //make constructor
        {

            jFrame = new JFrame("This is normal Title Box"); //create object
            jFrame.setLayout(null);
            jFrame.setSize(700, 530);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JLabel j = new JLabel();
            j.setBounds(0,0,700,530);
            ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Ams/icons/img2.jpeg"));
            Image i1= img.getImage().getScaledInstance(700,530,Image.SCALE_SMOOTH);
            ImageIcon img2 = new ImageIcon(i1);
            j.setIcon(img2);
            jFrame.add(j);

            jLabel = new JLabel("SignUp Form");
            jLabel.setFont(new Font("JLabel1",Font.PLAIN,20));
            jLabel.setBounds(230, 5, 260, 30);
            j.add(jLabel);

            jLabel1 = new JLabel(" First Name");
            jLabel1.setBounds(150,90,200,20);
            jLabel1.setFont(new Font("JLabel1",Font.PLAIN,20));
            j.add(jLabel1);

            jTextField = new JTextField();
            jTextField.setBounds(370,90,150,25);
            j.add(jTextField);

            jLabel2 = new JLabel(" Last Name");
            jLabel2.setBounds(150,150,200,20);
            jLabel2.setFont(new Font("JLabel1",Font.PLAIN,20));
            j.add(jLabel2);

            jTextField1 = new JTextField();
            jTextField1.setBounds(370,150,150,25);
            j.add(jTextField1);

            jLabel3 = new JLabel("Password ");
            jLabel3.setBounds(150,210,200,20);
            jLabel3.setFont(new Font("JLabel1",Font.PLAIN,20));
            j.add(jLabel3);

            jPasswordField = new JPasswordField();
            jPasswordField.setBounds(370,210,150,25);
            j.add(jPasswordField);

            jLabel4= new JLabel(" Codeid ");
            jLabel4.setBounds(150,270,200,20);
            jLabel4.setFont(new Font("JLabel1",Font.PLAIN,20));
            j.add( jLabel4);

            jTextField2 = new  JTextField ();
            jTextField2 .setBounds(370,270,150,25);
            j.add(jTextField2 );

            jLabel5 = new JLabel(" Email Id");
            jLabel5.setBounds(150,330,200,20);
            jLabel5.setFont(new Font("JLabel1",Font.PLAIN,20));
            j.add(jLabel5);

            jTextField4 = new JTextField();
            jTextField4.setBounds(370,330,150,25);
            j.add(jTextField4);

            jButton = new JButton("SignUp");
            jButton.setBounds(250,400,100,30);
            j.add(jButton);

            jButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {

                        ConnectionClass conn = new ConnectionClass();

                        String first = jTextField.getText();
                        String last = jTextField1.getText();
                        String user = jTextField2.getText();
                        String password = jPasswordField.getText();
                        String email = jTextField4.getText();

                        PreparedStatement pst = conn.conn.prepareStatement("INSERT INTO  signlogin(Firstname,Lastname,Password,CodeId,Email) values(?,?,?,?,?)");

                        pst.setString(1,first);  // indexing starting from 0 in db
                        pst.setString(2,last);

                        pst.setString(3,password);

                        pst.setString(4,user);
                        pst.setString(5,email);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Data added successfully");
                        jFrame.setVisible(false);

                    }catch(Exception e1){
                        e1.printStackTrace();
                    }
                }
            });

            jFrame.setVisible(true);
        }
        public static void main(String[] args){
           new Signup();
        }

    }

