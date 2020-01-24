package io.javabrains;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 
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
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		// Step 2 Create a method that prints all elements in the list
		unit1ExerciseSolutionJava7.PrintAll(people);
		System.out.println();
		// Step 3: Create a method that prints all people that have last name beginning with C
		unit1ExerciseSolutionJava7.PrintConditionally(people, "C");

	}
	
	public void PrintAll(List<Person> people)
	{
		for (Person person : people)
				System.out.println(person.toString());
	}
	
	public void PrintConditionally(List<Person> people, String condition)
	{
		for (Person person : people)
		{
			if(person.getLastName().startsWith(condition))
				System.out.println(person.toString());
		}
	}
}


