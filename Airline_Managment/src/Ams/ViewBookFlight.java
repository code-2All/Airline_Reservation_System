package Ams;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class ViewBookFlight extends JFrame {
    JTable t;
    String x[] = {"TicketId","Source","Destination","Class","Price","Flight Name","Journey Date","Journey Time","User Name","Name"};
    String y[][] = new String[20][10];
    int i=0,j=0;
    Font f;
    ViewBookFlight()
    {
        super("Flight Journey Details");
        setSize(1300,400);
        setLocation(0,10);
        f=new Font("Ms UI Gothic",Font.BOLD,17);

        try{
            ConnectionClass obj = new ConnectionClass();
            String q = "Select * from bookflight";
            ResultSet rest = obj.sta.executeQuery(q);
            while(rest.next())
            {
                y[i][j++] = rest.getString("TicketId");
                y[i][j++] = rest.getString("Source");
                y[i][j++] = rest.getString("Destination");
                y[i][j++] = rest.getString("Class");
                y[i][j++] = rest.getString("Price");
                y[i][j++] = rest.getString("FlightName");
                y[i][j++] = rest.getString("FlightDate");
                y[i][j++] = rest.getString("FlighTime");
                y[i][j++] = rest.getString("UserName");
                y[i][j++] = rest.getString("Name");
                i++;
                j=0;

//                y[i][j++] = rest.getString("TicketId");
//                y[i][j++] = rest.getString("TicketId");
//                y[i][j++] = rest.getString("TicketId");
//                y[i][j++] = rest.getString("TicketId");
//                y[i][j++] = rest.getString("TicketId");
//
            }
            t=new JTable(y,x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    t.setFont(f);
        t.setForeground(Color.WHITE);
        t.setBackground(Color.BLACK);
        JScrollPane js = new JScrollPane(t);
        add(js);


    }

    public static void main(String args[])
    {

       new ViewBookFlight().setVisible(true);
    }
}
