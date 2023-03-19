drop database if exists gymapp;

create database gymapp DEFAULT CHARACTER SET utf8  DEFAULT COLLATE utf8_general_ci;

use gymapp;


-- Table for admins who will control and monitor all information in the gym 

create table `admin` (
id int not null primary key auto_increment,
username varchar(255) not null,
name varchar(255) not null,
surname varchar(255) not null,
email varchar (255) not null,
password char(60) not null
);

-- Table for memebers (active/inactive)

create table `member` (
id int not null primary key auto_increment,
name varchar(255) not null,
surname varchar(255) not null,
email varchar (255),
phoneNumber varchar(22),
oib int (11) not null,
active boolean not null
);

-- Table for tracking the package that the client will pay for

create table `package` (
id int not null primary key auto_increment,
name varchar(255) not null,
price decimal (18,2) not null,
description text
); 

-- Table for trainers

create table `trainer` (
id int not null primary key auto_increment,
name varchar(255) not null,
surname varchar(255) not null,
email varchar (255),
phoneNumber varchar(22),
oib int (11) not null
);

-- Table for tracking payments

create table `payment` (
id int not null primary key auto_increment,
`member` int not null,
`package` int not null,
duration_start date not null,
duration_end date not null
);



-- Table to track when the training was done, who did the training, who was the coach and what was done that day

create table `package_member_trainer`(
id int not null primary key auto_increment,
package int not null,
trainer int not null,
`member` int not null,
`start_training` datetime not null,
`end_training` datetime not null,
description text not null
);

-- Connecting tables

alter table `package_member_trainer` add foreign key (package) references package(id);
alter table `package_member_trainer` add foreign key (trainer) references trainer(id);
alter table `package_member_trainer` add foreign key (`member`) references `member`(id);
alter table `payment` add foreign key (`member`) references `member`(id);
alter table `payment` add foreign key (`package`) references `package`(id);

