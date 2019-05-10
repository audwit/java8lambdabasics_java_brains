package io.javabrains;

public class Greeter 
{
	
	public void greet(Greeting greeting)
	{
		greeting.perform();
	}
	
	public static void main(String[] args) 
	{
			// Greeting the old fashioned way with an interface
			Greeter greeter = new Greeter();
			HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
			greeter.greet(helloWorldGreeting);
			// Greeting the old fashioned way with an interface
			
			// Greeting from lambda function. This can be though as a shortcut to the anonymous inner class approach below. But lambda expressions are not exactly like anonymous inner class which we will see in future tutorials. 
			Greeting myLambdaGreetingFunction = () -> System.out.println("Hello world from lambda");
			myLambdaGreetingFunction.perform();
			// Greeting from lambda function
			
			// Greeting from anonymous class
			Greeting anonymousInnerClassGreeting = new Greeting()
			{
				
				@Override
				public void perform()
				{
					System.out.println("Hello world from Anonymous Inner Class Greeting");
					
				}
			};
			
			anonymousInnerClassGreeting.perform();
			// Greeting from anonymous class
			
			greeter.greet(myLambdaGreetingFunction);
			greeter.greet(anonymousInnerClassGreeting);

	}

}

