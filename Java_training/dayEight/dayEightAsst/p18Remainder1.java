package dayEightAsst;

public class p18Remainder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lcm = 60
		// remainder =1 when divided by 7
		// 7x % 60 = 1
		int multipleCount=1;
		for(int i=1;;i++) {
			if(7*i%60 ==1) {
				if(multipleCount==1 || multipleCount ==2 ||multipleCount==4) {
					System.out.println(7*i);
					
				}
				multipleCount++;
				if(multipleCount==5) {
					break;
				}
			}
		}
	}

}
