package daySix;

import java.util.Comparator;

public class StudentComparator implements Comparator {

	private Integer id; 
	private String name; 
	private Integer age;
	public Integer getId() {
		return id;
	}
	
	
	
	public StudentComparator(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}



	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		StudentComparator st1 = (StudentComparator)o1;
		StudentComparator st2 = (StudentComparator)o2;
//		if(st1.age==st2.age)  
//			return 0;  
//		else if(st1.age>st2.age)  
//			return 1;  
//		else  
//			return -1;  
		
		return st1.name.compareTo(st2.name);  
	} 
	

}
