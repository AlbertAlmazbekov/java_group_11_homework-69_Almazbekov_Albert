-- auto-generated definition
create table gadgets_table
(
    id             integer generated by default as identity
        constraint gadgets_table_pkey
            primary key,
    image          varchar(128),
    name           varchar(128),
    price          integer,
    gadget_type_id integer
        constraint fkhk57x9regpb2f2hjw8mgx90k2
            references gadgettype,
    place_id       integer
        constraint fk7gwsf5kik61i3xx7uveni3yyr
            references places_table
);

alter table gadgets_table
    owner to postgres;

-- insert into gadgettype(name, icon)
-- values
--        ('Iphone 13 Pro Max', 'Iphone 13 Pro Max.png'),
--        ('Iphone 13 Pro', 'Iphone 13 Pro.png'),
--        ('Iphone 13', 'Iphone 13.png'),
--        ('Iphone 12 Pro Max', 'Iphone 12 Pro Max.png'),
--        ('Iphone 12 Pro', 'Iphone 12 Pro.png'),
--        ('Iphone 12', 'Iphone 12.png'),
--        ('Iphone 11 Pro Max', 'Iphone 11 Pro Max.png'),
--        ('Iphone 11 Pro', 'Iphone 11 Pro.png'),
--        ('Iphone 11', 'Iphone 11.png'),
--        ('Iphone XS Max', 'Iphone XS Max.png'),
--        ('Iphone XS', 'Iphone XS.png'),
--        ('Iphone X', 'Iphone X.png'),
--        ('Iphone 8 +', 'Iphone 8 +.png'),
--        ('Iphone 8', 'Iphone 8.png'),
--        ('Samsung', ''),
--        ('Huawei', ''),
--        ('Xiaomi', ''),
--        ('Nokia', ''),
--        ('Oppo', ''),
--        ('Asus', ''),
--        ('Poco', '');