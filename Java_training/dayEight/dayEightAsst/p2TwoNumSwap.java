package dayEightAsst;

import java.util.Scanner;

public class p2TwoNumSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("enter the second number:");
		int num2 = sc.nextInt();
		System.out.println("the entered numbers are:"+num1+" and "+num2);
		swap(num1,num2);

	}

	public static void swap(int a ,int b)
	{
		a=a+b;
		b=a-b;	
		a=a-b;
		System.out.println("The numbers after swapping are:"+a+" and "+b);
	
	}
}
