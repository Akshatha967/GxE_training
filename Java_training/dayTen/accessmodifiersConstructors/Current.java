package accessmodifiersConstructors;

public class Current {

	static final String nameStaticFinal ="akshatha";
	
	private String name="akshatha";
	private Current() {
		System.out.println(this.name);
	}
	
	Current(String name) {
		System.out.println(this.name);
	}
	
	
	protected Current(String name,int age) {
		System.out.println(this.name);
	}
	

	public String createOb() {
		Current c = new Current();
		return c.name;
	}
	
	
}

