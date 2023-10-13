package accessmodifiersConstructors;

import accessmodifiersConstructorsPubandProtected.CurrentProtecPub;

public class CurrentSubcls extends CurrentProtecPub{

	public CurrentSubcls() {
		super();
	}
	public CurrentSubcls(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 *  A protected constructor can be accessed by a class instance creation expression 
		 *  (that does not declare an anonymous class)
		 *   or a method reference expression only from within the package 
		 *   in which it is defined.
		 */
		
		//Protected constructor call:
		CurrentProtecPub cpub = new CurrentSubcls();
		CurrentSubcls cpubinh = new CurrentSubcls();
		
		//System.out.println(cpub.name);
		/*
		 * can  only access constructors and overriding meths
		 */
		
		/*
		 * cpubunh : inherited meths and properties from superclass.
		 */
		System.out.println(cpubinh.name);
		
		CurrentPublic c = new CurrentPublic();
		
		
	}


}
