package dayEightAsst;

import java.util.Scanner;

class Employee{
	String name;
	int employeeID;
	float basicAllowance;
	float specialAllowance;
	int bonusPercent;
	float texsavingInvests =0;
	float netSal=0;
	
	public Employee(String name, int employeeID, float basicAllowance, float specialAllowance, int bonusPercent,
			float texsavingInvests) {
		super();
		this.name = name;
		this.employeeID = employeeID;
		this.basicAllowance = basicAllowance;
		this.specialAllowance = specialAllowance;
		this.bonusPercent = bonusPercent;
		this.texsavingInvests = texsavingInvests;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public float getBasicAllowance() {
		return basicAllowance;
	}
	public void setBasicAllowance(float basicAllowance) {
		this.basicAllowance = basicAllowance;
	}
	public float getSpecialAllowance() {
		return specialAllowance;
	}
	public void setSpecialAllowance(float specialAllowance) {
		this.specialAllowance = specialAllowance;
	}
	public int getBonusPercent() {
		return bonusPercent;
	}
	public void setBonusPercent(int bonusPercent) {
		this.bonusPercent = bonusPercent;
	}
	public float getTexsavingInvests() {
		return texsavingInvests;
	}
	public void setTexsavingInvests(float texsavingInvests) {
		this.texsavingInvests = texsavingInvests;
	}
	
	
	public float netSal()
	{
		float monthlySal =  grossmonthlySal();
		float netSal = monthlySal*12;
		netSal = netSal - this.texsavingInvests;
		return netSal;
	}
	
	public float grossmonthlySal() {
		float monthlySal = this.basicAllowance+this.specialAllowance;
		monthlySal = ((monthlySal*this.bonusPercent)/100)+monthlySal;
		return monthlySal;
	}

}


public class p7Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of employees: ");
		int n = sc.nextInt();
		while(n>0)
		{
			System.out.println("enter the name:");
			String name=sc.next();
			System.out.println("enter the employee ID");
			int employeeID=sc.nextInt();
			System.out.println("enter the basic allowance");
			float basicAllowance=sc.nextFloat();
			System.out.println("Enter the special allowance");
			float specialAllowance=sc.nextFloat();
			System.out.println("Enter the bonus percentage:");
			int bonusPercent=sc.nextInt();
			System.out.println("Enter the tax saving investments:");
			float taxsavingInvests =sc.nextFloat();
			
			Employee e = new Employee(name,employeeID,basicAllowance,specialAllowance,bonusPercent,taxsavingInvests);
			float netSal = e.netSal();
			System.out.println("Net slaary computed: "+netSal);
			System.out.println("Tax to be paid: "+getTaxDet(netSal));
		}

	}
	
	public static float getTaxDet(float netMonthlySal)
	{
		float taxVal;
		int TaxRate;
		if(netMonthlySal>=1000000) {
			TaxRate=30;
			taxVal = (float) ((netMonthlySal*0.3));
		}
		else if(netMonthlySal>=500000) {
			TaxRate=20;
			taxVal = (float) ((netMonthlySal*0.2));
		}
		else if(netMonthlySal>=250000){
			TaxRate=5;
			taxVal = (float) ((netMonthlySal*0.05));
		}
		else {
			taxVal=0;
		}
		return taxVal;
	}
}
