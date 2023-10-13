package dayEightAsst;

import java.util.HashMap;
import java.util.Scanner;

class NumsTowords{
	private static HashMap<Integer,String> tenPow = new HashMap<Integer,String>();	
	private static HashMap<Integer,String> hm = new HashMap<Integer,String>();
	
	NumsTowords(){
		hm.put(1,"One");
		hm.put(2,"Two");
		hm.put(3,"Three");
		hm.put(4,"Four");
		hm.put(5,"Five");
		hm.put(6,"Six");
		hm.put(7,"Seven");
		hm.put(8,"Eight");
		hm.put(9,"Nine");
		hm.put(0,"Zero");
		
		hm.put(10,"Ten");
		hm.put(11,"Eleven");
		hm.put(12,"Twelve");
		hm.put(13,"Thirteen");
		hm.put(14,"Fourteen");
		hm.put(15,"Fifteen");
		hm.put(16,"Sixteen");
		hm.put(17,"Seventeen");
		hm.put(18,"Eighteen");
		hm.put(19,"Nineteen");
		hm.put(20,"Twenty");
		
		hm.put(30,"Thirty");
		hm.put(40,"Forty");
		hm.put(50,"Fifty");
		hm.put(60,"Sixty");
		hm.put(70,"Seventy");
		hm.put(80,"Eighty");
		hm.put(90,"Ninety");
		
		tenPow.put(100,"Hundred");
		tenPow.put(1000,"Thousand");
		tenPow.put(100000,"Lakh");
		tenPow.put(10000000, "crore");
	}
	
	
	
	public static void printNonZeroNum(int pow,int num,int prev) {
		
		if(tenPow.get(pow)!=null) {
			
			if(prev==1) {
				if(pow==1000 || pow==100000 || pow==10000000) {
					System.out.print(hm.get(10+num)+" ");
				}
			}
			else if(num!=0){
				//System.out.println(";;");
				System.out.print(hm.get(num)+" ");
			}
			
			System.out.print(tenPow.get(pow)+" ");
		}
		
	}
	
	public static void printZer(int pow,int num) {
		if(tenPow.get(pow)!=null) { 
			if(pow==1000 ||   pow==100000  || pow==10000000) {
				System.out.print(hm.get(10+num)+" ");
				System.out.print(tenPow.get(pow)+" ");
		}		
	  }	
	}
	
	public static void checkLastNum(int lens, int num, int i) {
		if(lens-1-i==0) {
			System.out.print(hm.get(num)+" ");
		}
	}
	public static void amountToWords(char[] ar){
		int lens = ar.length;
		for(int i=0;i<lens;i++) {
			//System.out.println(ar[i]);
			Integer prev=999;
			Integer num = Integer.parseInt(String.valueOf(ar[i]));
			if(i!=0) {
			prev = Integer.parseInt(String.valueOf(ar[i-1]));
			}
			Double val = new Double( Math.pow(10, lens-1-i));
			Integer pow =val.intValue();

			if(num!=0) {
				checkLastNum(lens, num,  i);
				if(lens-1-i==1 ) {
					System.out.print(hm.get(num*10)+" ");	
				}
				else if(num>1) {
					if(pow==10000 || pow==1000000 || pow ==100000000) {
						System.out.print(hm.get(num*10)+" ");
					}
				}
				
				else {
					
					printNonZeroNum(pow,num,prev);
				}
			}
			
			else if(lens==1) {
			checkLastNum(lens, num,  i);
			}
			else if(prev==1){
				printZer(pow,num);
			}
			else if(prev!=0) {
				printZer(pow,num);
			}
		}
		
		System.out.print("Only");
	}
	
}

public class p20UsingFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a positive Integer within the range of 99lakh");
		String num = sc.next();
		char[] ar = num.toCharArray();
		NumsTowords n = new NumsTowords();
		NumsTowords.amountToWords(ar);

	}

}
