package dayEightAsst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class p20AmountinWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> tenPow = new HashMap<Integer,String>();
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
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
		//tenPow.put(100000,"Lakh");
		//tenPow.put(10000000,"crore");
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a positive Integer within the range of 99lakh");
		String num = sc.next();
		char[] ar = num.toCharArray();
		amountToWords(ar, ar.length,hm,tenPow);

	}
	public static void amountToWords(char[] ar, int len, HashMap<Integer,String> hm, HashMap<Integer,String> tenPow)
	{
		//HashMap<Integer,String> hm = new HashMap<Integer,String>();		
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
				if(lens-1-i==1 ) {
					System.out.print(hm.get(num*10)+" ");
					
				}
				
				else if(lens-1-i==0 ) {
					System.out.print(hm.get(num)+" ");
					
				}
				else if(pow==10000) {
					//System.out.println("--");
					//50000 etc shud not print zero hence >1
					if(num>1) {
					System.out.print(hm.get(num*10)+" ");
					}
				
				}
				else if(pow==1000000) {
					//System.out.println("--");
					//5000000 etc
					if(num>1) {
					System.out.print(hm.get(num*10)+" ");
					}
				
				}
				else if(tenPow.get(pow)!=null) {
					//System.out.println("--))");
					//12000
					if(prev==1 && pow==1000) {
						System.out.print(hm.get(10+num)+" ");
					}
					//1200000-> twelve
					else if(prev==1 && pow==100000) {
						System.out.print(hm.get(10+num)+" ");
					}
					//remaining no's like 3000 -> three  
					else {
					System.out.print(hm.get(num)+" ");
					}
					//thousand , hundred etc
					System.out.print(tenPow.get(pow)+" ");
				}
			}
			else if(lens-1-i==0 && lens==1 ) {
				System.out.print(hm.get(num)+" ");
				
			}
			else if(tenPow.get(pow)!=null) {
				//System.out.println("--))");
				if(prev==1 && pow==1000) {
					System.out.print(hm.get(10+num)+" ");
					System.out.print(tenPow.get(pow)+" ");
				}
				else if(prev==1 && pow==100000) {
					System.out.print(hm.get(10+num)+" ");
					System.out.print(tenPow.get(pow)+" ");
				}
				
				
			}
			else if(tenPow.get(pow)!=null && pow==1000 && prev!=0) {
				//System.out.println("--))");
				//System.out.print(hm.get(num)+" ");
				// 30000-> after printing thierty to print thousand
				System.out.print(tenPow.get(pow)+" ");
				
			}
			else if(tenPow.get(pow)!=null && pow==100000 && prev!=0) {
				//System.out.println("--))");
				//System.out.print(hm.get(num)+" ");
				System.out.print(tenPow.get(pow)+" ");			
			}

		}
		System.out.print("Only");
		
	}

}
