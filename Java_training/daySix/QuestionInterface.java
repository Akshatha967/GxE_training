package daySix;

import java.util.HashMap;
import java.util.Stack;

abstract class QuestionInterface
{
	private int questionId=0;
	public int getQuestionId() {
		return questionId;
	}

	public abstract void setQuestionId(int questionId) ;
	public abstract String getQuestionName();
	public abstract void setQuestionName(String questionName) ;
	public abstract String getQuestionType();
	public abstract void setQuestionType(String questionType);
	

	public static int getQuestionCount() {
		return questionCount;
	}

	public static void setQuestionCount(int questionCount) {
		QuestionInterface.questionCount = questionCount;
	}

	public static HashMap<String, Stack> getTopicList() {
		return topicList;
	}

	public static void setTopicList(HashMap<String, Stack> topicList) {
		QuestionInterface.topicList = topicList;
	}

	public static HashMap<String, Stack> getCategoryList() {
		return categoryList;
	}

	public static void setCategoryList(HashMap<String, Stack> categoryList) {
		QuestionInterface.categoryList = categoryList;
	}

	private String questionName;
	private String questionType;
	private static int questionCount=0;
	
	public static HashMap<String,Stack> topicList = new HashMap<String,Stack> ();
	public static HashMap<String,Stack> categoryList = new HashMap<String,Stack> ();
	

	
	
	
	public static void DisplayTopic(String topic)
	{
		
		if(categoryList.containsKey(topic))
		{
			Stack topics= categoryList.get(topic);
			System.out.println(topics);
		}
		else {
			System.out.println("not present");
		}
	}
	
	public static void DisplayCat(String category,String topic)
	{
		if(topicList.containsKey(category))
		{
		Stack cat = topicList.get(category);
		if(cat.contains(topic))
		{
			
			Stack ct = categoryList.get(topic);
			System.out.println(ct);
		}
		}
		else {
			System.out.println("not present");
		}
		
	}		
}
