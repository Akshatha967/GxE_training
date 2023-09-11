-------------COPE_ID

use AkshBanking;
select * from Account;
INSERT INTO Account(CUST_ID,ACT_TYPE,ACT_BALANCE)
VALUES (1,'SAVING',3577);


select * FROM CUSTOMER;

INSERT INTO Customer(
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE,CUST_EMAIL,CUST_PIN)
VALUES('SAM','2006-04-29','BANGALORE','9911987766','SM@GMAIL.COM',145432);


-- gives the id of recently inserted item;
select scope_identity();


BEGIN

		declare @var_id INT;
		DECLARE @VAR_ID_FUN INT;

		SET @var_id = @@identity;
		print @var_id;
		set @var_id_fun = scope_identity();
		print @var_id_fun;

END;

--NOTE : 2 - @@ symbol means its a system variable

BEGIN
SET IDENTITY_INSERT CUSTOMER ON;

INSERT INTO Customer(CUST_ID,
CUST_NAME,
CUST_DOB,
CUST_ADDRESS,
CUST_PHONE,CUST_EMAIL,CUST_PIN)
VALUES(scope_identity()+1,'SAMUEL','2016-04-29','BANGALORE','9911687766','SMUEL@GMAIL.COM',165432);
SET IDENTITY_INSERT CUSTOMER ON;

select scope_identity();

END;

SELECT * FROM ACCOUNT;



----DBCC CHECKIDENT : CURRENT IDENTITY VALUE IS GIVEN;
--(TABLENAME , NORESEED | RESEED[NEW RESSED VALUE]

DBCC CHECKIDENT (CUSTOMER);