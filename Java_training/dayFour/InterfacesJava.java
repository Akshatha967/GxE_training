package dayFour;
// is -a relationship.
/// by default is it a functional inteface.
@FunctionalInterface
interface funIntrface{
	int calculate (int a, int b);
}


interface Customer 
{
	public static final String info="customer";
	public  abstract void tripDetails();
	void paymentGw(); // by default during the creation of .class file it is made as public abstract.
	
	
}

class SustDetails implements Customer 
{

	int cost =100;
	String pgw="online";
	@Override
	public void tripDetails() {
		// TODO Auto-generated method stub
		System.out.println("this is the details pof trip: "+this.cost);
		 
		
		
	}

	@Override
	public void paymentGw() {
		// TODO Auto-generated method stub
		System.out.println("the payment gateway is:"+this.pgw);
		
	}
	
}

public class InterfacesJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SustDetails  cs = new SustDetails();
		System.out.println(cs.info);
		cs.tripDetails();
		cs.paymentGw();
		
		 funIntrface fi = (int a, int b) -> a+b;
		 System.out.println("the sum is: "+fi.calculate(9, 19));

	}

}
