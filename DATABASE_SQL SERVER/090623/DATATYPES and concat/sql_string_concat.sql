-- concatenation

declare @age int =20;
declare @dob date ='2023-09-29';
declare @name varchar(20) ='akshatha';


print 'hello! i am '+ @name +' i am '+cast(@age as varchar)+'years old. My birthdate is: '+cast(@dob as varchar);