-- auto-generated definition
create table customers
(
    id       integer generated by default as identity
        constraint customers_pkey
            primary key,
    email    varchar(128),
    enabled  boolean,
    fullname varchar(128),
    password varchar(128),
    role     varchar(128)
);

alter table customers
    owner to postgres;



insert into places_table (name, address, image)
values ('Gadget', 'SUM G-50', '');
