CREATE SCHEMA `train` DEFAULT CHARACTER SET utf8;

CREATE TABLE `train`.`passenger_wagoon`
(
    `id_passenger_wagoon`   INT         NOT NULL AUTO_INCREMENT,
    `passenger_wagoon_type` VARCHAR(45) NOT NULL,
    `wagoon_num`            INT         NOT NULL,
    `count_sits`            INT         NOT NULL,
    `num_sit`               INT         NOT NULL,
    PRIMARY KEY (`id_passenger_wagoon`)
);

CREATE TABLE `train`.`wagoon_type`
(
    `id_wogoon_type` INT         NOT NULL AUTO_INCREMENT,
    `name`           VARCHAR(45) NOT NULL,
    `sits_count`     INT         NOT NULL,
    PRIMARY KEY (`id_wogoon_type`)
);


ALTER TABLE `train`.`passenger_wagoon`
    DROP COLUMN `count_sits`,
    CHANGE COLUMN `passenger_wagoon_type` `passenger_wagoon_type_id`
        INT NOT NULL;


