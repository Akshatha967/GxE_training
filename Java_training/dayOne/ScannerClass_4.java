package dayOne;

import java.util.Scanner;


class Readfrominp 
{
	public  void function() {
		//local variables are used
	Scanner in = new Scanner(System.in);
	System.out.println("enter name and age");
	String name = in.nextLine();
	int age = in.nextInt();
	//String lastname = in.nextLine();
	in.nextLine();
	String lastname = in.nextLine();
	char chars = in.next().charAt(2);
	
	
	System.out.println(name+" "+age+" "+lastname+" "+chars);
	
	}
}
public class ScannerClass_4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		if (args.length>0)
//		{
//			for (String val : args)
//			{
//				System.out.println(val);
//			}
//		}

	Readfrominp inps = new Readfrominp();
	inps.function();

		

	}

}
