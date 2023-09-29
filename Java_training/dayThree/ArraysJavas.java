package dayThrees;

import java.lang.reflect.Array;
import java.util.Arrays;

class Arays
{
	public void fun()
	{
		// this one is followed usually. rather than int arr[]
		
		int[] arrays; 
		byte[] barr; 
		short[] sarr; 
		
		arrays = new int[10];
		arrays[0]=100;
		arrays[1]=200;
		
	}
	
	public static void multidimarr()
	{
		String[][] names = {
				{"mr", "ms", "mrs"},
				{"smitih","Jones"}
		};
		System.out.println(names[0][0]+" "+names[1][1]);
		System.out.println(names[0][2]+" "+names[1][0]);
		System.out.println(names[0].length);
	}
	
	public void arrmanup() {
		String copyFrom[]= {
				"ocean","space","mountain"};
		
	}
	public void arrfunctions()
	{
//		parallelPrefix
//		mismatch
//		hashcode
//		equals
//		equals
//		copyof range
		
	}
	
	public void indexSearch()
	{
		int[] ar = {1,45,23,12,3,90};
		Arrays.sort(ar);
		System.out.println("sorting annnnd searching: "+Arrays.binarySearch(ar, 12));
		
	}
	
	public void jaggedarrr()
	{
		int[][] ja = new int[4][];
		int[] ar1 = {3,4,5,6};
		int[] ar2 = {7,8,9,10};
		int[] ar3 = { 11,12,13,14};
		ja[0]=ar1;
		ja[1]=ar2;
		ja[2]=ar3;
		
		System.out.println(Arrays.deepToString(ja));
		
		
	}
	
	public static void staticrefl()
	{
		int arr_size =10;
		
		int[] int_ar =(int[]) Array.newInstance(int.class, arr_size);
		System.out.println(Arrays.toString(int_ar));
		System.out.println(Array.get(int_ar, 0));
		System.out.println(Array.getLength(int_ar));
	}
	
	
			
	
}
public class ArraysJavas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arays ar = new Arays();
		Arays.multidimarr();
		ar.jaggedarrr();
		Arays.staticrefl();
		}

}
