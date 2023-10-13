package daySix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import dayFive.EmployeeAst;

public class ComparableClassJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeAst e5 = new EmployeeAst(5,"akshatha",29,1000.98);
		EmployeeAst e6 = new EmployeeAst(6,"Dan",23,2000.98);
		EmployeeAst e7 = new EmployeeAst(7,"emma",32,2000.98);
		EmployeeAst e8 = new EmployeeAst(8,"harry",24,3000.98);
		

		ArrayList<EmployeeAst> ale = new ArrayList<EmployeeAst>();
		ale.add(e5);
		ale.add(e6);
		ale.add(e7);
		ale.add(e8);
		
		Collections.sort(ale);
		
		for(EmployeeAst emp: ale)
			System.out.println(emp);
		
		
		StudentComparator st1 = new StudentComparator(1,"akshatha",23);
		StudentComparator st2 = new StudentComparator(2,"amy",28);
		StudentComparator st3 = new StudentComparator(3,"ashley",37);
		StudentComparator st4 = new StudentComparator(4,"aneel",43);
		
		//Collections.compare(st1,st2);
		ArrayList<StudentComparator> als = new ArrayList<StudentComparator>();
		als.add(st1);
		als.add(st2);
		als.add(st3);
		als.add(st4);
		
		Comparator<StudentComparator> cm1=Comparator.comparing(StudentComparator::getName);
		
		Collections.sort(als,cm1);
		System.out.println("compare by name");
		for(StudentComparator stu: als)
			System.out.println(stu.getName());
		
			
	}

}
