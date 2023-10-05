package dayFive;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


/*Java Collections
 * A framework is a set of classes and interfaces which provides a ready made architecture.
 * API : Set of pre-defined rules
 */

/*Iterable Collection 
 * List Queue Set - interfaces under collection
 * ArrayList , Linkelist , vector, stack 
 * Priority queue, deque, arraydeque
 * Hashset ,linkedlidt
 * SortedSet : treeeset
 *
 */

// List interface. 
// arraylist , linkedlist , vector and stack

// Array list implements the list interface and its based on the array datastructure.
// duplicate elements of different datatypes can be stored. 
// automatic size incrementing is present. 




class Arrylst
{
	List<Integer> al=  new ArrayList<>();
	
	public void createIntlist(int n)
	{
		for(int i=0;i<n;i++)
		{
			al.add(i);
			// can also add at a particular index
		}
		
		
	}
	
	public void display()
	{
		for(Integer element : al)
		{
			
			System.out.println(element);
			
		}
	}
	
	public void printNth(int n)
	{
		System.out.println(al.get(n));
		
	}
	
	public void checkItemContains(int item)
	{
		System.out.println(al.contains(item));
	}
	
	public void remAtIndx(int index) {
		System.out.println(al.remove(index));
	}

//	public void printItr()
//	{
//		for (Iterator it = list.iterator(); iterator.hasNext();)
//	}
}

 class Vectors 
{
	// is synchronized, hence slower
	 
	 Vector <Integer> vObj = new Vector <Integer>();
	 Vector <String> vObj2 = new Vector <String>();
	 
	 public void createVec(int n)
	 {
		 for(int i=0;i<n;i++)
			 vObj.add(i);
	 }
	 
	 public void diplay()
	 {
		 for(int i=0;i<vObj.size();i++)
			 System.out.println(vObj.get(i));
	 }
	 
	 public void createVec2(int n)
	 {
		 for(int i=0;i<n;i++)
			 vObj2.add("apple");
	 }
	 
	 public void diplay2()
	 {
		 for(int i=0;i<vObj2.size();i++)
			 System.out.println(vObj2.get(i));
	 }
	 
}
 //not suynchronized
class LinkedLists
 {
	
	 LinkedList<String> l = new LinkedList<String>();
	// Iterator<Integer> itr = l.iterator();
	 
	 public void insertFirst(String item)
	 {
		 l.addFirst(item);
	 }
	 
	 public void Display()
	 {
		 for (Iterator it = l.iterator(); it.hasNext();)
		 {
			 System.out.println(it.next());
		 }
	 }
	 
	 public void insertAtIndex(int index, String item)
	 {
		 l.add(index-1, item);
	 }
 }
 
 
class Stcks
{
	Stack<String> stk = new Stack<String>();
	
	public void rem()
	{
		stk.pop();
	}
	
	public void pushes(String item) {
		stk.push(item);
	}
	
	public void peeks()
	{
		System.out.println(stk.peek());
	}
	public void display()
	{
		System.out.print(stk);
	}
	
}

class PriQueues
{
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	
	public void insertPq(int item)
	{
		pq.add(item);
	}
	
	public void delt()
	{
		pq.remove();
	}
	public void display()
	{
		System.out.println(pq);
//		for(int i=0;i<pq.size();i++)
//			System.out.println(pq.)
			
	}
	
	public void opertn()
	{
		System.out.println(pq.peek());
		display();
		System.out.println(pq.poll());
		display();
		
	}
}

class dqueIntrface
{
	  ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
	  
}

class SetIntrface
{
	// doesn't allow duplicates.
	//Set <T> s = new HashSet<T>;
}

// objects
class Hashsets
{
	Set<Integer> s = new HashSet<Integer>();
	
	public void insert(int item)
	{
		s.add(item);
	}
	
	public void remove(int item)
	{
		System.out.println("item removed: "+s.remove(item));
	}
	
	public void display()
	{
		System.out.println(s);
		System.out.println("The size is: "+s.size());
	}
	
}

// key value pairs
class hashmaps 
{
	
}

class linkedHashsets
{
	// deosn't allow duplicates
	
	LinkedHashSet <Integer> lhs = new LinkedHashSet<Integer>();
	
	public void insert(ArrayList<Integer> item)
	{
		System.out.println("Arraylist: "+item);
		lhs.addAll(item);
		display();
	}
	
	public void display()
	{
		System.out.println("linnked hashset: "+lhs);
	}
	
//	public void opertn()
//	{
//		lhs.
//	}
}


class SrtdIntrfce
{
	// organised in the ascending order.
	SortedSet<Integer> ss = new TreeSet<Integer>();
}

//TreeSet<t> ts = new Treeset<t>();
class Treesets
{
	TreeSet<Integer> ts = new TreeSet<Integer>();
	
	public void addLists(List<Integer> ls)
	{
		ts.addAll(ls);
	}
	
	public void insert(Integer item)
	{
		ts.add(item);
	}
	
	public void display()
	{
		System.out.println(ts);
	}
}

//map , hashMap
class Hashmaps
{
	
}

public class CollectionsJava {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 Arrylst alst = new  Arrylst();
//		 alst.createIntlist(10);
//		 alst.display();
//		 alst.printNth(3);
//		 alst.checkItemContains(5);
//		 alst.remAtIndx(5);
//		 alst.display();
		 
//		 Vectors v = new Vectors();
//		 v.createVec(12);
//		 v.diplay();
//		 v.createVec2(2);
//		 v.diplay2();
//		 
//		 
//		 Vectors v2 = new Vectors();
//		 v2.createVec2(12);
//		 v2.diplay2();
		 
		 
//		 


		 
		 Stcks s = new Stcks();
		 s.pushes("hello");
		 s.pushes(",how");
		 s.rem();
		 s.peeks();
		 s.pushes("hello");
		 s.pushes("this");
		 s.pushes("is");
		 s.rem();
		 s.peeks();
		 s.pushes("akshatha");
		
		
//		PriQueues pqs = new PriQueues();
//		pqs.insertPq(10);
//		pqs.insertPq(2);
//		pqs.insertPq(3);
//		pqs.insertPq(4);
//		pqs.display();
//		pqs.insertPq(3);
//		pqs.display();
////		pqs.insertPq(null);
//		pqs.opertn();
		
//		Hashsets hs = new Hashsets();
//		hs.insert(10);
//		hs.insert(12);
//		hs.insert(14);
//		hs.insert(16);
//		hs.insert(18);
//		hs.insert(20);
//		hs.display();
//		hs.remove(14);
//		hs.display();
		
		
//		ArrayList<Integer> ls = new ArrayList<Integer>();
//		ls.add(1);
//		ls.add(1);
//		ls.add(2);
//		ls.add(3);
//		ls.add(4);
//		ls.add(5);
//		ls.add(5);
//		ls.add(5);
//		ls.add(6);
//		ls.add(7);
		
//		will maintain the order
//		linkedHashsets lhs1 = new linkedHashsets();
//		lhs1.insert(ls);
		
		
		
		
		//List<Integer> l = new HashSet<Integer>();
		//descending order is maintained.
//		Treesets ts1 = new Treesets();
//		ts1.insert(2);
//		ts1.insert(3);
//		ts1.insert(4);
//		ts1.insert(1);
//		ts1.display();
		
		
		 
		

	}

}
