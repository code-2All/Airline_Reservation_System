package Ams;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;


public class flightJourneyDetails extends JFrame {
    JTable t;
    String x[] = {"TicketId","Source","Destination","Class","Price","FlightName","FlightDate","FlightTime","Username","Name"};
    String y[][] = new String[20][10    ];
    int i=0,j=0;
    Font f;
    flightJourneyDetails(String src, String dst)
    {
        super("Flight Journey Deatail");
        setSize(1300,400);
        setLocation(0,10);
        f = new Font("MS UI Gothic",Font.BOLD,17);

        try{
            ConnectionClass obj = new ConnectionClass();
            String q = "Select * from bookflight where source='"+src+"' and destination='"+dst+"'";
            ResultSet rest =  obj.sta.executeQuery(q);

            while (rest.next())
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
            }
            t =  new JTable(y,x);

        } catch (Exception e) {
            e.printStackTrace();
        }
        t.setFont(f);
        t.setBackground(Color.BLACK);
        t.setForeground(Color.WHITE);

        JScrollPane js = new JScrollPane(t);
        add(js);
    }

}
