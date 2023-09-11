
---------------------------------
------SCOPE IDENTITY ------------ set based on: if u want user to enter a vlaue or not.
use AkshBanking;
scope_identity();
select * from Customer;

BEGIN
	SET IDENTITY_INSERT CUSTOMER ON;
	INSERT INTO Customer(
	CUST_ID,
	CUST_NAME,
	CUST_DOB,
	CUST_ADDRESS,
	CUST_PHONE,
	CUST_AGE)
	VALUES(8,'JOHN','2001-04-17','LA','6655443399',33);

	UPDATE CUSTOMER SET CUST_EMAIL='JOHN@GMAIL.COM' WHERE CUST_ID=8;

	INSERT INTO Customer(
	CUST_ID,
	CUST_NAME,
	CUST_DOB,
	CUST_ADDRESS,
	CUST_PHONE,
	CUST_AGE,
	CUST_EMAIL)
	VALUES(9,'JOHNY','2001-04-17','LA','6695443399',33,'j@gmail.com');

	SET IDENTITY_INSERT CUSTOMER OFF;
END;


DECLARE @CUST_STR3 sysname;
DECLARE @DynamicSQL nvarchar(max);

SET @CUST_STR3='CUST_STR3';
SET @DynamicSQL = N'SELECT * INTO ' + QUOTENAME(@CUST_STR3) + ' FROM CUSTOMER';

EXEC sp_executesql @DynamicSQL;


--below dsnt wrk
INSERT INTO Customer(
	CUST_NAME,
	CUST_DOB,
	CUST_ADDRESS,
	CUST_PHONE,
	CUST_AGE,
	CUST_EMAIL)
	VALUES('@CUST_NAME',
	'@CUST_DOB',
	'@CUST_ADDRESS',
	'@CUST_PHONE',
	'@CUST_AGE',
	'@CUST_EMAIL');
