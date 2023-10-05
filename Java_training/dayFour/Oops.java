package dayFour;

class Meth
{
	// access modifiers
	// return type
	// method name
	// parameter list
	// exception list 
	// method body
	
}


// syntax of class
// access_modifier class <class_name>
// data member ;
// method;
// constructor;
//nested class 
// interface


// create new object
/////By new keyword
//By newInstance() method
//By clone() method
//By deserialization
//By factory method etc.


//static access.
class NestdCls
{
	int sum =0;
	NestdCls()
	{
		System.out.println("default constructor is called");
	}
	public int addTwo(int a, int b)
	{
		sum= a+b;
		return sum;
	}
}

class StaticTests
{
	public static int countryCode=9;
	public int age =0;
	
	public static int grtCc() // static methid is called uing the ca=lass name, so there is no object this
	{
		return countryCode;
	}
	
	public int meth1()
	{
		System.out.println("Inside m1");
		this.meth2(); // specific to a called obejct
		return age;
		
	}
	public void meth2()
	{
		System.out.println("hello");
		this.age++;
	}
}


class Employee
{
	
	private String name;
	private int age ;
	private static int salInc =10;
	// better not set the  static variable value in the construcuotr, as the value is of the class and is not specific to any object.
	Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static int getSalInc() {
		return salInc;
	}
	public static void setSalInc(int salInc) {
		Employee.salInc = salInc;
	}
	
	@Override
	public String toString()
	{
		return ("hi name is "+this.getName()+
				".\n age is"+this.age+
				".\nsalary increment :"+Employee.salInc);
	}
	
	 
}

// non access modifiers
// static, final , abstract, synchronized , transient, volatile, native

public class Oops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NestdCls ns = new NestdCls();
		int sums = ns.addTwo(4, 5);
		System.out.println(sums);
	}

}
