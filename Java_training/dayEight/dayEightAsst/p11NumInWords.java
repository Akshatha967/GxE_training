package dayEightAsst;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p11NumInWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		Pattern pattern = Pattern.compile("\\d*");
		Matcher matcher = pattern.matcher(num);
		
		while(matcher.find())
		{
			System.out.print(matcher.group());
		}

	}

}
