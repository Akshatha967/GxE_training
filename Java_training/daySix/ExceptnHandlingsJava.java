package daySix;

// below is the runtime error example for stack Overflow.




class divExcptn
{
	//int a, b; 
	int ar[]= {1,2,3,4};
	
	public void divide(int c, int d)
	{
		try
		{
			 System.out.println(c / d);
			 ar[c]=d;
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println( e.getMessage());
		}
		//multiple catches
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println( e.getMessage());
		}
	}
	
	public void multipltry(int a , int b, int c)
	{
		
		try{
			System.out.println(a/b);
			try{
				ar[a]=c;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println( e.getMessage());
			}
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println( e.getMessage());
			
		}
		
	}
}
class StackOverflw
{
	public void m1()
	{
		System.out.println("inside method 1");
		this.m2();
	}
	
	public void m2()
	{
		System.out.println("inside method 2");
		this.m1();
	}
}

public class ExceptnHandlingsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 StackOverflw ob1 = new  StackOverflw();
		 //ob1.m1();
		 
		 divExcptn div = new divExcptn();
		 div.divide(2,7);
		 div.divide(7, 2);
		 
		 
		 System.out.println("multiple try blocks: ");
		 div.multipltry(8, 7, 10);
		 div.multipltry(2, 0, 10);
		 

	}

}
