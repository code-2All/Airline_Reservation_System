package Ams;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
        JLabel l1,l2,l3,l4;
        JButton bt1,bt2;
        JPasswordField pf;
        JTextField tf;
        JFrame f;
        public Login()
        {
            f = new JFrame("Login Frame");
            f.setBackground(Color.WHITE);
            f.setLayout(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            l1= new JLabel();
            l1.setBounds(0,0,580,350);
            l1.setLayout(null);

            ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Ams/icons/img2.jpeg"));
            Image i1= img.getImage().getScaledInstance(580,350,Image.SCALE_SMOOTH);
            ImageIcon img2 = new ImageIcon(i1);
            l1.setIcon(img2);

            l2= new JLabel("FirstName");
            l2.setBounds(120,120,150,30);
            l2.setForeground(Color.BLACK);
            l2.setFont(new Font("Arial",Font.BOLD,30));
            l1.add(l2);

            l3= new JLabel("Login Account");
            l3.setBounds(190,30,500,50);
            l3.setForeground(Color.BLACK);
            l3.setFont(new Font("Arial",Font.BOLD,30));
            l1.add(l3);

            l4= new JLabel("Password");
            l4.setBounds(120,170,150,30);
            l4.setForeground(Color.BLACK);
            l4.setFont(new Font("Arial",Font.BOLD,30));
            l1.add(l4);

            tf=new JTextField();
            tf.setBounds(320,120,150,30);
            l1.add(tf);

            pf=new JPasswordField();
            pf.setBounds(320,170,150,30);
            l1.add(pf);

            bt1 = new JButton("Login");
            bt1.setBackground(Color.BLACK);
            bt1.setForeground(Color.WHITE);
            bt1.setBounds(120,220,150,40);
            l1.add(bt1);

            bt2 = new JButton("Sign Up");
            bt2.setBackground(Color.BLACK);
            bt2.setForeground(Color.WHITE);
            bt2.setBounds(320,220,150,40);
            l1.add(bt2);

            bt1.addActionListener(this);
            bt2.addActionListener(this);

            f.add(l1);
            f.setVisible(true);
            f.setSize(580,350);
            f.setLocation(300,100);
        }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==bt1)
            {
                String FirstName = tf.getText();
                String Password = pf.getText();
                try
                {
                    ConnectionClass obj = new ConnectionClass();
                    String q =  "Select * From signlogin where FirstName=' "+FirstName+" ' and Password=' "+Password+" ' ";
                    ResultSet rs = obj.sta.executeQuery(q);

//                    if(rs.next())

                        new Home_Page().setVisible(true);
                        f.setVisible(false);


//                    else
//                    {
//                        JOptionPane.showMessageDialog(null,"You have entered wrong username and password");
//                        f.setVisible(false);
//                        f.setVisible(true);
////                        new Login();
////                        f.setVisible(false);
//                    }
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }
            }
            if(e.getSource()==bt2)
            {
                this.f.setVisible(false);
                new Signup();
            }
        }
        public static void main(String args[])
        {
            new Login();
        }
}


