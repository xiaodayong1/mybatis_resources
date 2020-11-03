package com.xiao.testMybatis;

import com.xiao.dao.IUserMapper;
import com.xiao.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName : test  //类名
 * @Description : Mybatis测试  //描述
 * @Author : Xiaodayong  //作者
 * @Date: 2020-11-03 15:34  //时间
 */
public class test {

  @Test
  public void test() throws IOException {
    InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
    SqlSessionFactory  sqlSessionFactory= new SqlSessionFactoryBuilder().build(resourceAsStream);
    SqlSession sqlSession = sqlSessionFactory.openSession(true);
    IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
    List<User> all = mapper.findAll();
    for (User user:all){
      System.out.println(user.toString());
    }
  }

}
