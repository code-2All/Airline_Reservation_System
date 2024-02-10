package Ams;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class Bill extends JFrame {

//    package Ams;
//import java.awt.*;
//import javax.swing.*;
//import java.sql.*;
//import java.awt.event.*;

//    public class ViewBookFlight {
        JTable t;
        String x[] = {"TicketId","Class","Price","Flight Name","Journey Date","UserName"};
        String y[][] = new String[20][6];
        int i=0,j=0;
        Font f;
        Bill()
        {
            super("Payment Details");
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
//                    y[i][j++] = rest.getString("Source");
//                    y[i][j++] = rest.getString("Destination");
                    y[i][j++] = rest.getString("Class");
                    y[i][j++] = rest.getString("Price");
                    y[i][j++] = rest.getString("FlightName");
                    y[i][j++] = rest.getString("FlightDate");
//                    y[i][j++] = rest.getString("FlighTime");
                    y[i][j++] = rest.getString("UserName");
//                    y[i][j++] = rest.getString("Name");
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

            new Bill().setVisible(true);
        }
    }

