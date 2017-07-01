package lesson10.labs.prob7;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000)).stream();
		
//		  System.out.println(emps
//				    .filter(e -> (e.getSalary() > 100000))
//				    .filter(e -> (e.getLastName().charAt(0) > 'M'))
//				    .map(e -> fullName(e))
//				    .sorted()
//				    .collect(Collectors.joining(", ")));
		//printEmps(asString(emps)); 
		printEmps(asString2(emps));
		             

	}
	public static String asString(Stream<Employee> emps){
		return  emps
			    .filter(e -> (e.getSalary() > 100000))
			    .filter(e -> (e.getLastName().charAt(0) > 'M'))
			    .map(e -> fullName(e))
			    .sorted()
			    .collect(Collectors.joining(", "));
	}
	public static String asString2(Stream<Employee> emps){
		return  emps
			    .filter(e -> salaryGreaterThan100000(e))
			    .filter(e -> lastNameAfterM(e))
			    .map(e -> fullName(e))
			    .sorted()
			    .collect(Collectors.joining(", "));
	}
	public static void printEmps(String s){
		System.out.println(s);
	}
	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}
	private static boolean salaryGreaterThan100000(Employee e){
		return e.getSalary()>100000?true:false;
	}
	private static boolean lastNameAfterM(Employee e){
		return e.getLastName().charAt(0) > 'M'?true:false;
	}

}
