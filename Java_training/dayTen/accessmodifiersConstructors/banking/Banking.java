package banking;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c1 = new Client("akshatha");
		
		System.out.println("deposits :");
		c1.deposit();
		System.out.println("Exception overriding:");
		c1.Excptn();
		
		System.out.println("Withdraw overriding :");
		c1.withdraw();
		System.out.println("Interfaces :");
		c1.interfaceEg();
		
		System.out.println("Abstraction:");
		c1.abstractClass();

	}

}
