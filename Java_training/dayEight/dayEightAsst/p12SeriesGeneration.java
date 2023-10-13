package dayEightAsst;

import java.util.Scanner;

public class p12SeriesGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		evenSq(n);
		natNum(n);
		powNum(n);
		threeSum(n);
		sqNum(n);
		series(n);
	}
	
	public static void evenSq(int n)
	{
		for(int i=2;i*i<=n;i=i+2)
		{
			System.out.print(i*i+", ");
		}
		System.out.println();
	}
	
	public static void natNum(int n) {
		int i=1;
		while(i<=n)
		{
			System.out.print(i+", ");
			i++;
		}
		System.out.println();
	}
	
	public static void powNum(int n) {
		for(int i=1;Math.pow(i, i)<=n;i++)
		{
			System.out.print((int)Math.pow(i, i)+", ");
		}
		System.out.println();
	}
	
	public static void threeSum(int n)
	{
		int sum=0;
		int[] ar= {1,4,7};
		int n1=1;
		int n2=4;
		int n3=7;
		System.out.print("1,4,7,");
		while(sum<=n)
		{
			sum=n1+n2+n3;
			System.out.print(sum+", ");
			n1=n2;
			n2=n3;
			n3=sum;
	
		}
		System.out.println();
	}
	
	public static void sqNum(int n)
	{
		for(int i=1;i*i<=n;i++)
		{
			System.out.print(i*i+", ");
		}
		System.out.println();
	}
	
	public static void series(int n)
	{
		int prev = 1;
		System.out.print(prev+", ");
		for(int i=4;i+prev<=n;i=i*2)
		{
			int present = prev +i;
			//System.out.print(prev+" + "+i+" = ");
			System.out.print(present+", ");
			prev = present;
		}
		System.out.println();
	}
}
