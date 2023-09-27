package dayTwo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
class FileAttr
{
	public static void getAttr(File f)
	{
		System.out.println("Name : "+f.getName()+"Abs path : "+f.getAbsolutePath()+"Length: "+f.length());
		System.out.println("Readable : "+f.canRead()+"Writable : "+f.canWrite());
	}
}

class FileOpertn {
	public void create()
	{
		System.out.println("--------inside create -------");
		try
		{
			File f1 = new File("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\file1.txt");
			if (f1.createNewFile())
			{
				System.out.println("file creation done");
				FileAttr.getAttr(f1);
				
			}
			else {
				System.out.println("file already exists");
				deletefile(f1);
			}
		}
		catch(IOException exception)
		{
			System.out.println("Unexpected error ");
			exception.printStackTrace();
		}
	}
	
	public void writeFos() throws IOException
	{
		System.out.println("------inside writeFos -bs---------------");
		FileOutputStream fos1 =   new FileOutputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileOutputStream1.txt");
		FileOutputStream fos2 =   new FileOutputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileOutputStream2.txt");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] values = {12,13,14,15};
		bos.write(values);
		bos.writeTo(fos1);
		bos.writeTo(fos2);
		bos.close();
		System.out.println();
		System.out.println("file written using Bytestream, now reading :");
		readFos();
		
	}
	
	

	public void readFos() throws IOException
	{
		System.out.println("-------inside readFos -bs----------------");
		FileInputStream fos1 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileOutputStream1.txt");
		//FileInputStream fos2 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileOutputStream2.txt");
		ByteArrayInputStream bos = new ByteArrayInputStream(fos1.readAllBytes());
		int i=0;
		while ((i=bos.read())!=-1)
		{
			System.out.println((byte)i);
		}
		bos.close();
		System.out.println("file reading succesful");
		
		
	}
	
	
	public void writeFile()
	{
		System.out.println("--------inside writeFile using Filewriter-------");
		try {
			FileWriter f = new FileWriter("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileWrite.txt");
		
		f.write("This is a file created by file class in java ");
		f.close();
		System.out.println("the file written, now reading :");
		read();

		}
		catch(IOException e)
		{
			System.out.println("Unexpected error occurred");
			   e.printStackTrace();  
		}
	}
		
	
	
	public void read ()
	{
		System.out.println("----inside read using Fis----");
			try {
				File f = new File("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileWrite.txt");
				
			FileInputStream fis = new FileInputStream(f);
			int i;
			try {
				while(( i =fis.read() )!= -1)
				{
					System.out.print((char)i);
				}
				System.out.println();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void deletefile(File f)
	{
		System.out.println("------inside deletefile------");
		if(f.delete())
		{
			System.out.println("file delted successfully");
			create();
		}
		else {
			System.out.println("Unexpected error occurred - deleting");
			
		}
	}
	
	
}


public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOpertn op = new FileOpertn();
		System.out.println("**********Create and delete if exists:********** ");
		op.create();
		
		System.out.println();
		System.out.println("**********File write:********** ");
		op.writeFile();
		//op.read();
		
		System.out.println();
		System.out.println("*********FOS and FIS byteStream: *********");
		op.writeFos();
		
		
		

	}

}
