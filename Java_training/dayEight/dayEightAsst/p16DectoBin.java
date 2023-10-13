package dayEightAsst;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p16DectoBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		doubleSeperation(sc.nextDouble());
	}

	public static void decToBin(int num) {
		
		Stack<Integer> s = new Stack<Integer>();
		while(num!=0)
		{
			s.push(num%2);
			num=num/2;
			
		}
		while(s.size()!=0)
		{
			System.out.print(s.pop());
		}
		
	}
	

	public static void doubleSeperation(Double num)
	{
		
		String s = num.toString();
		Pattern pattern = Pattern.compile("\\d*");
		Matcher matcher = pattern.matcher(s);
		//System.out.println(matcher.matches());
		int count=0;
		while(matcher.find()) {
			//System.out.print(matcher.group());
			
			if(matcher.group()=="")
			{
				continue;
			}
			decToBin(Integer.parseInt(matcher.group()));
			count++;
			if(count==1) {
				System.out.print(".");
			}
			
		}
//		int wholeNumber = (int) (num/1);
//		double fractionPart = num%1;
//		System.out.println("whole number is:"+wholeNumber+"Fraction part is:"+fractionPart);
//		
		
	}
}
