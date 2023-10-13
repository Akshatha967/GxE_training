package defaultStaticInterface_dayEight;

interface defInterface{
	default String defmeth() {
		return "Welcome to SBI banking";
	}
	
	default String greet(int age){
		return "thats a great day today!";
	}
	public void setAge(int age);
	
	
	default void area()
	{
		System.out.println("bangalore");
	}
}

interface Transport{
	default void defTransport()
	{
		System.out.println("welcome to transportation");
	}
	
	default String greet(int age){
		return "thats a great day today! how do you feel?";
	}
	public int getCharge();
	default void area()
	{
		System.out.println("Kashmir");
	}
	
}

abstract class  Area implements Transport, defInterface{
	public abstract void area();

	@Override
	public String greet(int age) {
		// TODO Auto-generated method stub
		return defInterface.super.greet(age);
	}
	
}

class Mysore extends Area{

	@Override
	public int getCharge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("are is mysore");
		
	}
	
}
class Banking implements defInterface,Transport{

	int charge =10;
	int age =10;
	
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;
		
	}

	@Override
	public int getCharge() {
		// TODO Auto-generated method stub
		return this.charge;
	}

	@Override
	public String greet(int age) {
		// TODO Auto-generated method stub
		// have to implement and use one or write your own
		if(age>10)
		{
		return defInterface.super.greet(age);
		}
		else
		{
			return Transport.super.greet(age);
		}
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		defInterface.super.area();
	}

	
	
}



public class InterfaceDefaultMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banking b1 = new Banking();
		b1.setAge(10);
		System.out.println(b1.getCharge());
		System.out.println(b1.greet(10));
		b1.area();

	}

}
