package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Yuz
 * @CreateDate: 2019/9/27$ 14:44$
 */
@Mapper
public interface UserDao {

    User selectById(int id);

    List<User> selectByMap(Map<String,Object> map);

    int insert(User user);

    int deleteById(int id);

    int updateById(User user);


}
