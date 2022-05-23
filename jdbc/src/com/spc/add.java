package com.spc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class add {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/spc?characterEncoding=utf8";
        String user="root";
        String password="";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql="update medal set 金牌=金牌+1,合计=合计+1 where 代表队='中国'";
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
    }
}
