package io.javabrains;

public class TypeInferenceExample
{

	public static void main(String[] args)
	{
		StringLengthLambda myLambda = (String s) -> s.length();
		System.out.println(myLambda.GetLength("TypeInference example"));
		
		// Type can be inferred from the interface as well. Here is an example
		myLambda = s -> s.length();
		System.out.println(myLambda.GetLength("TypeInference example where lambda input parameter does not have type declared"));
		//Type can be inferred from the interface as well. Here is an example
		
		// This one is trickier but still makes sense. PrintLambda static method here accepts a lambda expression because the lambda expression below matches the signature of the StringLengthLambda interface.
		PrintLambda(s -> s.length());
		
	}
	
	public static void PrintLambda(StringLengthLambda l)
	{
		System.out.println(l.GetLength("TypeInference example where lambda input parameter does not have type declared"));
	}
	
	interface StringLengthLambda
	{
		int GetLength(String s);
	}

}
