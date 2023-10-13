package functionalInterface_dayEight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/*
 * Includes only one abstract function and any no. of default and sttaic meths
 */

@FunctionalInterface
interface Drawable{
	void draw();
}

@FunctionalInterface
interface Arith{
	int arith(int x,int y);
}

@FunctionalInterface
interface Say{
	String say();
}

class Products{
	int id;
	String name;
	int count;
	
	Products(){
		
	}
	Products(int id, String name , int count)
	{
		this.id = id ; 
		this.name = name ;
		this.count = count;
	}
	
	public static int sumWithcond(List<Integer> num , Predicate<Integer> predicate)
	{
		return num.parallelStream()
				.filter(predicate)
				.mapToInt(i->i)
				.sum();
	}
}
public class FuctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Products> lp = new ArrayList<Products>();
		lp.add(new Products(1,"laptop",2));
		lp.add(new Products(1,"Banana",3));
		lp.add(new Products(1,"Kurta",8));
		lp.add(new Products(1,"Mobile",10));
		
		System.out.println("sorting");
		Collections.sort(lp,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		lp.forEach(p->{
			System.out.println(p.name);
		});
		
		
		Drawable circle = ()->{
			System.out.println("drawing a circle...");
		};
		circle.draw();
		
		Drawable rect = ()->{
			System.out.println("drawing a rectangle...");
		};
		rect.draw();
		
		Say morn = ()->{
			return "Good morning";
		};
		System.out.println(morn.say());
		

		Say eve = ()->{
			return "Good evening";
		};
		System.out.println(eve.say());
		
		// alt+shift+r	
		Arith add =(a,b)->{
			return a+b;
		};
		System.out.println(add.arith(2, 3));;
		
		Arith sub =(a,b)->{
			return a-b;
		};
		System.out.println(sub.arith(2, 3));
		

		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<6;i++)
		{
			al.add(i);
		}
		al.forEach(item->{
			System.out.println(item);
		});
		
		Runnable r1 = ()->
		{
			System.out.println("running threads");
		};
		Thread t = new Thread(r1);
		t.start();
		
		Products p = new Products();
		System.out.println(p.sumWithcond(al, i->true));
		System.out.println(p.sumWithcond(al, i->i%2==0));
		System.out.println(p.sumWithcond(al, i->i%2!=0));

		
	}

}
