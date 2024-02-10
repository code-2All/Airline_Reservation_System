package Ams;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class Check_Bill extends JFrame {
        JTextField textField;
        JTable table;
        JLabel Sector,FlightCode,Capacity,Classcode,Classname,label;

        Check_Bill()
        {
                initialize();
        }

        private void initialize()
        {
                setTitle("Payment Details");
                getContentPane().setBackground(Color.WHITE);
                setSize(1000,486);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(null);

                JLabel Fcode = new JLabel("Username");
                Fcode.setFont(new Font("Arial",Font.BOLD,16));
                Fcode.setBounds(190,160,150,26);
                add(Fcode);

                textField = new JTextField();
                textField.setBounds(300,160,150,23);
                textField.setFont(new Font("Arial",Font.BOLD,14));
                add(textField);

                table = new JTable();
                table.setBounds(93,297,766,87);
                add(table);

                JButton Show =  new JButton("Show");
                Show.setFont(new Font("Arial",Font.BOLD,14));
                Show.setBackground(Color.BLACK);
                Show.setForeground(Color.WHITE);
                Show.setBounds(500,160,150,26);
                add(Show);

                Sector =  new JLabel("Check Payment Details");
                Sector.setFont(new Font("Arial",Font.BOLD,33));
                Sector.setForeground(Color.BLUE);
                Sector.setBounds(291,17,800,39);
                add(Sector);


                FlightCode =  new JLabel("Ticket Id");
                FlightCode.setFont(new Font("Arial",Font.BOLD,14));
//                FlightCode.setForeground(Color.BLUE);
                FlightCode.setBounds(117,262,108,26);
                add( FlightCode);

                Capacity =  new JLabel("Price");
                Capacity.setFont(new Font("Arial",Font.BOLD,14));
//                FlightCode.setForeground(Color.BLUE);
                Capacity.setBounds(237,268,38,14);
                add(Capacity);


                Classcode =  new JLabel("Journey Date");
                Classcode.setFont(new Font("Arial",Font.BOLD,14));
//                FlightCode.setForeground(Color.BLUE);
                Classcode.setBounds(362,264,101,24);
                add(Classcode);

                Classname =  new JLabel("Journey Time");
                Classname.setFont(new Font("Arial",Font.BOLD,14));
//                FlightCode.setForeground(Color.BLUE);
                Classname.setBounds(485,268,114,14);
                add(Classname);

                JLabel Cardno = new JLabel("UserName");
                Cardno.setFont(new  Font("Arial",Font.BOLD,14));
                Cardno.setBounds(620,269,101,19);
                add(Cardno);

                JLabel Phoneo = new JLabel("Class");
                Phoneo.setFont(new  Font("Arial",Font.BOLD,14));
                Phoneo.setBounds(752,264,86,24);
                add(Phoneo);


                label = new JLabel("");
                ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Ams/icons/1000_F_292290638_KlFMsdbNNwvQFVRouWDDHlKcbFV9sdP3.jpg"));
                Image i1 = img.getImage().getScaledInstance(1000, 486, Image.SCALE_SMOOTH);
                ImageIcon img2 = new ImageIcon(i1);
                label.setIcon(img2);
                label.setBounds(0,0,1000,486);
                add(label);

                setVisible(true);

                Show.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                                try {
                                        String usn = textField.getText();
                                        ConnectionClass obj = new ConnectionClass();
                                        String str = "select TicketId,Price,FlightDate,FlighTime,Username,Class from bookflight where Username = '" + usn + "' and Class = '1'";
                                        ResultSet rs = obj.sta.executeQuery(str);

                                        new Bill();


//                                        table.setModel(DBUtils.resultSetToTableModel(rs));
//                                        table.setFont(new Font("Arial", Font.BOLD, 14));

                                } catch (Exception ex) {
                                       ex.printStackTrace();
                                }
                        }
                });
                setSize(960,590);
                setLocation(40,20);
                setVisible(true);
        }
        public static void main(String args[])
        {
                new Check_Bill();
        }
}
