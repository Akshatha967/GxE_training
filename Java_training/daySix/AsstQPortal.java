package daySix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class AsstQPortal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//int category_id, String category_name, int topic_id, String topicQuestionName, int questionId,
		//String questionName,type
		
		//Questions q1 = new Questions(1,"CSE",1,"ATC",1,"tell me about ATC","paragraph");
		
		
		//Scanner in = new Scanner(System.in);
		
		Scanner in = new Scanner(System.in);
		while(true) {
			
			System.out.println("Enter your choice:"
					+ "1. Enter question"+"2. Get total Questions"+"3. List all question belonging to a topic"+"4. List all question belonging to a topic and category");
			int choice = in.nextInt();
			
			switch(choice)
			{
			case 1:enterQuestion(); break;
			case 2: System.out.println(Questions.getQuestionCount()); break;
			case 3:getQuesFromTopic(); break;
			case 4: getQuesFromcategoryandTopic(); break;
			default: System.exit(0);
			
			}
		}
				
		}
	
	public static void enterQuestion() throws IOException {
		
		Scanner in = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Category id: ");
		int category_id =in.nextInt(); 
		
		System.out.println("category_name: ");
		String  category_name =in.next(); 
		
		System.out.println("topic_id : ");
		int topic_id =in.nextInt(); 
		
		System.out.println(" topicQuestionName ");
		String  topicQuestionName =in.next();
		
		System.out.println("questionId: ");
		int questionId =in.nextInt(); 
		
		System.out.println("questionName: ");
		String  questionName =bf.readLine();
		
		System.out.println("type: ");
		String  questionType=in.next();
		
		Questions q1 = new Questions(category_id , category_name, topic_id, topicQuestionName, questionId, questionName, questionType );
		//q1.display();
		
	}
	
	public static void getQuesFromTopic(){
		Scanner in = new Scanner(System.in);
		System.out.println("enter topic name:");
		String topic_name = in.next();
		Questions.DisplayTopic(topic_name);
		
		
	}
	
	public static void getQuesFromcategoryandTopic(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter category name:");
		String cat_name = in.next();
		System.out.println("enter topic name:");
		String topic_name = in.next();
		Questions.DisplayCat(cat_name,topic_name);
			
	}
		
	
}
