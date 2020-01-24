package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava8
{

	public static void main(String[] args) 
	{
		List<Person> people = Arrays.asList
				(
						new Person("Charles", "Dickens", 60),
						new Person("Lewis", "Carroll", 42),
						new Person("Thomas", "Carlyle", 51),
						new Person("Charlotte", "Bronte", 45),
						new Person("Mathew", "Arnold", 39)
				);

		Unit1ExerciseSolutionJava7 unit1ExerciseSolutionJava7 = new Unit1ExerciseSolutionJava7();
		
		//Step1: Sort list by Last name
		Collections.sort(people, (p1,  p2) -> p1.getLastName().compareTo(p2.getLastName()));  
		
		// Step 2 Create a method that prints all elements in the list
		unit1ExerciseSolutionJava7.PrintAll(people);
		System.out.println();
		
		
		
		// Step 3: Create a method that prints all people that have last name beginning with C
		unit1ExerciseSolutionJava7.PrintConditionally(people, new Condition() {
		    
		    @Override
		    public boolean test(Person p)
		    {
			return p.getLastName().startsWith("C");
			    
		    }
		});

	}
	
	public void PrintAll(List<Person> people)
	{
		for (Person person : people)
				System.out.println(person.toString());
	}
	
	public void PrintConditionally(List<Person> people, Condition condition)
	{
		for (Person p : people)
		{
			if(condition.test(p))
				System.out.println(p.toString());
		}
	}
}

// Don't need the interface below anymore as it has been already defined
//interface Condition
//{
//boolean test(Person p);
//}


