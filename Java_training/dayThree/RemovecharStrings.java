package dayThrees;

import java.util.Scanner;

public class RemovecharStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("enter the string:");
		String s = in.next();
		System.out.println("enter the character to remove:");
		char c = in.next().charAt(0);
		int index = s.indexOf(c);
		// mutable bufferclass is used for removing character from string
		StringBuffer str1 = new StringBuffer(s);
		String res = removeChar(s,index);
		System.out.println("the result is :"+res);
		
		
	}
	
	public static String removeChar(String s, int index)
	{
		StringBuffer str1 = new StringBuffer(s);
		str1.delete(index, index+1);
		String str =str1.toString();
		return str;
	}

}
;