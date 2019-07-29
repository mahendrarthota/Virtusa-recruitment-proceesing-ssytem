create table employeecredentials(employeeid varchar2(20),employeepwd varchar2(20));
/
insert into employeecredentials values('&employeeid','&employeepwd');
/
Create table applicationtable(employeeid varchar2(10),Firstname varchar2(20),Middlename varchar2(20),Lastname varchar2(20),Email varchar2(40),Phonenumber varchar2(20),degree varchar2(20),degreemarks varchar2(5),inter varchar2(20),intermarks varchar2(5),tenth varchar2(20),tenthmarks varchar2(5),avialdate varchar2(20),jobslevel varchar2(20),jobstatus varchar2(20));
/
create table adminstatus(employeeid varchar2(20),status varchar2(20),review varchar2(1000));
/
create table trstatus(employeeid varchar2(20),status varchar2(20),review varchar2(1000));
/
create table hrstatus(employeeid varchar2(20),status varchar2(20),review varchar2(1000));
/
create table role(
id int not null primary key,
name varchar(255) not null
);
insert into role(id,name)values(1,'Employee');
insert into role(id,name)values(2,'TechnicalManager');
insert into role(id,name)values(3,'Humanresources');
insert into role(id,name)values(4,'Administrator');
create table EmployeeData(
id int not null primary key,
name varchar(255) not null,
username varchar(255) not null,
password varchar(255) not null,
email varchar(255) not null,
phone varchar(255) not null,
address varchar(255) not null,
role_id int not null,
foreign key(role_id) references  role(id)
);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(1,'Sowmya','8063516','sowmya123','Sowmya@gmail.com','9900115563','#11,9th street,upparpette,Bangaluru',1);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(2,'kavya','8063518','kavya123','prema@gmail.com','9800135562','#10,1st street,manasagangothri,Mysuru',3);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(3,'hemanth','8063579','mahimahi','hemanthkumarone@gmail.com','9400115561','#42,8th street,ramakrishna,Mysuru',2);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(4,'mahendra','8063536','mahimahi','mahendrathota123@gmail.com','9000115564','#40,7th street,hootagalli,Mysuru',4);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(5,'mouli','8063517','Mouli13*','annapareddymoulim@gmail.com','8900115569','#,9th street,puttur,Manglore',3);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(6,'Akshatha','akshatha','485756555453','akshatha@amphisoft.co.in','7900115565','#26,5th street,uppinangadi,Bangaluru',1);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(7,'Ashwin','ashwin','535251504954','ashwin@gmail.com','7990115663','#43,2nd street,neladrinagar,Bangaluru',1);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(8,'Anusha','anusha','9798994857','anusha@gmail.com','9889114560','#4,9th street,tumbenagar,tumakur',1);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(9,'Basanth','basanth','48574855485448','basanth@gmail.com','9103134563','#12,5th street,metagalli,Mysuru',1);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(10,'Sanjana','sanjana','9798991001014849','sanjana@gmail.com','9605415563','#30,5th street,Electroniccity,Bangaluru',1);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(11,'Balu','balu','1011021031044850','balu@gmail.com','9500715565','#67,9th street,upparpette,Mysuru',3);
insert into EmployeeData(id,name,username,password,email,phone,address,role_id)values(12,'Harish','harish','9798991004850','harish@gmail.com','9403314568','#13,16th street,anadanagar,Manglore',1);
