package dayFour;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//non access modifiers
//static, final , abstract, synchronized , transient, volatile, native

class natives{
	// applicable onlyu for methods
}

class Transients implements Serializable{
	int id;
	String name;
	transient int pwd;
	Transients(int id , String name,int pwd)
	{
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	
	
}

class synchronizedd{
	
}

class volatiles{
	
}

public class KeywordsJava {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Transients emp = new Transients(1,"shy",12345);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\tran.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);   
		oos.writeObject(emp); 
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\tran.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);   
		Transients emp2=(Transients )ois.readObject();    
		
		System.out.println(emp2.id+" "+emp2.name+" "+emp2.pwd);
		
		

	}

}
