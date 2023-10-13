package accessmodifiersConstructors;

public class Client  {

	
	Client(){
		System.out.println("in the client constructor");
	}
	static {
		System.out.println("sttaic block1");
	}
	static {
		System.out.println("sttaic block2");
	}
	
	static {
		System.out.println("sttaic block3");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Client c = new Client();
		//Private constructor call:
		//Current c = new Current();
		System.out.println(Current.nameStaticFinal);;
		
		
		//default constructor call: 
		Current cDef = 	new Current("akshatha_default constructor call") ;
		
		
		}

}
	
	

