CREATE DATABASE IF NOT EXISTS template DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use template;

DROP TABLE IF EXISTS t_template;
CREATE TABLE t_template(
  id BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
  name varchar(30) NOT NULL COMMENT '姓名',
  password varchar(50) NOT NULL COMMENT '密码'
) ENGINE = InnoDB DEFAULT CHARSET = utf8;
