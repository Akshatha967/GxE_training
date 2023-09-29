package dayThrees;

public class recusrionReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recusrionReverseStr rev = new recusrionReverseStr();
		String str ="hello";
		int len = str.length();
		//char[] ch = str.toCharArray();
		System.out.println("string is:"+str+"\nreversed string is:"+rev.revStr(str,0,len-1));

	}
	public String revStr(String str,int start, int end)
	{
		if(start>end)
		{
			//System.out.println(str);
			return "";
		}
		
		else
		{
			return str.charAt(end)+revStr(str,start,end-1);
		}
	}

}
