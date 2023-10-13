package daySix;

import java.util.HashMap;
import java.util.Stack;


class Questions extends Topic{
	
	private int questionId=0;
	private String questionName;
	private String questionType;
	private static int questionCount=0;
	
	// topics and questions are contained
	public static HashMap<String,Stack> topicList = new HashMap<String,Stack> ();
	public static HashMap<String,Stack> categoryList = new HashMap<String,Stack> ();
	
	
	
	public Questions(int category_id, String category_name, int topic_id, String topicQuestionName, int questionId,
			String questionName, String questionType) {
		super(category_id, category_name, topic_id, topicQuestionName);
		this.questionId = questionId;
		this.questionName = questionName;
		this.questionType = questionType;
		
		
		if(topicList.containsKey(category_name))
		{
			topicList.get(category_name).push(topicQuestionName);
			if(categoryList.containsKey(topicQuestionName)){
			categoryList.get(topicQuestionName).push(questionName);
			}
			else {
				categoryList.putIfAbsent(topicQuestionName,new Stack());
				categoryList.get(topicQuestionName).push(questionName);
			}
			
		}
		else
		{
			topicList.putIfAbsent(category_name,new Stack());
			topicList.get(category_name).push(topicQuestionName);
			categoryList.putIfAbsent(topicQuestionName,new Stack());
			categoryList.get(topicQuestionName).push(questionName);
		}
		
		
		
		questionCount++;
	}
	
	
	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public static int getQuestionCount() {
		return questionCount;
	}
	public static void setQuestionCount(int questionCount) {
		Questions.questionCount = questionCount;
	}
	
	
	public void display()
	{
		System.out.println(this.questionName+" "+this.questionType+" "+this.getCategory_name()+" "+this.getTopicQuestionName());
	}
	
	
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



