package IterableforEach_dayEight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Consumer <Integert>{
	void accept(Integer i);
	
	
}

class MyConsumer implements Consumer<Integer>{


	@Override
	public void accept(Integer i) {
		// TODO Auto-generated method stub
		System.out.println(i);
		
	}
	
}
public class forEachObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list1 = new ArrayList();
		for(int i=0;i<10;i++)
		{
			list1.add(i);
		}
		
		Iterator<Integer> it =list1.iterator();
		while(it.hasNext())
		{
		System.out.println(	it.next());
		}
		
		//sing forEachmeth
		MyConsumer v = new MyConsumer();
		list1.forEach(item ->{
			v.accept(item);
		});
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.forEach(item -> System.out.println(item));
		

	}

}
