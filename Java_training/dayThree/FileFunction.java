package dayThrees;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



class FileFuns
{
	//HashMap<String,Integer> mapCount=new HashMap<String,Integer>();   
	
	ArrayList <String> ls1 = new ArrayList<String>(); // common words , all repeated common words from file1

	public void matchtexts () throws FileNotFoundException
	{
		FileInputStream fis1 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileMatching1.txt");
		//FileInputStream fis2 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileMatching2.txt");
		int count=0;
		Scanner sc1 = new Scanner(fis1);
		
		while(sc1.hasNext())
		{
			  String str1 = sc1.next();
			  //System.out.println("string 1--------:"+str1);
			  FileInputStream fis2 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileMatching2.txt");
			  Scanner sc2 = new Scanner(fis2);

			  while(sc2.hasNext())
			  {
			      String str2 = sc2.next();
			      //System.out.println(str2);
			      if (str1.equals(str2))
			      {
			    	  //System.out.println(str1 + " = " + str2);
			    	  // add matching words to array list
			    	  ls1.add(str1);
			    	  //mapCount.put(str1, (j == 0) ? 1 : j + 1);
			      }
			      		
			  }
			  sc2.close();
		  } 
		    sc1.close();
		    System.out.println("The common words are: ");
			Set<String> st = new HashSet<String>(ls1);
			System.out.println(st);
//		    for (String s : st)
//		    	System.out.println(s);
		    
		    
	}
	
	public void getMatchCount() throws FileNotFoundException
	{
//		 for (HashMap.Entry<String,Integer> e : mapCount.entrySet())
//	            System.out.println(e.getKey()+" : "+e.getValue());
		System.out.println("**********");
		System.out.println("count in file1:");
		Set<String> st = new HashSet<String>(ls1);
//	    for (String s : st)
//	    	System.out.print(" "+s + ":" + Collections.frequency(ls1, s));
		
		FileInputStream fis6 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileMatching1.txt");
	    Scanner sc6 = new Scanner(fis6);
	    HashMap<String,Integer> mapCount6=new HashMap<String,Integer>();  
	    // match file's words with the words in hash set, if its equal add to the hashmap and increment count accly.
	    while(sc6.hasNext())
	    {
	    	//System.out.println("inside while");
	    	String s2 = sc6.next();
	    	for(String s : st)
	    	{
	    		//System.out.println("inside for");
	    		if (s2.equals(s))
	    		{
	    			//System.out.println("inside if");
	    			mapCount6.putIfAbsent(s2, 0);
	    			if(mapCount6.containsKey(s2))
	    			{
	    				mapCount6.replace(s2, mapCount6.get(s2)+1);
	    				
	    			}
	    			break;
	    		}
	    	}
	    }
	    
//	    for (HashMap.Entry<String,Integer> e : mapCount2.entrySet())
//            System.out.println(e.getKey()+" : "+e.getValue());
	    
	    System.out.println(mapCount6);
		
		
	    
	    System.out.println();
	    System.out.println("**********");
	    System.out.println("count in file2:");
	    FileInputStream fis2 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileMatching2.txt");
	    Scanner sc2 = new Scanner(fis2);
	    HashMap<String,Integer> mapCount2=new HashMap<String,Integer>();  
	    // match file's words with the words in hash set, if its equal add to the hashmap and increment count accly.
	    while(sc2.hasNext())
	    {
	    	//System.out.println("inside while");
	    	String s2 = sc2.next();
	    	for(String s : st)
	    	{
	    		//System.out.println("inside for");
	    		if (s2.equals(s))
	    		{
	    			//System.out.println("inside if");
	    			mapCount2.putIfAbsent(s2, 0);
	    			if(mapCount2.containsKey(s2))
	    			{
	    				mapCount2.replace(s2, mapCount2.get(s2)+1);
	    				
	    			}
	    			break;
	    		}
	    	}
	    }
	    
//	    for (HashMap.Entry<String,Integer> e : mapCount2.entrySet())
//            System.out.println(e.getKey()+" : "+e.getValue());
	    
	    System.out.println(mapCount2);
	        
	}
	
	public void getUniqueCount() throws FileNotFoundException
	{
//		 for (HashMap.Entry<String,Integer> e : mapCount.entrySet())
//	            System.out.println(e.getKey()+" : "+e.getValue());
		System.out.println("*****Unique words counts*****");
		Set<String> st = new HashSet<String>(ls1);
		//System.out.
		
		System.out.println("count in file1:");
	    FileInputStream fis1 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileMatching1.txt");
	    Scanner sc1 = new Scanner(fis1);
	    HashMap<String,Integer>mapCountUnique3=new HashMap<String,Integer>(); 
	    while(sc1.hasNext())
	    {
	    	//System.out.println("inside while");
	    	String s2 = sc1.next();
	    	int flag=0;
	    	for(String s : st)
	    	{
	    		//System.out.println("inside for");
	    		if (s2.equals(s))
	    		{
	    			flag=1;
	    			break;
	    		}
	    	}
	    	if(flag==0) {
	    	
	    	mapCountUnique3.putIfAbsent(s2, 0);
	    	if(mapCountUnique3.containsKey(s2))
			{
	    		mapCountUnique3.replace(s2,mapCountUnique3.get(s2)+1);
				
			}
	    	}
	        
	    }
	    
	    
	    
	    System.out.println(mapCountUnique3);
	    
	    System.out.println("*************");
	    System.out.println("count in file2:");
	    FileInputStream fis2 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileMatching2.txt");
	    Scanner sc2 = new Scanner(fis2);
	    HashMap<String,Integer> mapCountUnique2=new HashMap<String,Integer>();  
	    while(sc2.hasNext())
	    {
	    	//System.out.println("inside whhile");
	    	String s2 = sc2.next();
	    	int flag=0;
	    	for(String s : st)
	    	{
	    		//System.out.println("inside for");
	    		if (s2.equals(s))
	    		{
	    			flag=1;
	    			break;
	    		}
	    	}
	    	if(flag==0)
	    	{
	    	mapCountUnique2.putIfAbsent(s2, 0);
	    	if(mapCountUnique2.containsKey(s2))
			{
	    		mapCountUnique2.replace(s2,mapCountUnique2.get(s2)+1);
				
			}
	    	}
	    }
	    System.out.println(mapCountUnique2);
   
	    
	        
	}
	
	
	public void getAlternate() throws IOException
	{
		File f1 = new File("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileCombine.txt");
		if (f1.createNewFile())
		{
			
			FileInputStream fis1 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileMatching1.txt");
			FileInputStream fis2 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileMatching2.txt");
			Scanner sc1 = new Scanner(fis1);
			Scanner sc2= new Scanner(fis2);
			FileWriter fw = new FileWriter(f1);
			
			
			while(sc1.hasNextLine() || sc2.hasNextLine())
			{
				//System.out.println(sc1.nextLine());
				//System.out.println("inside while");
				if(sc1.hasNextLine())
				{
					String text=sc1.nextLine();
				fw.write(text);
				fw.write("\n");
				//System.out.println(sc1.nextLine());
				}
				if(sc2.hasNextLine())
				{
					fw.write(sc2.nextLine());
					fw.write("\n");
					//System.out.println(sc2.nextLine());
				}
			}
			fw.close();
			System.out.println("file creation done! Reading the file created : ");
			read();
			
			
		}
		else {
			System.out.println("file already exists ! deleting and recalling...");
			deletefile(f1);
			
		}
	}
	
	public void deletefile(File f) throws IOException
	{
		//System.out.println("------inside deletefile------");
		if(f.delete())
		{
			System.out.println("file delted successfully");
			getAlternate();
		}
		else {
			System.out.println("Unexpected error occurred - deleting");
			
		}
	}
	
	public void read() throws FileNotFoundException
	{
		System.out.println("Reading the alternate file:");
		FileInputStream fis1 =   new FileInputStream("C:\\Users\\ashetty\\OneDrive - GalaxE. Solutions, Inc\\Documents\\JAVA_SESSIONS\\fileCombine.txt");
		Scanner sc1 = new Scanner(fis1);
		while(sc1.hasNextLine() )
		{
			System.out.println(sc1.nextLine());
		}
	}

}

public class FileFunction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	FileFuns f = new FileFuns();
	f.matchtexts();
	f.getMatchCount();
	f.getUniqueCount();
	f.getAlternate();

	}

}
