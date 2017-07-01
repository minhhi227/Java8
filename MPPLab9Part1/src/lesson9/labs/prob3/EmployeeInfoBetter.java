package lesson9.labs.prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;

public class EmployeeInfoBetter {
	static enum SortMethod {BYNAME, BYSALARY};
	Function<Employee, String> byName = e -> e.getName();
	Function<Employee, Integer> bySalary = e -> -e.getSalary();
	
	final static class Pair<S,T> {
		Pair(S f, T t) {
			first = f;
			second = t;
		}
		S first;
		T second;
	}
	final Pair<Function,Function> byNamePair = new Pair<>(byName, bySalary);
	final Pair<Function,Function> bySalaryPair = new Pair<>(bySalary, byName);
	
	@SuppressWarnings("serial")
	final HashMap<SortMethod, Pair<Function,Function>> sortDiscriminator =
	  new HashMap<SortMethod, Pair<Function,Function>>() {
		{
				put(SortMethod.BYNAME, byNamePair);
				put(SortMethod.BYSALARY, bySalaryPair);
	    }
	};
	
	public void sort(List<Employee> emps, final SortMethod method) {
			Collections.sort(emps, Comparator.comparing(sortDiscriminator.get(method).first).thenComparing(sortDiscriminator.get(method).second));
		
	}
	
	
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		EmployeeInfoBetter ei = new EmployeeInfoBetter();
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYSALARY);
		//System.out.println(emps);
	}
}
