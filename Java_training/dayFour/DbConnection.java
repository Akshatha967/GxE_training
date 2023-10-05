package dayFour;
class Db
{
	String name;
	public static void Welcome()
	{
		System.out.println("welcome to db");
	}
	public  void dbName(String name)
	{
		System.out.println("Creating a databse");
		this.name = name;
		
	}
	
}

class Oracledb extends Db
{
	// over hiding of the method.
	public static void Welcome()
	{
		System.out.println("welcome to oracle db");
	}
	
	// method of the oracle class
	public void getSpecs()
	{
		System.out.println("speed, storage, consistency, transparency, atomicity");
	}
}

public class DbConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Db newdb = new Oracledb();
		newdb.dbName("oracle");
		
		Oracledb.Welcome();// if the static method is not present, then the super class method is printed.
		Oracledb odb1 = new Oracledb();
		odb1.getSpecs();
		
	}
}
