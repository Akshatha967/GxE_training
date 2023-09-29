package dayOne;


class Modifier{
	
	private int a =10;
	void display ()
	{
		System.out.println(a);
	}
	//default
	int b =20;
	void display2() {
		System.out.println(b);
	}
	
	protected int c =30;
	void display3() {
		System.out.println(c);
	}
	
	public int d =40;
	void display4() {
		System.out.println(d);
	}
	
}
public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Modifier m = new Modifier();
		m.display();
		//System.out.println(m.a);
		
		m.display2();
		System.out.println(m.b);
		
		m.display3();
		System.out.println(m.c);
		
		m.display4();
		System.out.println(m.d);
			
	}

}
