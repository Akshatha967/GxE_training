package dayEightAsst;

import java.util.Scanner;

public class p3EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = sc.nextInt();
		System.out.println(checkNum(num));

	}
	
	public static String checkNum(int num) {
		return num%2==0? "even":"odd";
	}

}
