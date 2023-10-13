package accessmodifiersConstructorsPubandProtected;

public class CurrentProtecPub {

	protected String name="Akshatha_outside_package";
	protected CurrentProtecPub() {
		
		System.out.println(name);
	}
	
	public CurrentProtecPub(String name) {
		
	}
}
