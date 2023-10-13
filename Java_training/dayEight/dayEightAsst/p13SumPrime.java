package dayEightAsst;

public class p13SumPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sumofPrimes(23,57);
	}
	public static void sumofPrimes(int n, int m)
	{
		int sum=0,flag=0;
		for(int i=n;i<=m;i++)
		{
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1) {
				flag=0;
				continue;
			}
			else {
				sum=sum+i;
				System.out.print(i+", ");
			}
		}
		System.out.println();
		System.out.println(sum);
	}

}
