package com.spc.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/spc?characterEncoding=utf8";
        String user="root";
        String password="";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql="insert into medal value('挪威',16,8,13,37)," +
                " ('中国',8,4,2,15), " +
                "('美国',8,10,7,25)," +
                "('冰岛',0,0,0,0)," +
                " ('荷兰',8,5,4,17), " +
                "('印度',0,0,0,0)";
        Statement statement = connection.createStatement();
         statement.executeUpdate(sql);
    }
}
