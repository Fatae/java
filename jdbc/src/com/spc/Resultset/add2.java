package com.spc.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class add2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/spc?characterEncoding=utf8";
        String user="root";
        String password="";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql="delete from medal where 合计=0";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
    }
}
