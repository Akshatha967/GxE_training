package dayEightAsst;

import java.util.Scanner;

public class p1SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principal amount:");
		float principal = sc.nextFloat();
		System.out.println("enter the rate of interest:");
		float rateOfInterest = sc.nextFloat();
		System.out.println("enter the time in years:");
		int time = sc.nextInt();
		System.out.println("The total simple interest is: "+calculateSI(principal, rateOfInterest, time));
		
				
				

	}
	
	public static float calculateSI(float principal, float rateOfInterest, int time)
	{
		float amount = (principal*rateOfInterest*time)/100;
		return amount;
	}

}
