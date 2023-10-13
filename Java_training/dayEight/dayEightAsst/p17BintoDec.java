package dayEightAsst;

public class p17BintoDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,0,0,1};
		bintoDec(ar);
	}
	public static void bintoDec(int[] num) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum = (sum*2)+num[i];
		}
		System.out.println(sum);
			
	}

}
