//创建数据库
create database library;
use library;
//创建用户名
create user 'library'@'%' identified by 'library';
//赋予权限
grant all PRIVILEGES  on library.* to library@'%' IDENTITY  by 'library';
//刷新权限
flush PRIVILEGES ;

drop TABLE  USER;
--用户表
create TABLE  USER(
`user_id` bigint NOT NULL auto_increment comment '用户ID',
`user_name` VARCHAR(20)  NOT  NULL  comment   '用户名',
`user_password` VARCHAR(50)  NOT  NULL  comment '密码(MD5加密保存)',
`user_phone` VARCHAR(20)  NOT  NULL  comment '手机号',
`passwd_error` INTEGER  NOT  NULL  DEFAULT 0 comment '密码错误次数',
PRIMARY  KEY (`user_id`)
) engine=innodb auto_increment=10001 DEFAULT  charset =utf8 comment '用户表';


