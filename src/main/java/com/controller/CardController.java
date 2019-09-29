package com.controller;

import com.entity.Card;
import com.service.CardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @Author: Yuz
 * @CreateDate: 2019/9/29$ 11:13$
 */
@RestController
@RequestMapping("/card")
@Api("card接口")
public class CardController {


    @Autowired
    CardService cardService;


    @PostMapping("/insert")
    @ApiOperation(value = "添加")
    public void insert(@RequestBody Card card){
        cardService.insert(card);
    }

    @DeleteMapping("/delete")
    @ApiOperation(value = "删除")
    public void delete(int id){
        cardService.delete(id);
    }

    @PutMapping
    @ApiOperation(value = "更新")
    public void update(@RequestBody Card card){
        cardService.update(card);
    }

    @GetMapping
    @ApiOperation("查询")
    public List<Card> select(){
        return cardService.selectByMap();
    }

    @PostMapping("/ceshi")
    @ApiOperation(value = "测试")
    public int ceshi(@RequestParam(value = "id")int id,
                            @RequestParam(value = "type")int type){
        return cardService.ceshi(id,type);
    }


}
