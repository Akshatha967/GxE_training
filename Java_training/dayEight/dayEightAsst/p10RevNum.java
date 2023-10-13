package dayEightAsst;

import java.util.Scanner;

public class p10RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		reverse(num);
	}

	public static void reverse(int num) {
		int rev =0;
		while(num!=0) {
			rev= rev*10 + num%10;
			num=num/10;

		}
		System.out.println(rev);
	}
}
