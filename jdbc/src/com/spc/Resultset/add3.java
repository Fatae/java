package com.spc.Resultset;

import java.sql.*;

public class add3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/spc?characterEncoding=utf8";
        String user="root";
        String password="";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql="select*from medal where 代表队='冰岛'";
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
