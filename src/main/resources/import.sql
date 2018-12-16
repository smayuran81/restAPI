INSERT INTO `restwithspring`.`role` (`role_id`, `name`) VALUES ('1', 'MYROLE_ADMIN');
INSERT INTO `restwithspring`.`role` (`role_id`, `name`) VALUES ('2', 'MYROLE_MANAGER');
INSERT INTO `restwithspring`.`role` (`role_id`, `name`) VALUES ('3', 'MYROLE_EMPLOYEE');


INSERT INTO `restwithspring`.`privilege` (`priv_id`,`description`, `name`) VALUES ('1','', 'ROLE_USER_READ');
INSERT INTO `restwithspring`.`privilege` (`priv_id`,`description`, `name`) VALUES ('2','', 'ROLE_USER_WRITE');
INSERT INTO `restwithspring`.`privilege` (`priv_id`,`description`, `name`) VALUES ('3','', 'ROLE_USER_UPDATE');
INSERT INTO `restwithspring`.`privilege` (`priv_id`,`description`, `name`) VALUES ('4','', 'ROLE_USER_QUERY');
INSERT INTO `restwithspring`.`privilege` (`priv_id`,`description`, `name`) VALUES ('5','', 'ROLE_USER_SUPER');

INSERT INTO `restwithspring`.`role_privileges` (`role_id`, `priv_id`) VALUES ('1', '1');
INSERT INTO `restwithspring`.`role_privileges` (`role_id`, `priv_id`) VALUES ('1', '2');
INSERT INTO `restwithspring`.`role_privileges` (`role_id`, `priv_id`) VALUES ('1', '3');
INSERT INTO `restwithspring`.`role_privileges` (`role_id`, `priv_id`) VALUES ('1', '4');
