package com.service;

import com.dao.CardDao;
import com.entity.Card;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Yuz
 * @CreateDate: 2019/9/29$ 11:11$
 */
@Service
public class CardService {

    @Autowired
    CardDao cardDao;

    /**
     * @Description: 添加
     * @Author: Yuz
     * @Date: 2019/9/15
     */
    public void insert(Card card){
        cardDao.insert(card);
    }
    /**
     * @Description: 删除
     * @Author: Yuz
     * @Date: 2019/9/15
     */
    public void delete(int id){
        cardDao.deleteById(id);
    }
    /**
     * @Description: 更新
     * @Author: Yuz
     * @Date: 2019/9/15
     */
    public void update(Card card){
        cardDao.updateById(card);
    }
    /**
     * @Description:
     * @Author: Yuz
     * @Date: 2019/9/15
     */
    public List<Card> selectByMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("id",1);
        return cardDao.selectByMap(map);
    }
    /**
     * @Description:
     * @Author: Yuz
     * @Date: 2019/9/15
     */
    public int ceshi(int id,int type){
        return cardDao.ceshi(id,type);
    }



}
