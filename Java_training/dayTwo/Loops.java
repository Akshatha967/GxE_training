package dayTwo;

class WhileLoop
{
	
}
// kadanes algorithm 
class ForLoop
{
//	int arr[] ={-2,-3,4,-1,-2,1,5,-3};
	
	static int kadaneAlg(int[] arr) {
		//int arr[]= {4,-5,20};
		System.out.println("The arraypassed is: ");
		for (int element : arr)
		{
			System.out.print(element+", ");
		}
		System.out.println();
		System.out.print("Max sum is : ");
		int max_so_far = arr[0];
		int cur_max = arr[0];
		
		for ( int i=1; i<arr.length;i++)
		{
			cur_max = Math.max(arr[i],cur_max+arr[i]);
			max_so_far = Math.max( cur_max, max_so_far);
		}
		//System.out.println(max_so_far);
		return max_so_far;
	}
	
}


public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(	ForLoop.kadaneAlg(new int[] {-2,-3,4,-1,-2,1,5,-3}));
		
		
	}

}
