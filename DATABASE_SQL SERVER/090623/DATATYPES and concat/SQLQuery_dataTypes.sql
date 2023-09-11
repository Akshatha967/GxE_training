--EXACT NUMERIC
DECLARE @random_num bigint;
declare @id int;
declare @emp_id smallint;
declare @var3 tinyint;
declare @var4 bit;
declare @var5 decimal;
declare @var6 numeric;
declare @var7 money;
declare @var8 smallmoney;
--declare @var9 numeric(10,10);


--SET @var9 = 10.9758432;
--print @var9;

SET @id =-214748364;
SET @emp_id =32767;
SET @var3 =255;
SET @var4 =1;
SET @var5 =108797;
SET @var6 =1234.9;
SET @var7 =1234;
SET @var8=123;

PRINT @random_num;
PRINT @id;
PRINT @emp_id;
PRINT @var3 ;
PRINT @var4;
PRINT @var5;
PRINT @var6 ;
PRINT  @var7;
PRINT @var8;

--approximate numeric
DECLARE @VAR10 FLOAT;
declare @VAR11 REAL;

SET @VAR10 = 123333333333333333.7878;
SET @VAR11 = 123333333333333333.7878;

print @VAR10;
print @VAR11;

--date and time
DECLARE @var12 datetime='2001-09-29 12:00:00';
DECLARE @var13 smalldatetime='2011-09-29 12:00:00';
DECLARE @var14 date='2001-09-29';
DECLARE @var15 time='12:00:00';
DECLARE @var16 datetimeoffset='2001-09-29 12:00:00.999';
DECLARE @var17 datetime2='2011-09-29 12:00:00';

print @var12;
print @var13;
print @var14;
print @var15;
print @var16;
print @var17;

--character strings
declare @var18 char(4) = 'aksht';
declare @var19 varchar(4) = 'aksht';
declare @var20 varchar(MAX)='akkkk'
--declare @var21 text = 'akshathaushetty@gmail.com'
declare @var22 nchar(15) = N'现代汉语常用字表';
declare @var23 nvarchar(15)=N'现代汉语常用字表';

print @var18;
print @var19;
print @var20;
--print @var21;
print @var22;
print @var23;

--binary strings

declare @var30 binary(4)=1111222233334444;
declare @var31 varbinary(2)=1111;

print @var30;
print @var31;
