package dayFive;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapsAst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAst e1 = new EmployeeAst(1,"akshatha",22,1000.98);
		EmployeeAst e2 = new EmployeeAst(2,"Dan",23,2000.98);
		EmployeeAst e3 = new EmployeeAst(3,"emma",32,2000.98);
		EmployeeAst e4 = new EmployeeAst(4,"harry",24,3000.98);
		
		HashMap<Integer,EmployeeAst> hm = new HashMap<Integer,EmployeeAst>();
		hm.put(1, e1);
		hm.put(1, e2);
		hm.put(1, e3);
		hm.put(1, e4);
		
		//System.out.println(hm);
		
		Set<Integer> keyset = hm.keySet();
		
		for(Integer key : keyset)
			System.out.println(hm.get(key));
		
		//put(k,v)
		//contains
		//get(k)
		//remove(k);
		
		TreeMap<Integer,EmployeeAst> tm = new TreeMap<Integer,EmployeeAst>();
		tm.put(1, e3);
		tm.put(2, e2);
		tm.put(3, e1);
		tm.put(4, e4);
		
		System.out.println(tm);
		//tm.descendingMap
		
		
		
	}

}
