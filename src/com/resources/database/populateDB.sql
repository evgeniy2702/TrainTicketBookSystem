use train;

INSERT INTO `train`.`wagoon_type` (`name`, `sits_count`) VALUES ('SW', '18');
INSERT INTO `train`.`wagoon_type` (`name`, `sits_count`) VALUES ('PLATSKART', '54');
INSERT INTO `train`.`wagoon_type` (`name`, `sits_count`) VALUES ('KYPE', '36');



INSERT INTO `train`.`passenger_wagoon` (`passenger_wagoon_type_id`, `wagoon_num`, `num_sit`) VALUES ('1', '10', '14');
INSERT INTO `train`.`passenger_wagoon` (`passenger_wagoon_type_id`, `wagoon_num`, `num_sit`) VALUES ('2', '11', '34');
INSERT INTO `train`.`passenger_wagoon` (`passenger_wagoon_type_id`, `wagoon_num`, `num_sit`) VALUES ('3', '12', '23');


ALTER TABLE `train`.`passenger_wagoon`
    ADD INDEX `fk_pas_wag__type_idx` (`passenger_wagoon_type_id` ASC);
ALTER TABLE `train`.`passenger_wagoon`
    ADD CONSTRAINT `fk_pas_wag__type`
        FOREIGN KEY (`passenger_wagoon_type_id`)
            REFERENCES `train`.`wagoon_type` (`id_wogoon_type`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION;


use train;
create table `eqwe`(
                       `id` int check(`id`>0 and `id`<10),
                       `age` int check(`age`!= 0)
);

insert into `eqwe`(`id`, `age`) values (2,3);
insert into `eqwe`(`id`, `age`) values (12,0);

select * from ticket;


-- order by
select * from `ticket` order by `time` ASC;


select * from `ticket` order by `time` DESC;

select * from `ticket` where `pas_id` <3 order by `time` DESC;

-- LIMIT
select * from `ticket` where id_ticket < 3;

select * from `ticket` limit 2;

-- IN
select * from `ticket` where id_ticket IN (1, 9, 8);

-- like
select * from `ticket` where `time` LIKE '11%';

-- as
select `id_ticket` as `ticket`, `time` as 'vremya', `pas_id` as 'passanger' from `ticket` ;



SELECT  * from  ticket
union
select * from  passenger;


-- join
select * from ticket INNER JOIN passenger  on ticket.pas_id = passenger.id_passenger;


select id_ticket, `time`, passenger_name, age from ticket INNER JOIN passenger  on ticket.pas_id = passenger.id_passenger;


SELECT * from passenger INNER JOIN ticket  on id_passenger = pas_id where age>18;

select * from ticket INNER JOIN passenger  on ticket.pas_id = passenger.id_passenger;

select * from ticket  RIGHT JOIN   passenger  on ticket.pas_id = passenger.id_passenger;

select * from ticket RIGHT JOIN passenger on ticket.pas_id = passenger.id_passenger
left join eqwe e on passenger.age = e.age;


