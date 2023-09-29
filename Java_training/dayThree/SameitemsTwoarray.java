package dayThrees;

class checkEquality
{
	public static int checkarr(int[] ar1, int[] ar2)
	{
		if(ar1.length!=ar2.length)
		{
			return -1;
		}
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]==ar2[i])
			{
				continue;
			}
			else {
				return -1;
			}
		}
		return 1;
	}
}
public class SameitemsTwoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// assume- integer array
		int[] arr1= {1,9,7,6};
		int[] arr2 = {56,78,65};
		
		int flag = checkEquality.checkarr(arr1,arr2);
		if(flag==1)
		{
			System.out.println("the two arraysare equal");
			
		}
		else
		{
			System.out.println("The arrays are not equal");
		}

	}

}
