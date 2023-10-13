package defaultStaticInterface_dayEight;

public class p16DectoBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		decToBin(29);
	}

	public static void decToBin(int num) {
		while(num!=0)
		{
			System.out.print(num%2);
			num=num/2;
			
		}
		
		System.out.println();
	}
}
