package dayEightAsst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Student{
	String name;
	int scoreMaths=0;
	int scoreDSA=0;
	int scoreJava=0;
	
	public Student(String name, int scoreMaths, int scoreDSA, int scoreJava) {
		super();
		this.name = name;
		this.scoreMaths = scoreMaths;
		this.scoreDSA = scoreDSA;
		this.scoreJava = scoreJava;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getScoreMaths() {
		return scoreMaths;
	}
	public void setScoreMaths(int scoreMaths) {
		this.scoreMaths = scoreMaths;
	}
	public float getScoreDSA() {
		return scoreDSA;
	}
	public void setScoreDSA(int scoreDSA) {
		this.scoreDSA = scoreDSA;
	}
	public float getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	
	public float getAvg()
	{
		return (this.scoreDSA+this.scoreJava+this.scoreMaths)/3;
	}
	
	public static String grade(int mark)
	{
		return mark>=60? "1st class" : mark>=50? "2nd class" : mark>=35? "pass" :"fail";
	}	
}
public class p5Student {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the total number of students:");
		int num = sc.nextInt();
		HashMap<Integer,Float> students = new HashMap<Integer,Float>();
		while(num>0)
		{
			System.out.println("enter name");
			String name = br.readLine();
			System.out.println("enter the marks in 3 subjects maths, dsa and Java: ");
			int mark1 =  sc.nextInt();
			int mark2 =  sc.nextInt();
			int mark3 = sc.nextInt();
			Student s1 = new Student(name,mark1,mark2,mark3);
			students.put(num, s1.getAvg());
			System.out.println("Average: "+s1.getAvg());
			System.out.println("Grade for maths: "+s1.grade(mark1)+" "+mark1);
			System.out.println("Grade for dsa: "+s1.grade(mark2)+" "+mark2);
			System.out.println("Grade for Java: "+s1.grade(mark3)+" "+mark3);
			num--;
		}
		Set<Integer> keys = students.keySet();
		float max=0;
		int keyval = 0;
		for(int key : keys)
		{
			if (max<Math.max(students.get(key), max))
			{
				max=Math.max(students.get(key), max);
				keyval=key;
			}
			
		}
		System.out.println("Maximum Average"+max+" by student number"+(keyval+1));
	}
}
