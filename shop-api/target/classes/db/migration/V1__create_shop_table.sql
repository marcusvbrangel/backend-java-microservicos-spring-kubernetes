create schema if not exists shops;

create table shops.shop (
    id bigserial primary key,
    user_identifier varchar(100) not null,
    date timestamp not null,
    total float not null
);

create table shops.item (
    shop_id bigserial REFERENCES shops.shop(id),
    product_identifier varchar(100) not null,
    price float not null
);

