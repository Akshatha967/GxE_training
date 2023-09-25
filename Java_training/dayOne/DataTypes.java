package dayOne;

import java.util.Arrays;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		boolean t= true; 
		boolean f = false; 
		System.out.println("Boolean : "+t+" "+f);
		
		// Numeric-Integer value - integer
		byte bmax = 127;
		byte bmin = -128;
		System.out.println("Bye :"+bmax+" "+bmin);
		
		//short, int , long
		short smin= -32768;
		short smax = 32767;
		
		System.out.println("short :"+smin+""+smax);
		
		long longmin = -9223372036854775808L;
		long longmax =9223372036854775807L ;
		
		System.out.println("long :"+longmin+""+longmax);
		
		
		float float1 = 1.00f;
		float float2= 8.9f;
		
		System.out.println("float :"+float1+""+float2);
		
		float double1 = 1.00f;
		float double2= 8.9f;
		
		System.out.println("double :"+double1+""+double2);
		
		
		//Non primitive data types references 
		//Arrays
		int[] arr1 = {10,20,30,40,50};
		int[] arr2= arr1;
		
		
		
		
		arr2[1]=25;
		System.out.println("arr1: "+Arrays.toString(arr1) + " arr2: "+ Arrays.toString(arr2));
		
		System.out.println("address: "+arr1+" "+arr2[0]);
		
		//Strings
		String name = new String("akshatha");
		System.out.println(name);

	}

}
