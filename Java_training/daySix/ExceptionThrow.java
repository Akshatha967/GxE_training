package daySix;



class MyExceptn extends Exception{
	
	public MyExceptn(String str) {
		super(str);
	}
}

class ThrowExc
{
	public void throwExc()
	{
		try
		{
			throw new NullPointerException(" throw NullPointerException: done");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void throwMyexc() throws MyExceptn
	{
		try
		{
			throw new MyExceptn  ("throw MyExceptn: My exception is called");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			throw new MyExceptn("rethrow myException");
		}
		finally
		{
			System.out.println("Done processing inside function .");
		}
	}
	
	
	public void propagateExc() {
		
		throw new NullPointerException("Propagated exception catch in stack");
	}
	
	public void ppg1() {
		propagateExc();
	}
	
	public void ppg2() {
		try {
			ppg1();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	
	public int returnInExc()
	{
		try{
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return 2;
		}
		//overrides returns in try
		finally {
			return 3;
		}
	}
}
public class ExceptionThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ThrowExc th = new  ThrowExc();
		 th.throwExc();
		 try
		 {
			 th.throwMyexc();
		 }
		 catch(Exception e){
				System.out.println(e.getMessage());
			}
		 finally{
				System.out.println("Done processing inside main .");
			}
		
		 th.ppg2();
		 
		 System.out.println("Return in try-catch-finally");
		 try{
			System.out.println( th.returnInExc());
		 }
		 catch(Exception e){
				System.out.println(e.getMessage());
			}

	}

}
