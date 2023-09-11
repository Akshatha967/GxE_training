
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




