---------- 09/11/2023


--content:
--insert, update, delete, top , truncate, select, order by, group by, aggregate functions, having, alias



---INSERT UPDATE DELETE

SELECT * FROM CUSTOMER; 
SELECT * FROM Account;



--UPDATE TABLE SET COL1=VAL, COL2=VAL, COL3=VAL WHERE ID=VAL;

UPDATE ACCOUNT SET ACT_BALANCE=ACCOUNT.ACT_BALANCE+10000;

UPDATE ACCOUNT SET ACT_BALANCE=ACT_BALANCE+(0.05)*ACT_BALANCE WHERE ACT_TYPE='SAVING';


---DELETE : CAN BE USED WITH TOP, MAX ETC -> DELETE TOP(EXP) [%] FROM TABLE WHERE SEARCH_COND;

DELETE FROM CUSTOMER  WHERE CUST_ID=13;
SELECT * FROM Customer;

DELETE TOP(1) FROM CUSTOMER WHERE CUST_ID NOT IN( SELECT CUST_ID FROM Account);



----------------------------SELECT 


--TOP(NUM) 
SELECT TOP(1) * FROM Customer;

--TOP( (NUM) PERCENT

SELECT TOP 50 PERCENT * FROM Customer;

SELECT TOP 10 PERCENT * FROM Customer WHERE CUST_NAME='EMMA';


---TRUNCATE (WE CANT SPECIFY CONDITION DELTS ALL THE ROWS -DDL N: TRUNCATE TABLE TABLE_NAME;

SELECT * FROM Customer_new2;
TRUNCATE TABLE Customer_new2;
select * from sys.tables;

-----ORDER BY CLAUSE; select * from table order by col1, col2. /// asc/desc default:asc

select * from customer;
select * from account;

select * from account order by cust_id desc;
Select CUST_ID,CUST_NAME from customer order by CUST_AGE asc;
Select CUST_ID,CUST_NAME from customer order by CUST_AGE desc;

------------------------group_by

select ACT_TYPE FROM Account GROUP BY(ACT_TYPE) ORDER BY ACT_TYPE DESC;
select  * from account;

select count(act_type),ACT_TYPE from Account group by(ACT_TYPE);

select count(cust_id),ACT_TYPE from Account group by(ACT_TYPE);

select act_type,cust_id,count(cust_id) from account group by ACT_TYPE, CUST_ID order by cust_id; 

--FIND MAX BAL UNDER EACH ACT TYPE
select max(act_balance) as max_bal,ACT_TYPE,count(cust_id)  from account group by(act_type) order by ACT_TYPE;

select act_type, count(*) as total, sum(act_balance) as sum_bal, min(act_balance) as min_bal, max(act_balance) as max_bal, avg(act_balance) as avg_bal from account group by ACT_TYPE;


------aggregate functions 


MAX 
MIN
COUNT
SUM
AVG

-------HAVING ----------can't come alone apply filter on some results (may b of group by )

select act_type,count(cust_id) as count_cust from account group by ACT_TYPE having count(cust_id)>1 order by ACT_TYPE desc;



----------------------ALIAS NAME---------------: AS  -- use as, just write name , use ""

--alias for columns
select act_type, count(*) as total, sum(act_balance) "sum_bal", min(act_balance) min_bal, max(act_balance) as max_bal, avg(act_balance) as avg_bal from account group by ACT_TYPE;

--alias for tables

select cus.CUST_ID,cus.CUST_ADDRESS , count(ac.ACT_TYPE) "act_type", count(cus.cust_address) "cust_addres"  from customer cus, account ac where cus.CUST_ID=ac.CUST_ID group by cus.CUST_ID ,  cus.CUST_ADDRESS having count(ac.ACT_TYPE)>1;

select * from account;

----------------------case statements--------------------------------------------------------------

select * from customer;

select cust_age,cust_email,
case when (cust_age between 0 and 35) then 'teen'
	when (cust_age between 36 and 45) then 'middle-aged'
	when (cust_age between 46 and 1000) then 'old-age'
	else 'super old'
	end 'age category'
from customer;



------------------union and union all except(linke minus) intersect  --------------------


--- note: num of cols select from each cols must be same when using these, datatypes of cols shud be same
----union - unique item
----union all- all items

select cust_id from customer
union all
select cust_id from account;

select cust_id from customer
union
select cust_id from account;


select cust_id ,  count(cust_id) "count_custId"  from account where cust_id in (select cust_id from customer
union all
select cust_id from account) 
group by cust_id;


select cust_id from customer 
intersect
select cust_id from account;

select cust_id from customer 
except
select cust_id from account;

select * from customer;

------------------------


select * from account ac , customer cus where ac.cust_id = cus.cust_id;

select count(cus.cust_id) from account ac , customer cus where ac.cust_id = cus.cust_id;


--- select only ppl born with 2011 into new4

select * into Customer_new4 from customer  where cust_dob < '2011-01-01';

select * from Customer_new4;

select cust_id from customer
union 
select cust_id from customer_new4;

select cust_id from customer
union all
select cust_id from customer_new4;

select cust_id from customer
intersect
select cust_id from customer_new4;

select cust_id from customer
except
select cust_id from customer_new4;

--------------------------------------------COALESCE----------------

--returns the fisrt non null value;
select * from customer;

select cust_id , coalesce(cust_age,cust_ssn), cust_name from customer;

-- coalesce(33,null) > 33
--coalesce (null,null,33) > 33

-----------------------data type conversion-------------
--convert, cast

--char -> num or num-> char 
--- char <-> date
---num<-> date is num is in date format

select CONVERT(int, '10');

select CONVERT(date, '2001-09-29',111);


select CAST('10.5' AS INT);
select cast('2001-09-29' as date);


-----------assit---------------------

select * from customer;

update customer set cust_age=10  where cust_id=1;
update customer set cust_age=12  where cust_id=2;
update customer set cust_age=10  where cust_id=3;
update customer set cust_age=60  where cust_id=4;
update customer set cust_age=50  where cust_id=5;
update customer set cust_age=30  where cust_id=14;

select cust_age,cust_email,
case when (cust_age between 0 and 35) then 'teen'
	when (cust_age between 36 and 45) then 'middle-aged'
	when (cust_age between 46 and 1000) then 'old-age'
	else 'super old'
	end 'age category'
from customer;



----------
select * from customer;
select cust_age, 
case when (cust_age between 0 and 19) then 'My age is '+cast(cust_age as varchar)+' and i am a kid'
when (cust_age between 21 and 59) then 'My age is '+cast(cust_age as varchar)+' and i am  working'

else  'My age is '+cast(cust_age as varchar)+' i am a senior citizen'
end 'description'
from customer;


--------------

select * from account;

select act_balance, 
case when (act_balance between 0 and 10000) then 'act_bal is is '+cast(act_balance as varchar)+' -A bad account'
when (act_balance  between 10000 and 50000 ) then 'act_bal is is '+cast(act_balance as varchar)+' -A average account'

else 'act_bal is is '+cast(act_balance as varchar)+' -A good account'
end 'description'
from account;



select * from account;
update account set ACT_BALANCE=500 where ACT_NUM=1200;

update account set ACT_BALANCE=600 where ACT_NUM=1204;
update account set ACT_BALANCE=48000 where ACT_NUM=1207;