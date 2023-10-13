package dayEightAsst;

import java.util.Scanner;

public class p9SumofOddNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the end number ");
		int n = sc.nextInt();
		int sum =0;
		for(int i=1; i<=n;i++)
		{
			if(i%2!=0)
				sum=sum+i;
			
		}
		System.out.println(sum);

	}

}
