package dayTwo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Items implements Serializable
{
	int item;
	float price;
	Items (int item, float price)
	{
		this.item = item;
		this.price  = price;
	}
}

class Person
{
	String name;
	Person(String name){
		this.name = name;
	}
	public int display(int item)
	{
		
		System.out.println("available items:");
		switch(item)
		{
			case 1 : return 1000;
			case 2: return 100;
			case 3 : return 2000;
			case 4: return 100;
			default: return 0;
			
		}
		
		
	}
	public void addCart() throws IOException
	{
		System.out.println("enter tota cart items:");
		Scanner num = new Scanner(System.in);
		int nums = num.nextInt();
		List<Items> cart = new ArrayList<>();
		//File f1 = new File("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\cart.txt");
		
		for(int i=0;i<nums;i++)
		{
			System.out.println("enter item and price: ");
			System.out.println("available items:");
			System.out.println("1.Shamoo 2.tops 3.laptop 4.headphones");
			num.nextLine();
			int iname=num.nextInt();
			
			//System.out.println("-enter price -");
			float iprice = display(iname);
			if(iprice ==0)
			{
				System.out.println("item unavailable!");
				System.exit(0);
			}
			Items it = new Items(iname,iprice);
			cart.add(it);
			
		}
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\cart.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cart);
		oos.close();
		
	}
	
	public void getRes () throws ClassNotFoundException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\cart.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Items> cart2 = ( ArrayList) ois.readObject();;
		float sum=0;
		for (Items it : cart2 )
		{
//			System.out.println(sum);
//			System.out.println(it);
			sum=sum+it.price;
			//System.out.println(sum);
		}
		System.out.println(sum);
		if(sum>2500)
		{
			System.out.println("greater than 2.5k"+sum);
			float res = (float)0.9*sum;
			System.out.println(res);
			System.out.println("pay : "+res);
		}
		else if(sum>2000)
		{
			float res =(float)0.95*sum;
			System.out.println("pay : "+res);
		}
	}  
	
}


public class CartFlip {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Person p = new Person("akshatha");
		System.out.println(p.name);
		//Scanner num = new Scanner(System.in);
		//int nums = num.nextInt();
		
		p.addCart();
		p.getRes();
		
		Person t = new Person ("thrishala");
		System.out.println(t.name);
		p.addCart();
		p.getRes();
		
		

	}

}
