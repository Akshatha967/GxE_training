package dayFour;

// compile time polymorphism displayed beow with addition examples.
class Add{
	// runtime and compile time polymorphism
	// method overloading
	// method overriding
	int sum =0;
	double add(int a, int b){	
		return a+b;	
	}
	
	protected double add(double a , double b, double c)
	{
		return a+b+c;
	}
	
	public float add ( float a)
	{
		return a;
	}
}

//runtime polymorphism 

class Bank
{
	String name;
	Bank(String name)
	{
		this.name = name;
		
	}
	
	{
	System.out.println("Welcome to banking in non static");
	}
	
	static {
		System.out.println("Welcome to banking in static");
	}
	
	public void getName()
	{
		System.out.println("Name is : "+this.name);
	}
	
	
	
}

class SBI extends Bank
{

	static int interest =9;
	SBI(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public static void getInterest() {
	System.out.println("interest is: "+interest);
	}
	
}

public class PolymorphJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add ad = new Add();
		System.out.println("2 pars: "+ad.add(10,40)+
		"; 3 params "+ad.add(10,20,30)+
		"; 1 paras "+ad.add(10.78,40.88,78.78));
		
		Bank bank1 = new SBI("SBI_BANKING");
		bank1.getName();
		SBI.getInterest();
		
		
	}

}
