----------ASSIGNMENT----09/11/2023
use AkshBanking
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




------------
select * from Customer;

select count(cust_age) from customer where cust_age<20;
select count(cust_age) from customer where (cust_age between 20 and 40);
select count(cust_age) from customer where (cust_age between 40 and 60);
select count(cust_age) from customer where (cust_age >60);

UPDATE CUSTOMER SET CUST_AGE = 65 WHERE CUST_ID=10;
select * from customer;

ALTER TABLE CUSTOMER DROP CONSTRAINT VALID_AGE;

select count(cust_age) age_count,description
from (
select CUST_AGE,
case when (CUST_AGE between 0 and 20) then '0-20'
when (CUST_AGE between 20 and 40 ) then '20-40'
when (CUST_AGE between 40 and 60) then '40-60' 

else '>60'
end description
from CUSTOMER) as main_table group by(description);

