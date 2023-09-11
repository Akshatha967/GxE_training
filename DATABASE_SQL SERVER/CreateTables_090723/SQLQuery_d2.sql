use AkshBanking;
create table Employees(
EMP_ID INT,
EMP_NAME VARCHAR(100),
EMP_DOB DATE,
EMP_ADDRESS VARCHAR(100),
);

create table Branch(
BR_NAME VARCHAR(100),
BR_IFSC VARCHAR(20),
BR_ADDRESS VARCHAR(100),
);

create table Customer(
CUST_ID INT not null,
CUST_NAME VARCHAR(100),
CUST_DOB DATE,
CUST_ADDRESS VARCHAR(100),
CUST_PHONE VARCHAR(20)
);

create table Account(
ACT_NUM INT not null,
ACT_TYPE VARCHAR(100),
ACT_BALANCE FLOAT
);

create table Transactions(
TRAN_ID INT,
TRAN_AMT FLOAT,
TRAN_TYPE VARCHAR(50),
TRAN_TIME DATETIME
);

drop table Account;

create table Account(
ACT_NUM INT not null,
CUST_ID INT,
ACT_TYPE VARCHAR(100),
ACT_BALANCE FLOAT
);

select * from Account;
select * from Customer;


--INSERT

INSERT INTO Account(ACT_NUM, CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (0098543458,1,'SAVING',350);

INSERT INTO Account(ACT_NUM, CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (0098543459,2,'SAVING',3500.99);

INSERT INTO Account(ACT_NUM, CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (0098543460,3,'CURRENT',3590.99);

INSERT INTO Account(ACT_NUM, CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (0098543461,4,'CURRENT',3900.99);

INSERT INTO Account(ACT_NUM, CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (0098543462,5,'SAVING',59090.89);

INSERT INTO Customer(CUST_ID,
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE) 
VALUES(1,'AKSHATHA','2001-03-29','UDUPI','9900887766');


INSERT INTO Customer(CUST_ID,
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE) 
VALUES(2,'DANIEL','2001-04-29','BANGALORE','9900987766');

INSERT INTO Customer(CUST_ID,
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE) 
VALUES(3,'EMMA','2001-06-29','ADYAR','9400887766');

INSERT INTO Customer(CUST_ID,
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE) 
VALUES(4,'RON','2001-01-29','MANIPAL','9900224455');

INSERT INTO Customer(CUST_ID,
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE) 
VALUES(5,'MALFOY','2001-02-09','MANGALORE','9988776655');


--DELETE
delete from Customer where CUST_ID=1 and CUST_NAME='MALFOY';

--SELECT
select * from Account;
select * from Customer;

--DROP
drop table Account;
drop table Customer;


--ALTER

alter table Customer add PRIMARY KEY(CUST_ID);
alter table Account add PRIMARY KEY(ACT_NUM);
alter table Account add foreign key(CUST_ID) references CUSTOMER(CUST_ID);

--CHECK CONSTRAINTS
alter table Account add constraint CHK_TYPE check(ACT_TYPE IN('SAVING','CURRENT','LOAN'));


---------------------ASSIGNMENT-------------------

DELETE FROM Account;
Delete from Customer;

select * from Account;
select * from Customer;

Drop table Account;
Drop table Customer;


use AkshBanking;
create table Account(
ACT_NUM INT Identity(1200,1) not null,
CUST_ID INT,
ACT_TYPE VARCHAR(100),
ACT_BALANCE FLOAT
);

create table Customer(
CUST_ID INT Identity(1,1) not null,
CUST_NAME VARCHAR(100),
CUST_DOB DATE,
CUST_ADDRESS VARCHAR(100),
CUST_PHONE VARCHAR(20)
);

alter table Customer add PRIMARY KEY(CUST_ID);
alter table Account add PRIMARY KEY(ACT_NUM);
alter table Account add foreign key(CUST_ID) references CUSTOMER(CUST_ID);




INSERT INTO Customer(
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE) 
VALUES('AKSHATHA','2001-03-29','UDUPI','9900887766');


INSERT INTO Customer(
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE) 
VALUES('DANIEL','2001-04-29','BANGALORE','9900987766');

INSERT INTO Customer(
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE) 
VALUES('EMMA','2001-06-29','ADYAR','9400887766');

INSERT INTO Customer(
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE) 
VALUES('RON','2001-01-29','MANIPAL','9900224455');

INSERT INTO Customer(
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE) 
VALUES('MALFOY','2001-02-09','MANGALORE','9988776655');


INSERT INTO Account(CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (1,'SAVING',350);

INSERT INTO Account(CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (2,'SAVING',3500.99);

INSERT INTO Account(CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (3,'CURRENT',3590.99);

INSERT INTO Account(CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (4,'CURRENT',3900.99);

INSERT INTO Account(CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (5,'SAVING',59090.89);

select * from Account;
select * from Customer;

alter table Account add constraint CHK_TYPE check(ACT_TYPE IN('SAVING','CURRENT','LOAN'));


INSERT INTO Account(CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (3,'LOAN',350890.99);

---the one below gives error
INSERT INTO Account(CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (2,'SAVINGs',350000.99);



-----------------end of assignment------------------

select * from Customer;

---using SELECT to create another table with data from a table.--
Select CUST_NAME, CUST_ADDRESS
INTO Customer_new
FROM Customer;

SELECT * from Customer_new;

Select CUST_NAME, CUST_ADDRESS
INTO Customer_new2
FROM Customer;

SELECT * from Customer_new2;

-- to get only the structure of the table--
Select CUST_NAME, CUST_ADDRESS
INTO Customer_str
FROM Customer
where 1=0;

select * from Customer_str;

Select CUST_ID, CUST_ADDRESS
INTO Customer_str2
FROM Customer
where 1=0;

select * from Customer_str2;



INSERT INTO Customer_str2(
CUST_ADDRESS) 
VALUES('RON');

INSERT INTO Customer_str2(CUST_ID,
CUST_ADDRESS) 
VALUES(1,'RON');

exec sp_columns Customer_str2;
exec sp_columns Customer;



-- add cols to a table using alter table--

alter table Customer add CUST_SSN VARCHAR(15);
select * from Customer;

--drop the column
alter table Customer drop column CUST_SSN;

----------Alter data type for columns-----------
alter table Customer alter column CUST_SSN VARCHAR(20);
select * from Customer;
exec sp_columns Customer_str2;

---alter to add and remove constraint---

alter table Customer add CUST_AGE INT; 
alter table Customer add CUST_EMAIL VARCHAR(100);

alter table Customer add constraint VALID_AGE CHECK (CUST_AGE BETWEEN 7 AND 60);
alter table Customer add constraint VALLID_EMAIL UNIQUE(CUST_EMAIL);

UPDATE CUSTOMER SET CUST_EMAIL='a@gmail.com' where CUST_ID=1;
UPDATE CUSTOMER SET CUST_EMAIL='b@gmail.com' where CUST_ID=2;
UPDATE CUSTOMER SET CUST_EMAIL='c@gmail.com' where CUST_ID=3;
UPDATE CUSTOMER SET CUST_EMAIL='d@gmail.com' where CUST_ID=4;
UPDATE CUSTOMER SET CUST_EMAIL='e@gmail.com' where CUST_ID=5;
UPDATE CUSTOMER SET CUST_EMAIL='f@gmail.com' where CUST_ID=6;
UPDATE CUSTOMER SET CUST_EMAIL='g@gmail.com' where CUST_ID=7;

--below gives error--
UPDATE CUSTOMER SET CUST_EMAIL='g@gmail.com' where CUST_ID=6;


--UPDATE CUSTOMER SET CUST_EMAIL= @CUST_EMAIL where CUST_ID=@CUST_ID;


select * from Customer;
--BELOW GIVES ERROR
INSERT INTO Customer(
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE,
CUST_AGE)
VALUES('RESPER','2001-05-09','LA','9934775055',100);

---------------------------------
---------------------------------
---------------------------------
------SCOPE IDENTITY ------------ set based on: if u want user to enter a vlaue or not.

select * from account;




