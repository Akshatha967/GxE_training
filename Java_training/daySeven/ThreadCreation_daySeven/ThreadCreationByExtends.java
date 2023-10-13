package ThreadCreation_daySeven;

class PrintToConsole extends Thread
{
	public void run()
	{
		for(int b = -128; b<128 ; b++)
		{
			System.out.println(b);
		}
	}
}

public class ThreadCreationByExtends {

	public static void main(String[] args) {
		
	PrintToConsole pc = new PrintToConsole();
	pc.run();
	}
}
