CREATE TABLE IF NOT EXISTS product(
    product_id int primary key,
    title varchar(200),
    description varchar(500),
    price varchar(10),
    discount varchar(2),
    discounted_price varchar(10)
);