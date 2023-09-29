package dayThrees;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malayalam", y="palindromes";
		checkPal(s);
		checkPal(y);
		
		

	}

	
	public static void checkPal(String str)
	{
		char[] ar = str.toCharArray();
		int len = ar.length-1;
		for(int i=0; i<ar.length/2;i++)
		{
			if(ar[i]==ar[len-i])
			{
				continue;
			}
			else {
				System.out.print(str+": Not apalindrome");
				System.exit(0);
			}
		}
		System.out.println(str+" : is a palindrome");
	}
}
