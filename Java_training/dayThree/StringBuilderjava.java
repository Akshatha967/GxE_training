package dayThrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class StringBuf
{
	public static String remSpaces(String s)
	{
		StringBuffer sb = new StringBuffer ();
		for(int i=0;i<s.length();i++)
		{
			if(!(Character.isWhitespace(s.charAt(i))))
			{
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
}
public class StringBuilderjava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		StringBuilder sb = new StringBuilder (s);
		sb.append(", Welcome back!");
		System.out.println(sb.toString());
		
		System.out.println("***Removing whitespaces using StringBuffer***");
		System.out.println("Enter the string:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		System.out.println(StringBuf.remSpaces(str));
		
		
	}

}
