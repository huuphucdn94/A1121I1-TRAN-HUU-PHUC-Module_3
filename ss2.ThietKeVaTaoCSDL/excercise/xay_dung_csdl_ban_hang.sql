create database quan_ly_ban_hang;
use quan_ly_ban_hang;

create table customer(
customer_id int not null auto_increment primary key,
customer_name varchar(50),
customer_age  int);

create table `order`(
order_id int not null auto_increment primary key,
customer_id int not null,
foreign key(customer_id) references customer(customer_id),
order_date datetime not null,
order_total_price double);
select*from `order`;

create table product(
product_id int not null auto_increment primary key,
product_name varchar(50),
product_price double);

create table order_detail(
order_id int,
product_id int,
oder_quantity int,
primary key(order_id,product_id),
foreign key (order_id) references `order`(order_id),
foreign key (product_id) references product(product_id));
select*from order_detail;


