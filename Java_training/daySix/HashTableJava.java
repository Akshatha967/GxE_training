package daySix;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

//import dayFive.EmployeeAst;

// synchronised and is thread safe.
class HashTables
{
	Hashtable<Integer,EmployeeAst> ht = new Hashtable<Integer,EmployeeAst>();
	
	public void putOb(int key, EmployeeAst val)
	{
		ht.put(key, val);
	}
	
	public void display()
	{
		Set<Integer> keyset = ht.keySet();
		
		for(Integer key : keyset)
			System.out.println(ht.get(key));
	}
}

public class HashTableJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAst e5 = new EmployeeAst(5,"akshatha",22,1000.98);
		EmployeeAst e6 = new EmployeeAst(6,"Dan",23,2000.98);
		EmployeeAst e7 = new EmployeeAst(7,"emma",32,2000.98);
		EmployeeAst e8 = new EmployeeAst(8,"harry",24,3000.98);
		
		HashTables hts = new HashTables();
		hts.putOb(1,e5);
		hts.putOb(2,e6);
		hts.putOb(3,e7);
		hts.putOb(4,e8);
		
		hts.display();
		

	}

}
