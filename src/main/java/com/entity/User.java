package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description:
 * @Author: Yuz
 * @CreateDate: 2019/9/27$ 14:44$
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User {

//    CREATE TABLE `user` (
//            `id` int(11) NOT NULL AUTO_INCREMENT,
//  `name` varchar(255) DEFAULT NULL,
//  `address` varchar(255) DEFAULT NULL,
//    PRIMARY KEY (`id`)
//) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

//    INSERT INTO `demo`.`user`(`id`, `name`, `address`) VALUES (1, '张三', 'add:1111');
//    INSERT INTO `demo`.`user`(`id`, `name`, `address`) VALUES (2, '李四', 'add:2222');
//    INSERT INTO `demo`.`user`(`id`, `name`, `address`) VALUES (3, '王五', 'add:3333');
//    INSERT INTO `demo`.`user`(`id`, `name`, `address`) VALUES (4, '赵六', 'add:4444');
//    INSERT INTO `demo`.`user`(`id`, `name`, `address`) VALUES (5, '小明', 'add:5555');


    private Integer id;
    private String name;
    private String address;

}

