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


//    CREATE TABLE `card` (
//            `id` int(11) NOT NULL AUTO_INCREMENT,
//  `user_id` varchar(255) DEFAULT NULL,
//  `card_no` int(11) DEFAULT NULL,
//  `card_name` varchar(255) DEFAULT NULL,
//    PRIMARY KEY (`id`)
//) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
//
//    INSERT INTO `demo`.`card`(`id`, `user_id`, `card_no`, `card_name`) VALUES (1, '0', 0, 'string');
//    INSERT INTO `demo`.`card`(`id`, `user_id`, `card_no`, `card_name`) VALUES (2, '1', 22, 'name2');
//    INSERT INTO `demo`.`card`(`id`, `user_id`, `card_no`, `card_name`) VALUES (3, '2', 33, 'name3');
//    INSERT INTO `demo`.`card`(`id`, `user_id`, `card_no`, `card_name`) VALUES (4, '2', 44, 'name4');
//    INSERT INTO `demo`.`card`(`id`, `user_id`, `card_no`, `card_name`) VALUES (6, '1', 1, 'string');



    private int id;
    private int userId;
    private int cardNo;
    private String cardName;
}
