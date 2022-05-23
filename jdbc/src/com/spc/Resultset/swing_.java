package com.spc.Resultset;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class swing_ {
    public static class MYSQLUse extends JFrame{
        Object data[][];
        Object colname[]={"代表队","金牌","银牌","铜牌","合计"};
        JTable studentTable;
        public MYSQLUse(){
            super("统计");
            Container c=getContentPane();
            c.setLayout(new BorderLayout());
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/spc";
                String user="root";
                String password="";
                Connection connection = DriverManager.getConnection(url, user, password);
                String sql="select*from medal";
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet resultSet = statement.executeQuery(sql);
                resultSet.last();
                int n=resultSet.getRow();
                data=new Object[n][10];
                studentTable=new JTable(data,colname);
                c.add(new JScrollPane(studentTable),BorderLayout.CENTER);
                int i=0;
                resultSet.beforeFirst();
                while (resultSet.next()){
                    data[i][0]= resultSet.getString(1);
                    data[i][1] = resultSet.getInt(2);
                    data[i][2]= resultSet.getInt(3);
                    data[i][3] = resultSet.getInt(4);
                    data[i][4] = resultSet.getInt(5);
                    i++;
                }
                resultSet.close();
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


}

