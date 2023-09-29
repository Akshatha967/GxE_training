package dayThrees;



public class RemoveDupfromArray {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10,20,20,89,78,89,67,9,20,78,20,8};
		int ind = remDup(ar,0,ar.length);
		for(int i=0;i<ind;i++)
		{
			System.out.println(ar[i]);
		}

	}
	

	public static int remDup(int[] ar, int start, int end)
	{
		int index=0;
		ar[index++]=ar[0];
		for(int i=1;i<end;i++)
		{
			int flag=0;
			for(int j=i-1;j>=0;j--)// 0 to i-1
			{
				if(ar[i]==ar[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				ar[index++]=ar[i];
			}
		}
		return index;
	}

}
