CREATE TABLE IF NOT EXISTS t_user
(
    id          INTEGER AUTO_INCREMENT primary key,
    t_name      varchar(255) not null,
    t_password  varchar(255) not null,
    t_email     varchar(255) not null,
    t_real_name varchar(255) not null,
    t_tel       varchar(15) not null,
    t_sex       varchar(4) not null,
    t_date      varchar(25) not null
) default charset = "utf8";
