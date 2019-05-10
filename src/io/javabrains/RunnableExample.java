package io.javabrains;

public class RunnableExample
{

	public static void main(String[] args)
	{
		Thread myThread = new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				System.out.println("Printed inside runnable");
				
			}
		});
		
		myThread.run();
	
		
		// These 2 lines of code does everything that the above lines do :)
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda runnable"));
		myLambdaThread.run();
	}
}
