/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.5.32 : Database - ulezu
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`ulezu` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `ulezu`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `userName` varchar(40) DEFAULT NULL COMMENT '用户名',
  `phoneNum` varchar(15) DEFAULT NULL COMMENT '电话号码',
  `userPassword` varchar(50) DEFAULT NULL COMMENT '用户登录密码（MD5）',
  `email` varchar(50) DEFAULT NULL COMMENT '用户邮箱',
  `sex` varchar(2) DEFAULT NULL COMMENT '用户性别',
  `lastVisit` datetime DEFAULT NULL COMMENT '最后访问时间',
  `isActivate`  varchar(2) comment '是否激活',
  `A1` varchar(50) DEFAULT NULL COMMENT 'A1',
  `A2` varchar(50) DEFAULT NULL COMMENT 'A2',
  `A3` varchar(50) DEFAULT NULL COMMENT 'A3',
  `A4` varchar(50) DEFAULT NULL COMMENT 'A4',
  `A5` varchar(50) DEFAULT NULL COMMENT 'A5',
  `A6` varchar(50) DEFAULT NULL COMMENT 'A6',
  `A7` varchar(50) DEFAULT NULL COMMENT 'A7',
  `A8` varchar(50) DEFAULT NULL COMMENT 'A8',
  `A9` varchar(50) DEFAULT NULL COMMENT 'A9',
  `A10` varchar(50) DEFAULT NULL COMMENT 'A10',
  PRIMARY KEY (`id`),
  UNIQUE KEY `AK_Key_2` (`email`),
  UNIQUE KEY `AK_Key_3` (`userName`),
  UNIQUE KEY `AK_Key_4` (`phoneNum`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
