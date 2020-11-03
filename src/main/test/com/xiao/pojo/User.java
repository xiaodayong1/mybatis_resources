package com.xiao.pojo;

/**
 * @ClassName : User  //类名
 * @Description : 用户表  //描述
 * @Author : Xiaodayong  //作者
 * @Date: 2020-11-03 15:30  //时间
 */
public class User {
  private Integer id;
  private String username;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", username='" + username + '\'' +
      '}';
  }
}
