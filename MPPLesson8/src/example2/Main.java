package example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Sarah", 10));
		emps.add(new Employee("Jack", 12));
		
		emps.forEach(s -> System.out.println(s.getName()));
		
		Comparator<Employee> byName =
				(Employee o1, Employee o2)->o1.getName().compareTo(o2.getName());
				
		Collections.sort(emps, byName);
		
		emps.forEach(s -> System.out.println(s.getName()));
	}
	

}
