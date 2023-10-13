package StreamsInJava_dayEight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;



class Person{
	String name;
	int id;
	Person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}
class StreamsProc {
	
	public void getNames(List<Person> alp2)
	{
		alp2.stream()
		.forEach(o->{
			System.out.println(o.name);
		});
	}
	
	public void  paralStreams(ArrayList<Person> alp)
	{
		alp.parallelStream()
		.filter(p->p.id>3)
		.map(p->p)
		.forEach(p->System.out.println(p.name));
		
	}
	
	public void getOnlyName(ArrayList<Person> alp) {
		List<String> p = alp.stream().map(pr->pr.name).collect(Collectors.toList());
		Iterator it = p.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

public class StreamsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> alp = new ArrayList<Person>();
		for(int i=0;i<5;i++)
		{
			Person p = new Person(i,"name"+i);
			alp.add(p);
		}
		
		List<Person> alp2 = alp.stream().filter(p->p.id>2).map(p->p).collect(Collectors.toList());
		
		StreamsProc ap = new StreamsProc();
		System.out.println("List printing..");
		ap.getNames(alp2);
		
		System.out.println("ArrayList printing...");
		ap.paralStreams(alp);
		
		
		System.out.println("Printing only names ...");
		ap.getOnlyName(alp);
		

	}

}
