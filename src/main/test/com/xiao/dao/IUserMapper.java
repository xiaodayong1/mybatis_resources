package com.xiao.dao;

import com.xiao.pojo.User;

import java.util.List;

public interface IUserMapper {
  List<User> findAll();
}
