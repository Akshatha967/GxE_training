package dayOne;

class InstanceVar
{
	// static varible 
	public static int  a=10;
	// instance variable
	int y=20;
	
	public static void displaya() {
		// java doesn't allow creation of static variable inside the function.
		//static int staticvar =10;
		System.out.println("static method inside: ");
		
		System.out.println(a);
		//System.out.println(y);
		// we cant use this jeyword, create a instance and then access the non static variable
		InstanceVar b = new InstanceVar();
		System.out.println(b.y);
	}
	
	public void displayanon() {
		 int nonstaticvar =10;
		System.out.println("non static method inside: ");
		System.out.println(InstanceVar.a);
		System.out.println(a);
		System.out.println(y);
	}
	
	
}

class InstanceInitialize {
	
	String name;
	int age ;
	static String office = "galaxe";
	
	InstanceInitialize(String name, int age)
	{
		this.name = name ;
		this.age =age;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public int getage()
	{
		return this.age;
	}
	public static String getOffice()
	{
		// static method to access static variable
		// static method can;t use this keyword, as it is a common method and not specific to any object
		return office;
	}
}

public class VariableTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVar a = new InstanceVar();
		a.displayanon();
		InstanceVar.displaya();
		// instance variable access 
		// non static instance variable
		System.out.println(a.y);
		// static instance variable
		System.out.println(InstanceVar.a);
		
		increment();
		increment();
		
		//instance variables 
		InstanceInitialize instVar = new InstanceInitialize("akshatha",22);
		System.out.println(instVar.getname());
		System.out.println(instVar.getage());
		System.out.println(InstanceInitialize.getOffice());
		
		
		
		
		
		

	}
	
	public static void increment()
	{
		//local variable
		int locvar =10;
		System.out.println("Increment: "+locvar);
		locvar++;
		
	}
	
	public static void decrement()
	{
		// doesn't work as the local var is local to the function in which it is declared.
		//locavar--;
	}
	
	

}
