package dayThrees;

import java.util.StringJoiner;
import java.util.StringTokenizer;

class Strings
{
	public void createStr ()
	{
		String greet = "hello world";
		System.out.println(greet);
		
		char[] greetings = {'h','e','l','l','o'};
		String hello = new String(greetings);
		System.out.println(hello);
		getAttr(hello);
		
		
	}
	
	public void getAttr(String str)
	{
		System.out.println("length :"+ str.length());
	}
	
	public void conCats(String s1, String s2)
	{
		System.out.println(s1.concat(s2));
		System.out.println("hello".concat(s2));
		System.out.println("hello"+s2);
	}
	
	public void strFormat(String name, int age,String company)
	{
		System.out.printf("hello, i am %s",name);
		
		String fs = String.format("\nthe age is : %d "+"\nthe company name is: %s",age,company );
		System.out.println(fs);
	}
	
	public void convertStrToNum(String str)
	{
		float a = Float.valueOf(str);
		System.out.println(a);
	}
	
	public void numTostr(int num, double dnum)
	{
		System.out.println(Integer.toString(num));
		System.out.println(Double.toString(dnum));
		String s2 = String.valueOf(num);
		System.out.println(s2);
	}
	
	public void charManip(String str, int index)
	{
		//charAt and substring
		char a = str.charAt(index);
		System.out.println(a);
	}
	
	public void regEx()
	{
//		String[] split(String regex)
//		String[] split(sString regex, index)
		
	}
	
	public void search(String str, char c)
	{
		System.out.println(str.indexOf(c));
		System.out.println(str.lastIndexOf(c));
		
	}
	
	public void replaceStr(String str, char oldchar, char newchar)
	{
		str.replace(oldchar, newchar);
		
	}
	
	public void comparesStr(String str)
	{
		str.endsWith("hello");
		str.startsWith("hello");
		str.startsWith("hello",2);
		str.compareTo("hello");
		//str.matches(String regex)
	}

	public static void immutable()
	{
		//created in heap, a string common pool
		// first concat is an unreferenced pool.
		String s1 = "hello";
		String s2 = "hello";
		String s3= s1;
		s2="its great";
		s1.concat("world");
		String s4 = s1.concat("bye");
		
		System.out.printf("s1 is %s, s2 is %s , s3 is %s, s4 is %s",s1,s2,s3,s4);
		
				
	}
}

class StringBuffers
{
	// cn be modified
	// has methods from object  class.
	//	StringBuffer() initial capacity is 16 characters
	//	StringBuffer(CharSequence sq) 
	//	StringBuffer(int capacity)
	//	StringBuffer(String str)
	
	public static void functions()
	{
		StringBuffer strs = new StringBuffer("Javadata");
		strs.append("test");
		strs.insert(4,"test");
		System.out.println(strs);
		
		StringBuffer str1 = new StringBuffer("Trainindata");
		str1.replace(3, 5, "-xxx-");
		str1.delete(10,12);
		System.out.println(str1);
		
		//reverese capacity
		StringBuffer str2 =  new StringBuffer("reverse and capacity");
		str2.reverse();
		System.out.println(str2+" "+str2.capacity());
		
		//ensure capacity and delete char at
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		sb1.append("java");
		System.out.println(sb1.capacity());
		sb1.append("programming in java");
		System.out.println(sb1.capacity());
		sb1.ensureCapacity(10);
		System.out.println(str2.charAt(2));

	}
	
	
	
	
}

class StringBuilders
{
	// provides mutable sequenceof characrers
	//treaated ike variable length arrays.
	// length and content can be changes through method invocations
	
	public void StringBuilderfuns()
	{
		//lenght , capacity
		StringBuilder sbs = new StringBuilder();
		sbs.append("greetings");
	}
	
}

class StringTokenzr
{
	// break strings into small pieces.
	// simpler than sr=tream tokenizer.
	// don;t recognise any  identifiers, numbers, quoted strings, etc
	public static void funsTokens()
	{
		StringTokenizer st = new StringTokenizer("Stringtokenizer is a part of java.util");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			
		}
		
		StringTokenizer  st1 = new StringTokenizer("29/09/2001","/");
		int ntkn;
		ntkn = st1.countTokens();
		System.out.println("Number of tokens : "+ntkn);
		
	}
}

class StringJoiners
{
	public static void funSj()
	{
		StringJoiner sj = new StringJoiner(":","[","]");
		sj.add("galaxe").add("solutoins").add("employee");
		System.out.println(sj.toString());
		
	}
	
	
}
public class StringsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string is immutable in java : because of concurrency , synchronization, class loaders

		Strings s1 =  new Strings();
		s1.createStr();
		s1.conCats("hello", "world");
		s1.strFormat("Akshatha",22,"galaxe");
		s1.convertStrToNum("14.67");
		s1.numTostr(12, 12.98989876);
		Strings.immutable();
		System.out.println("****");
		
		//methods are pulic and synchronized, can ensure thread safety, it is slow
		StringBuffers sb = new StringBuffers();
		StringBuffers.functions();
		
		// cant ensure thread safety cz of multi-threading, it is fast
		StringTokenzr.funsTokens();
		StringJoiners.funSj();
		
		
	}
	

}
