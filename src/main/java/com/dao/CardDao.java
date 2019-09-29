package com.dao;


import com.entity.Card;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
@Mapper
public interface CardDao {

    List<Card> selectByMap(Map<String,Object> map);

    Card selectById(int id);

    int updateById(Card card);

    int insert(Card card);

    int deleteById(int id);

    int ceshi(@Param("id")int id,@Param("type")int type);




}
