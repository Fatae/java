package com.spc.jdbcTest;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class test01 {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        Driver driver = new Driver();
        //获取连接
        String url="jdbc:mysql://localhost:3306/spc?characterEncoding=utf8";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","");
        Connection connect = driver.connect(url, properties);
        //执行增删改查
        String sql="insert into mange values ('张伟','软件开发大赛','二等奖','2014-09-19')," +
                "('张伟','软件开发大赛','二等奖','2014-09-19')";
        Statement statement = connect.createStatement();
        int row =statement.executeUpdate(sql);

        //关闭连接
        statement.close();
        connect.close();
    }
}
