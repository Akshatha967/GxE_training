package dayTwo;

import java.io.*;

class Serial implements Serializable 
{
	String name;
	int id;
	Serial (int id, String name)
	{
		this.id = id;
		this.name = name ;
	}
}

class Stud extends Serial 
{
	String course;
	Stud (int id, String name, String course)
	{
		super(id,name);
		this.course =course;
	}
}
public class SerailandDeserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Serial sr1 = new Serial (1,"maria");
		
		FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\serial.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(sr1);
		
		oos.close();
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\serial.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Serial sr2 = (Serial) ois.readObject();
		System.out.println(sr2.id+" "+sr2.name);
		ois.close();
		
		//--------------------------------------//
		
		Stud s1 = new Stud(3,"Nial","CSE");
		FileOutputStream fos1 = new FileOutputStream(new File("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\serial2.txt"));
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(s1);
		
		oos1.close();
		
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\serial2.txt");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);

		Stud s2 = (Stud) ois1.readObject();
		System.out.println(s2.id+" "+s2.name+" "+s2.course);
		ois1.close();
		
		
		
	}

}
