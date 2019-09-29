package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Yuz
 * @CreateDate: 2019/9/27$ 14:49$
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {
    @Autowired
    UserDao userDao;

    /**
     * @Description: 添加
     * @Author: Yuz
     * @Date: 2019/9/15
     */
    public void insert(User user){
        userDao.insert(user);
    }
    /**
     * @Description: 删除
     * @Author: Yuz
     * @Date: 2019/9/15
     */
    public void delete(Integer id){
        userDao.deleteById(id);
    }
    /**
     * @Description: 更新
     * @Author: Yuz
     * @Date: 2019/9/15
     */
    public void update(User user){
        userDao.updateById(user);
    }
    /**
     * @Description: 查询名称为123的User
     * @Author: Yuz
     * @Date: 2019/9/15
     */
    public List<User> selectByMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("name",123);
        return userDao.selectByMap(map);
    }
    /**
     * @Description:
     * @Author: Yuz
     * @Date: 2019/9/15
     */
    public List<User> ceshi(int id){
        Map<String,Object> map = new HashMap<>(1);
        map.put("id",id);
        return userDao.selectByMap(map);
    }


}
