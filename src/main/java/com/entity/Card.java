package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description:
 * @Author: Yuz
 * @CreateDate: 2019/9/29$ 8:54$
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Card {
    private int id;
    private int userId;
    private int cardNo;
    private String cardName;
}
