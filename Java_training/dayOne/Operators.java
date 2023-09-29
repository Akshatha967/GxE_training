package dayOne;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arithmetic operators in java
		int a =10, b=10;
		// + - * / % (l-> r)
		System.out.println("a+b :"+(a+b));
		System.out.println("a+b :"+(a-b));
		System.out.println("a+b :"+(a/b));
		System.out.println("a+b :"+(a*b));
		System.out.println("a+b :"+(a%b));
		
		
		// unary operators ++ --  r->left
		int unary=10;
		int uminus = 10;
		System.out.println(unary++ +" "+unary);
		System.out.println(uminus-- +" "+uminus);
		
		
		int unarypre=10;
		int uminuspre= 10;
		System.out.println(++unarypre +" "+unarypre);
		System.out.println(--uminuspre +" "+uminuspre);
		
		// assignment operators : =
		// relational operators : > < >= <= !=
		//Ternary operators
		
		int num = 900;
		String val = num%2==0? "even" : "odd";
		System.out.println(val);
		
		//bitwise operators in java  : cN BE USED WITH ANY INTEGRAL TYPES
		int bit1 = 10; // 1010
		int bit2 =9; //1001
		System.out.println(bit1 | bit2);
		System.out.println(bit1&  bit2);
		
		
	}

}
