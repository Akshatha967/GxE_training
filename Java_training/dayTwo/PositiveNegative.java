package dayTwo;

import java.util.Scanner;
class Voting {
	
	private int age;
	private String city="";
	int year =1990;
	Voting(int age , String city)
	{
		this.age = age;
		this.city =city;
	}
	protected void getStatus()
	{
		if (this.age>=18)
		{
			System.out.println("eligible to vote");
			
		}
		else {
			System.out.println("not eligible ot vote");
		}
	}
	
	protected String getState() {
		if (this.city.equals("Bangalore"))
		{
			return "KRANATAKA";
		}
		else if (this.city.equals("chennai"))
		{
			return "TAMIL NADU";
		}
		else {
			return "others";
		}
	}
	
	
				
	}

class PosNeg {
	
		 static void getNumStatus()
		 {
			 Scanner in = new Scanner(System.in);
			System.out.println("Enetr total numbers:");
			int count = in.nextInt();
			
			int sum=0;
			int ct =0;
			for (int i=0;i<count;i++) {
				System.out.println("Enter a number:");
				int num = in.nextInt();
				
				if (num>0)
				{
					System.out.println("positive number");
					sum=sum+num;
					ct=ct+1;
				}
				else if (num<0){
					System.out.println("Negative number");
				}
				else {
					System.out.println("Number is zero");
				}
			}
			System.out.println("sum is :"+sum);
			System.out.println("Average is :"+(sum/ct));
		 }
}
public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PosNeg.getNumStatus();
		
		Voting ob1 = new Voting(13,"Bangalore");
		System.out.println("State : "+ob1.getState());
		System.out.println("The voting status is:");
		ob1.getStatus();
		
		
		
	}

}
