package daySix;


class Topic extends Category{
	private int topic_id;
	private String topicQuestionName;
	private int countEachTopicQuestions=0;
	private static int countTopicQuestions=0;
	
	//LinkedList<String> topicList = new LinkedList<String>();
	//LinkedList<String> categoryList = new LinkedList<String>();
	
	//public static HashMap<String,Stack> topicList = new HashMap<String,Stack> ();
	//private  String[] topicNames =[];
	//Stack<String> topicstk = new Stack<String>();
	
	public Topic(int category_id, String category_name, int topic_id, String topicQuestionName) {
		super(category_id, category_name);
		this.topic_id = topic_id;
		this.topicQuestionName = topicQuestionName;
		
	
		countTopicQuestions++;
		 
	}
	public int getCountEachTopicQuestions() {
		return countEachTopicQuestions;
	}

	public void setCountEachTopicQuestions(int countEachTopicQuestions) {
		this.countEachTopicQuestions = countEachTopicQuestions;
	}

	public static int getCountTopicQuestions() {
		return countTopicQuestions;
	}

	public static void setCountTopicQuestions(int countTopicQuestions) {
		Topic.countTopicQuestions = countTopicQuestions;
	}
	

	public int getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
	public String getTopicQuestionName() {
		return topicQuestionName;
	}
	public void setTopicQuestionName(String topicQuestionName) {
		this.topicQuestionName = topicQuestionName;
	}

	
}
