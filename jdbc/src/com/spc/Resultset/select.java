package com.spc.Resultset;
import java.sql.*;
public class select {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/spc";
        String user="root";
        String password="";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql="select*from medal";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            String string = resultSet.getString(1);
            int anInt = resultSet.getInt(2);
            int anInt1 = resultSet.getInt(3);
            int anInt2 = resultSet.getInt(4);
            int anInt3 = resultSet.getInt(5);
            System.out.println(string+"\t"+anInt+"\t"+anInt1+"\t"+anInt2
                    +"\t"+anInt3);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
