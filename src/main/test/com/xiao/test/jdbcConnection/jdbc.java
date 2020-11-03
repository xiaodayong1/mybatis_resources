package com.xiao.test.jdbcConnection;

import org.junit.Test;

import java.sql.*;

/**
 * @ClassName : jdbc  //类名
 * @Description : 测试jdbc连接  //描述
 * @Author : Xiaodayong  //作者
 * @Date: 2020-11-03 15:03  //时间
 */
public class jdbc {

  @Test
  public void testJDBC() throws SQLException, ClassNotFoundException {
    String URL="jdbc:mysql:///ipersistence?serverTimezone=GMT%2b8";
    String USER="root";
    String PASSWORD="root";
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
    Statement statement = connection.createStatement();
    ResultSet rs = statement.executeQuery("select * from user");

    while(rs.next()){
      System.out.println(rs.getString("id")+" "
      +rs.getString("username"));
      }
  }
}
