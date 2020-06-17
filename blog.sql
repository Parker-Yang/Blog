create database blog; 
use blog;
drop table article;
create table article(art_id int primary key auto_increment,
title text,
describes text,
content text,
likes int,
visited int);
drop table user;
create table user(u_id int primary key auto_increment,
name varchar(20),
password varchar(20),
email varchar(20),
age int,
sign text,
gender varchar(5),
create_time timestamp,
identity int);
drop table art_comment;
create table art_comment(art_id int,
u_id int,
com_body text,
com_time timestamp,
CONSTRAINT art_com foreign key(art_id) references article(art_id),
CONSTRAINT user_com foreign key(u_id) references user(u_id));
drop table art_users;
create table art_users(art_id int,
u_id int,
art_time timestamp,
CONSTRAINT art_users foreign key(art_id) references article(art_id),
CONSTRAINT user_users foreign key(u_id) references user(u_id));