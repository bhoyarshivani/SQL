CREATE DATABASE EMPINFO;
SHOW DATABASES;
USE EMPINFO;
CREATE TABLE Admin (
    ID int,
    pwd varchar(30)
     );
     select * from Admin; --show all data from table
     insert into Admin values (01,'root1');
     insert into Admin values (02,'root2');
     insert into Admin values (03,'root3');
     insert into Admin values (04,'root4');
     
     alter table Admin add primary key (id);
     
     select * from admin;
     
     create table EMPLOYEE(
     EID INT ,
     ENAME VARCHAR(20),
     SALARY DOUBLE,
     COMM INT,
     DEPTNO INT,
     AGE INT
     );
     SELECT * FROM eMPLOYEE;
     INSERT INTO EMPLOYEE VALUES (101, 'SHIVANI',70000,0,07,23);
     INSERT INTO EMPLOYEE VALUES (102,'SUYOG',80000,2000,08,24);
     SELECT * FROM EMPLOYEE;
     INSERT INTO EMPLOYEE VALUES (103, 'ADITI',90000,02,07,24);
     INSERT INTO EMPLOYEE VALUES (104,'ABHISHEK',60000,01,08,29);
	alter table EMPLOYEE add  PRIMARY key (eiD);
 SELECT * FROM DEPT;
 INSERT INTO DEPT VALUES (08,'IT','PUNE');
 INSERT INTO DEPT VALUES (07,'HR','MUMBAI');
 
-- ALTER TABLE Customers
--ADD Email varchar(255);
