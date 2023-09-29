package dayThrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class revSentence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the sentence to be reversed:");
		String sentence = br.readLine();
		System.out.println("reversed string is:"+revSent(sentence));

	}
	
	public static String revSent (String sentence)
	{
		// add sentence to the character array and read the array in reverse order
		char[] ar= sentence.toCharArray();
		StringBuffer sb = new StringBuffer();
		//System.out.println(sb);
		for(int i=ar.length-1;i>=0;i--)
		{
			sb.append(ar[i]);
			//System.out.println(sb);
		}
		return sb.toString();
	}

}
