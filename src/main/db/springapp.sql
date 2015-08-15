create database springapp;
grant all on springapp.* to springappuser@'%' identified by 'psspringappuser';
grant all on springapp.* to springappuser@localhost identified by 'psspringappuser';

use springapp;

create table products(
  id integer primary key ,
  description varchar(255),
  price decimal(15,2)
);

create index  products_description on products(description);
