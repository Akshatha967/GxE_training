use Akshbanking;

--Alter to add balance and add new values to it;
alter table account add ACT_BAL int;

update account set ACT_BAL='30000' where ACT_NUM=1200;
update account set ACT_BAL='35000' where ACT_NUM=1201;
update account set ACT_BAL='36000' where ACT_NUM=1202;
update account set ACT_BAL='37000' where ACT_NUM=1203;
update account set ACT_BAL='38000' where ACT_NUM=1204;
update account set ACT_BAL='36000' where ACT_NUM=1205;

select * from account;


--Pincode-varchar, add, alter

select * from customer;
alter table customer add CUST_PIN varchar(10);

update customer set CUST_PIN='123456' where CUST_ID=1;
update customer set CUST_PIN='123556' where CUST_ID=2;
update customer set CUST_PIN='123656' where CUST_ID=3;
update customer set CUST_PIN='123756' where CUST_ID=4;
update customer set CUST_PIN='123856' where CUST_ID=5;
update customer set CUST_PIN='123656' where CUST_ID=6;
update customer set CUST_PIN='123256' where CUST_ID=7;
update customer set CUST_PIN='123156' where CUST_ID=8;
update customer set CUST_PIN='123056' where CUST_ID=9;

alter table customer alter column CUST_PIN INT;

select * from customer;
select * from account;

BEGIN

	SET IDENTITY_INSERT CUSTOMER ON;
	

	

	INSERT INTO Customer(
	CUST_ID,
	CUST_NAME,
	CUST_DOB,
	CUST_ADDRESS,
	CUST_PHONE,
	CUST_AGE,
	CUST_EMAIL)
	VALUES(10,'HIALL','2011-04-27','LA','6655443399',43,'jKJ@gmail.com');

	SET IDENTITY_INSERT CUSTOMER OFF;

END;

BEGIN
SET IDENTITY_INSERT ACCOUNT ON;

	INSERT INTO Account(ACT_NUM, CUST_ID,ACT_TYPE,ACT_BALANCE,ACT_BAL)
VALUES (1207,1,'SAVING',23456,34235);


SET IDENTITY_INSERT ACCOUNT OFF;

END;


INSERT INTO Account( CUST_ID,ACT_TYPE,ACT_BALANCE,ACT_BAL)
VALUES (2,'SAVING',35000,7876);


	INSERT INTO Customer(
	CUST_NAME,
	CUST_DOB,
	CUST_ADDRESS,
	CUST_PHONE,
	CUST_AGE,
	CUST_EMAIL)
	VALUES('NIALL','2011-09-27','LA','6655449399',43,'nial@gmail.com');


	