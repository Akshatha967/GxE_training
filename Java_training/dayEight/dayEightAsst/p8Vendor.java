package dayEightAsst;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

interface Resources{

//	public void setdollarPerHour(float dolPerHour);
//	public float getdollarPerHour();
//	
	//public static float getPaypercent();
	public static  float  getRes(String name, float cost) {
		return 0;
	}
	
}


abstract class softwareLicences implements Resources{
	String name;
	float Itemcost=0;;
	//float clientPay=0;
	
	public softwareLicences(String name, float cost) {
		super();
		this.name = name;
		this.Itemcost = cost;
	}
	
	
}

class Consultants extends softwareLicences  implements Resources{

	
	private static HashMap<String,Float> cons = new HashMap<String,Float>();
	public Consultants(String name, float cost) {
		super(name, cost);
		cons.put(name, cost);
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public void setdollarPerHour(float dolPerHour) {
//		// TODO Auto-generated method stub
//		this.Itemcost=dolPerHour;
//	}
//
//	@Override
//	public float getdollarPerHour() {
//		// TODO Auto-generated method stub
//		return this.Itemcost;
//	}

	
	public static float getRes(String name, float cost) {
		// TODO Auto-generated method stub
		if(cons.containsKey(name)){
		
			return cons.get(name);
		}
		else {
			cons.put(name, (float) 100);
			return 100;
		}
	}

	
	
}

class Hardware extends softwareLicences  implements Resources{
	private static float percentPay=(float) 0.3;

	private static HashMap<String,Float> hardwares = new HashMap<String,Float>();
	public Hardware(String name, float cost) {
		super(name, cost);
		
		hardwares.put(name,cost);
		// TODO Auto-generated constructor stub
	}


//	@Override
//	public void setdollarPerHour(float dolPerHour) {
//		// TODO Auto-generated method stub
//		this.Itemcost=dolPerHour;
//	}
//
//	@Override
//	public float getdollarPerHour() {
//		// TODO Auto-generated method stub
//		return this.getdollarPerHour();
//	}


	public static float getPercentPay() {
		return percentPay;
	}
	
	public static float getRes(String name){
		if(hardwares.containsKey(name)) {
		return hardwares.get(name);
		}
		else {
			hardwares.put(name, (float) 100);
			return 100;
		}
		
		// TODO Auto-generated method stub
		
	}
	
}


class FrequenlyUsedSw extends softwareLicences{

	private static HashMap<String,Float> freqSoftware= new HashMap<String,Float>();
	private static float percentPay=(float) 0.5;
	
	public FrequenlyUsedSw(String name, float cost) {
		super(name, cost);
		//this.clientPay=(float)0.5;
		freqSoftware.put(this.name, this.Itemcost);
		// TODO Auto-generated constructor stub
	}

	

//	@Override
//	public void setdollarPerHour(float dolPerHour) {
//		// TODO Auto-generated method stub
//		this.Itemcost=dolPerHour;
//	}
//
//	@Override
//	public float getdollarPerHour() {
//		// TODO Auto-generated method stub
//		return this.Itemcost;
//	}

	public static float getPercentPay() {
		return percentPay;
	}
	

	
	public static float getRes(String name) {
		// TODO Auto-generated method stub
//		FrequenlyUsedSw fsw1 = new FrequenlyUsedSw(name,cost);
//		return fsw1;
		if(freqSoftware.containsKey(name)) {
		return freqSoftware.get(name);
		}
		else {
			freqSoftware.put(name, (float) 150);
			return 150;
		}
	}
	
	
}

class InfrequentUsedSw extends softwareLicences{
	
	public static HashMap<String,Float> ifrequentSw=new HashMap<String,Float>();
	private static float percentPay=(float) 1;
	
	public InfrequentUsedSw(String name, float cost) {
		super(name, cost);
		ifrequentSw.put(name, cost);
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public void setdollarPerHour(float dolPerHour) {
//		// TODO Auto-generated method stub
//		this.Itemcost=dolPerHour;
//	}
//
//	@Override
//	public float getdollarPerHour() {
//		// TODO Auto-generated method stub
//		return this.Itemcost;
//	}
	
	public static float getPercentPay() {
		return percentPay;
	}
	
	
	public static float getRes(String name)  {
		// TODO Auto-generated method stub
//		InfrequentUsedSw isw2=new InfrequentUsedSw(name,cost);
//		return isw2;
		if(ifrequentSw.containsKey(name)) {
			return ifrequentSw.get(name);
		}
		else {
			ifrequentSw.put(name, (float) 200);
			return 200;
		}
	}
	
}


class SigleVendor {
	String prodName;
	float prodPricePerHour;
	
	private static HashMap<String,Float> prods = new HashMap<String,Float>();
	
	public SigleVendor(String name, float pricePerHour) {
		super();
		this.prodName = name;
		this.prodPricePerHour = pricePerHour;
		prods.put(this.prodName,this.prodPricePerHour);
	}

	public static void displayService() {
		Set<String> keys=prods.keySet();
		for(String key:keys) {
			System.out.println(key+" , Cost per hour: "+prods.get(key));
		}
				
	}
	public static float getProd(String name, String type) {
		if(prods.containsKey(name)) {
		return prods.get(name);
		}
		else {
			System.out.println("Item from third party: ");
			return 0;
			//return thirdParty(name,type);
		}
	}
	
	public static  float thirdParty(String name,String type) {
		prods.put(name, (float) 10);
		if(type.equals("Hardware")) {
			//default set as 4
			//System.out.println( Hardware.getRes(name));
			return Hardware.getRes(name);
		}
		else if(type.equals("InfrequentUsedSw")) {
			
			return InfrequentUsedSw.getRes(name);
		}
		else {
			return FrequenlyUsedSw.getRes(name);
		}
	}
}


//class Client {
//	String cName;
//	float projCost;
//	
//	public float getProjCost() {
//		return projCost;
//	}
//	
//	public void getRes(String name) {
//		
//	}
//	
//}

public class p8Vendor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consultants c1 = new Consultants("consul1",20);
		
		SigleVendor sv1 = new SigleVendor("CPU", 20);
		SigleVendor sv2= new SigleVendor("Monitor",30);
		SigleVendor sv3 = new SigleVendor("DATABASE", 30);
		SigleVendor sv4 = new SigleVendor("CABLE", 10);
		
		Hardware h1 = new Hardware("laptop",300);
		Hardware h2 = new Hardware("Mobile",250);
		Hardware h3 = new Hardware("Mouse",20);
		Hardware h4 = new Hardware("Keyboard",15);
		
		FrequenlyUsedSw fsw1 = new FrequenlyUsedSw("EXCEL",80);
		FrequenlyUsedSw fsw2 = new FrequenlyUsedSw("ECLIPSE",100);
		
		InfrequentUsedSw isw1=new InfrequentUsedSw("ATOM",70);
		InfrequentUsedSw isw2=new InfrequentUsedSw("PyCharm",75);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("The services available are:");
		SigleVendor.displayService();
		
		
		System.out.println("Enter the total number  services:");
		int num = sc.nextInt();
		float prodCost=0;
		float credit=0,debit=0;
		
		while(num>0) {
			System.out.println("enter the product name: ");
			String name = sc.next();
			System.out.println("enter the number of hours: ");
			int time = sc.nextInt();
			String type="";
			float payPercent =0;
			
			if(SigleVendor.getProd(name, type)!=0)
			{
				
				credit =credit+time* SigleVendor.getProd(name, type);
				prodCost =prodCost+ time* SigleVendor.getProd(name, type);
				
			}
			
			else {
				System.out.println("Choose the type of service:");
				System.out.println("1.hardwares 2.Frequently used software service 3.Infrequently used software services");
				int ch= sc.nextInt();
				
				switch(ch) {
				case 1: type="Hardware";payPercent=Hardware.getPercentPay();break;
				case 2: type="FrequenlyUsedSw";payPercent=FrequenlyUsedSw.getPercentPay();break;
				case 3: type="InfrequentUsedSw";payPercent=InfrequentUsedSw.getPercentPay();break;
				default :System.out.println("Invalid choice");break;
				}
				float cost =SigleVendor.thirdParty(name, type);
				debit =debit+cost;
				System.out.println(debit);
				credit =credit+time* SigleVendor.getProd(name, type);
				//System.out.println(credit+" "+SigleVendor.getProd(name, type));
				cost=cost*payPercent;
				System.out.println(cost);
				prodCost =prodCost+ time* SigleVendor.getProd(name, type)+cost;
				System.out.println(prodCost);
			}
			num--;
		}
		System.out.println("Project cost to the client"+prodCost);
		System.out.println("Client credits:"+credit+" debits:"+debit);
		if(credit>debit) {
			System.out.println("profit by "+(credit-debit));
		}
		else {
			 System.out.println("loss by:"+(debit-credit));
		}
		
		}
//	
//	public static void checkClientprofit(float credit, float debit)
//	{
//		credit>=debit? System.out.println("profit by "+(credit-debit)): System.out.println("loss by:"+(debit-credit));
//		
//	}

}
