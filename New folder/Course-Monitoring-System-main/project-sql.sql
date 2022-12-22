use project;

create table Admin
(
username varchar(255),
password varchar(255)
);



desc admin;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| username | varchar(255) | YES  |     | NULL    |       |
| password | varchar(255) | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+






create table Faculty
(
facultyId int primary key auto_increment,
facultyname varchar(255),
facultyaddress varchar(255),
mobile varchar(10),
email varchar(255),
username varchar(255),
password varchar(255)
);

desc Faculty;
+----------------+--------------+------+-----+---------+----------------+
| Field          | Type         | Null | Key | Default | Extra          |
+----------------+--------------+------+-----+---------+----------------+
| facultyId      | int          | NO   | PRI | NULL    | auto_increment |
| facultyname    | varchar(255) | YES  |     | NULL    |                |
| facultyaddress | varchar(255) | YES  |     | NULL    |                |
| mobile         | varchar(10)  | YES  |     | NULL    |                |
| email          | varchar(255) | YES  |     | NULL    |                |
| username       | varchar(255) | YES  |     | NULL    |                |
| password       | varchar(255) | YES  |     | NULL    |                |
+----------------+--------------+------+-----+---------+----------------+





create table Course
(
courseId int primary key auto_increment,
courseName varchar(255),
fee int,
courseDescription varchar(255)
);

desc Course;
+-------------------+--------------+------+-----+---------+----------------+
| Field             | Type         | Null | Key | Default | Extra          |
+-------------------+--------------+------+-----+---------+----------------+
| courseId          | int          | NO   | PRI | NULL    | auto_increment |
| courseName        | varchar(255) | YES  |     | NULL    |                |
| fee               | int          | YES  |     | NULL    |                |
| courseDescription | varchar(255) | YES  |     | NULL    |                |
+-------------------+--------------+------+-----+---------+----------------+





create table Batch
(
batchid int primary key auto_increment,
courseId int,
facultyId int,
numberofStudents int,
batchstartDate date,
duration varchar(255),
foreign key (courseId) references Course (courseid),
foreign key (facultyId) references faculty (facultyid)
);

desc Batch;
+------------------+--------------+------+-----+---------+----------------+
| Field            | Type         | Null | Key | Default | Extra          |
+------------------+--------------+------+-----+---------+----------------+
| batchid          | int          | NO   | PRI | NULL    | auto_increment |
| courseId         | int          | YES  | MUL | NULL    |                |
| facultyId        | int          | YES  | MUL | NULL    |                |
| numberofStudents | int          | YES  |     | NULL    |                |
| batchstartDate   | date         | YES  |     | NULL    |                |
| duration         | varchar(255) | YES  |     | NULL    |                |
+------------------+--------------+------+-----+---------+----------------+

create table Batch
(
batchid int primary key auto_increment,
coursed varchar(225),
facultyId int,
numberofStudents int,
batchstartDate date,
duration varchar(255),
foreign key (coursed) references courses (coursed),
foreign key (facultyId) references faculty (facultyid)
);

create table Batch( batchid int primary key auto_increment, coursed varchar(225),
facultyId int,numberofStudents int,batchstartDate date,  duration varchar(255),
foreign key (coursed) references courses (coursed),
foreign key (facultyId) references faculty (facultyid));




create table courseplan
(
planid int primary key auto_increment,
batchId int,
daynumber int,
topic varchar(255),
status boolean,
foreign key (batchId) references Batch (batchid)
);

 desc courseplan;
+-----------+--------------+------+-----+---------+----------------+
| Field     | Type         | Null | Key | Default | Extra          |
+-----------+--------------+------+-----+---------+----------------+
| planid    | int          | NO   | PRI | NULL    | auto_increment |
| batchId   | int          | YES  | MUL | NULL    |                |
| daynumber | int          | YES  |     | NULL    |                |
| topic     | varchar(255) | YES  |     | NULL    |                |
| status    | tinyint(1)   | YES  |     | NULL    |                |
+-----------+--------------+------+-----+---------+----------------+

create table courseplanss
(
planid int primary key auto_increment,
batchId int,
daynumber int,
topic varchar(255),
status varchar(255),
foreign key (batchId) references Batch (batchid)
);

