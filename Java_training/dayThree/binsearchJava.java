package dayThrees;

import java.util.Arrays;
import java.util.Scanner;

class Bs
{
	public static int binSearch(int[] ar, int item,int low,int high)
	{
		int mid=(low+high)/2;
		while(low<=high)
		{
			//System.out.println("inside while loop");
			if (ar[mid] == item)
			{
				return mid;
			}
			else if(item>ar[mid])
			{
				return binSearch(ar,item,mid+1,high);
			}
			else {
				return binSearch(ar,item,low, mid-1);
			}	
		}
		return -1;
	}
}

public class binsearchJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbet of elements in array:");
		int n= sc.nextInt();
		int[] ar=new int[n];
		System.out.println("enter the elements of array:");
		for(int j=0;j<n;j++)
		{
			ar[j]=sc.nextInt();
		}
		//Arrays.sort(ar);
		System.out.println("enter the item to search:");
		int item = sc.nextInt();
		int retVal = Bs.binSearch(ar, item, 0, n-1);
		if (retVal>=0)
		{
			System.out.println("The item is found at the index: "+(retVal+1));
		}
		else {
			System.out.println("the item is not present in the array");
		}
		
		//System.out.println(Arrays.binarySearch(ar, item));

	}

}
