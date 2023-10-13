package dayEightAsst;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p4DoubleValSeperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		doubleSeperation(num);

	}
	
	public static void doubleSeperation(Double num)
	{
		
		String s = num.toString();
		Pattern pattern = Pattern.compile("\\d*");
		Matcher matcher = pattern.matcher(s);
		//System.out.println(matcher.matches());
		int count=0;
		while(matcher.find()) {
			System.out.print(matcher.group());
			count++;
			if(count==1) {
				System.out.println();
				System.out.print("0.");
			}
		}
//		int wholeNumber = (int) (num/1);
//		double fractionPart = num%1;
//		System.out.println("whole number is:"+wholeNumber+"Fraction part is:"+fractionPart);
//		
		
	}


}
