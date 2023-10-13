package dayEightAsst;

public class p15FiborNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibCheck(5);
		fibCheck(10);

	}
	public static void fibCheck(int n) {
		int num1 =0,num2=1;
		for(int i=0;i<n;i++) {
			int sum=num1+num2;
			if(sum==n)
			{
				System.out.println("number is in fib series");
				return;
			}
			num1=num2;
			num2=sum;
		}
		System.out.println("number is not in fib series");
		
	}

}
