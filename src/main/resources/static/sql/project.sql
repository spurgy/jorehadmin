/*https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation*/

DROP TABLE IF EXISTS `person`;

CREATE TABLE person (
person_id BIGINT(20) NOT NULL AUTO_INCREMENT,
pcity VARCHAR(255) NULL DEFAULT NULL,
NAME VARCHAR(255) NULL DEFAULT NULL,
PRIMARY KEY (`person_id`)
);



DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` INT(11) NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(255) DEFAULT NULL,
  `created` DATETIME NULL DEFAULT NULL,
  `updated` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


INSERT INTO `role` VALUES (1,'ADMIN', CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());

INSERT INTO `role` VALUES (2,'USER',  CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` INT(11) NOT NULL AUTO_INCREMENT,
  `active` INT(11) DEFAULT NULL,
  `email` VARCHAR(255) NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `created` DATETIME NULL DEFAULT NULL,
  `updated` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=INNODB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_id` INT(11) NOT NULL,
  `role_id` INT(11) NOT NULL,
  `created` DATETIME NULL DEFAULT NULL,
  `updated` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`),
  CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
`staff_id` INT NOT NULL AUTO_INCREMENT ,
`staff_name` VARCHAR(35) NOT NULL ,
`staff_dob` DATE NOT NULL ,
`staff_doj` DATE NOT NULL ,
`staff_phone` VARCHAR(20) NOT NULL ,
`staff_designation_id` INT NOT NULL ,
`staff_fathername` VARCHAR(35) NOT NULL ,
`staff_email` VARCHAR(40) NOT NULL ,
`staff_c_street` VARCHAR(124) NOT NULL ,
`staff_c_area` VARCHAR(124) NOT NULL ,
`staff_c_city` VARCHAR(124) NOT NULL ,
`staff_p_street` VARCHAR(124) NOT NULL ,
`staff_p_area` VARCHAR(124) NOT NULL ,
`staff_p_city` VARCHAR(124) NOT NULL ,
`staff_salary` DOUBLE NOT NULL ,
`created` DATETIME NULL DEFAULT NULL,
`updated` DATETIME NULL DEFAULT NULL,
PRIMARY KEY (`staff_id`)) ENGINE = InnoDB;

DROP TABLE IF EXISTS `designation`;
CREATE TABLE `designation` (
`desig_id` INT NOT NULL AUTO_INCREMENT ,
`desig_name` VARCHAR(64) NOT NULL ,
`created` DATETIME NOT NULL ,
`updated` DATETIME NOT NULL ,
PRIMARY KEY (`desig_id`)) ENGINE = InnoDB;

INSERT INTO designation (desig_id,desig_name,created,updated)
VALUES(1,"Manager", CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP()),(2,"Receptionist",CURRENT_TIMESTAMP(),CURRENT_TIMESTAMP());

DROP TABLE IF EXISTS `staff_user_role_relation`;
CREATE TABLE `staff_user_role_relation` (
`user_id` INT NOT NULL ,
`staff_id` INT NOT NULL,
`created` DATETIME NULL DEFAULT NULL ,
`updated` DATETIME NULL DEFAULT NULL) ENGINE = InnoDB;

DROP TABLE IF EXISTS `membership`;
CREATE TABLE `membership` (
`membership_id` INT NOT NULL AUTO_INCREMENT ,
`membership_name` VARCHAR(60) NOT NULL ,
`membership_price` DOUBLE NOT NULL,
`duration_id` INT NOT NULL,
`created` DATETIME NULL DEFAULT NULL,
`updated` DATETIME NULL DEFAULT NULL,
PRIMARY KEY (`membership_id`)) ENGINE = InnoDB;

DROP TABLE IF EXISTS `duration`;
CREATE TABLE `duration` (
`duration_id` INT NOT NULL AUTO_INCREMENT ,
`duration` INT NOT NULL ,
`duration_type` VARCHAR(18) NOT NULL ,
 PRIMARY KEY (`duration_id`)) ENGINE = InnoDB;
 
 DROP TABLE IF EXISTS `gender`;
 CREATE TABLE `gender` (
 `gender_id` INT NOT NULL AUTO_INCREMENT ,
 `gender_name` VARCHAR(12) NOT NULL ,
 `created` DATETIME NULL DEFAULT NULL ,
 `updated` DATETIME NULL DEFAULT NULL ,
 PRIMARY KEY (`gender_id`)) ENGINE = InnoDB;
 
 INSERT INTO `gender` VALUES (1,'EveryOne',  CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
 
 INSERT INTO `gender` VALUES (2,'Male', CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());

 INSERT INTO `gender` VALUES (3,'Female',  CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
 
 INSERT INTO `gender` VALUES (4,'Others',  CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
 
DROP TABLE IF EXISTS `services_category`;
CREATE TABLE `services_category` ( 
`services_category_id` INT NOT NULL AUTO_INCREMENT ,
`services_category_name` VARCHAR(20) NOT NULL ,
`created` DATETIME NULL DEFAULT NULL,
`updated` DATETIME NULL DEFAULT NULL,
PRIMARY KEY (`services_category_id`)
) ENGINE = InnoDB;

DROP TABLE IF EXISTS `loyalty_points`;
CREATE TABLE `loyalty_points` (
`loyalty_id` INT NOT NULL AUTO_INCREMENT ,
`membership_id` INT NOT NULL ,
`loyalty_points` DOUBLE NOT NULL ,
`created` DATETIME NULL DEFAULT NULL ,
`updated` DATETIME NULL DEFAULT NULL ,
PRIMARY KEY (`loyalty_id`)) ENGINE = InnoDB;

DROP TABLE IF EXISTS `service`;
CREATE TABLE `service` (
`service_id` INT NOT NULL AUTO_INCREMENT ,
`service_name` VARCHAR(32) NOT NULL ,
`service_category_id` INT NOT NULL ,
`service_availablefor_id` INT NOT NULL ,
`service_duration_id` INT NOT NULL ,
`service_price` DOUBLE NOT NULL ,
`created` DATETIME NULL DEFAULT NULL ,
`updated` DATETIME NULL DEFAULT NULL ,
PRIMARY KEY (`service_id`)) ENGINE = InnoDB;

DROP TABLE IF EXISTS `service_loyalty_points`;
CREATE TABLE `service_loyalty_points` (
`service_id` INT NOT NULL ,
`loyalty_id` INT NOT NULL ,
`created` DATETIME NULL DEFAULT NULL ,
`updated` DATETIME NULL DEFAULT NULL ) ENGINE = InnoDB;

DROP TABLE IF EXISTS `service_staff`;
CREATE TABLE `service_staff` (
`service_id` INT NOT NULL ,
`staff_id` INT NOT NULL ,
`created` DATETIME NULL DEFAULT NULL ,
`updated` DATETIME NULL DEFAULT NULL ) ENGINE = InnoDB;

/*------------Update Code--------------------*/

DROP TABLE IF EXISTS `apointment`;
CREATE TABLE `apointment` (
`apointment_id` INT NOT NULL AUTO_INCREMENT ,
`apointment_date` DATE NOT NULL ,
`apointment_time` TIME NOT NULL ,
`apointment_client_phone` INT NOT NULL ,
`apointment_client_name` VARCHAR(40) NOT NULL ,
`appointment_staff_id` INT NOT NULL ,
`apointment_service_id` VARCHAR(30) NOT NULL ,
`created` DATETIME NOT NULL ,
`updated` DATETIME NOT NULL ,
PRIMARY KEY (`apointment_id`)) ENGINE = InnoDB;
