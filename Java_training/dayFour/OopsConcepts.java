package dayFour;
// can have both abstract and non abstract methods.
// shud be extended and methods implemented,
// can't be instantiated 
// ca have constructors and static methods
// final methods will force to not to change the body of the method.

//abstraction through 
// abstract class and interface

abstract class Abs 
{
	public static  String name;
	public int dsp;
	public String color;
	public abstract void driveSpeed(int Ds);
	public abstract void color(String Cl);
	
	public static final void name(String name) {
		Abs.name = name;
	}
	
	Abs(String name){
		
		Abs.name = name;
	}
	
	
}

class Car extends Abs
{
	public static final int numWheels=4;
	public int numAc ;

	Car(String name) {
		super(name);
		
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void  driveSpeed(int ds) {
		// TODO Auto-generated method stub
		super.dsp=ds;
	}

	@Override
	public void color(String cl) {
		// TODO Auto-generated method stub
		super.color=cl;
	}
	
	public static int getNumwheels ()
	{
		return numWheels;
	}
	
	public int setNumac(int numac)
	{
		this.numAc=numac;
		return numac;
	}
	
	
}
public class OopsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abs  ob1 = new Car("toyota");
		ob1.color="blue";
		System.out.println(ob1.color);
		// ob1 cant access the methods and variables of car alone, only inherited ones can be accesssed this way.
		
		Car  ob11 = new Car("toyota");
		ob11.color="blue";
		System.out.println(Car.getNumwheels());
		System.out.println(ob11.setNumac(4));
		
		Abs  ob2 = new Car("suzuki");
		ob2.color="yello";
		System.out.println(ob2.color);
		
		System.out.println(ob1.color+" "+ob2.color);
		
		
		
	}

}
