package dayTwo;

class Controls {
	
	public static void cont() {
		for (int i=1;i<10;i++)
		{
			if (i%2==0)
			{
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	public static  void brk()
	{
		for (int i=1;i<10;i++)
		{
			if (i%2==0)
			{
				break;
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	public static String switches (int num)
	{
		switch(num%2)
		{
		case 0: return  "your age even !!" ; 
		case 1: return "your age has 1 as reminder !"; 
		default: return "Error!! Invalid age :("; 
		
		}
	}
}
public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("for break on even : ");
		Controls.brk();
		System.out.println("for continue on even : ");
		Controls.cont();
		System.out.println(Controls.switches(19));
		System.out.println(Controls.switches(10));
		System.out.println(Controls.switches(-9));
		
	}

}
