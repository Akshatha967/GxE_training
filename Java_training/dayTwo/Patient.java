package dayTwo;

public class Patient {

	int Id;
	String name;
	// visible within same package : default
	void setId(int i) {
		// TODO Auto-generated method stub
		this.Id =i;
		
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
		this.name = string;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return this.Id;
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		
		return this.name;
	}

}
