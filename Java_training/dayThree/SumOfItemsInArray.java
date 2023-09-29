package dayThrees;

public class SumOfItemsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,40,50,60};
		int sums = getSum(arr);
		System.out.println(sums);
		

	}
	
	public static int getSum(int[] ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
	}

}
