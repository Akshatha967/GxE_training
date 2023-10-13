package InterfaceStaticMeth_dayEight;

interface Families{
	
	public static final String country="India";
	public static String Country()
	{
		return country;
	}
	
	default String getfName()
	{
		return "family";
	}
	
	public void setName(String name);
}


interface USA{
	public static final String country="USA";
	public static String Country()
	{
		return country;
	}
	
	default String getfName()
	{
		return "family";
	}
	
	public void setAge(int age);
}


class Shetty implements Families,USA{

	String name;
	int age;
	
	// method of families interface
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	// default method in both the interface
	@Override
	public String getfName() {
		// TODO Auto-generated method stub
		return Families.super.getfName();
	}
	
	// method of usa interface
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age =age;
	}
	
	// method of the class
	public void getCountry()
	{
		System.out.println(USA.Country());
	}
	
}

public interface  InterfaceStaticMeth {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shetty sh = new Shetty();
		System.out.println(	sh.getfName());
		sh.setAge(10);
		sh.setName("kiddo");
		sh.getCountry();
		
		

	}
}

