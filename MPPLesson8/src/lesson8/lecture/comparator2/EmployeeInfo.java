package lesson8.lecture.comparator2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	SortMethod method;
	
	public EmployeeInfo(SortMethod method) {
		this.method = method;
	}
	public void sort(List<Employee> emps) {
		if(method == SortMethod.BYNAME) {
			Collections.sort(emps, new EmployeeNameComparator());
		}
		else if(method == SortMethod.BYSALARY) {
			Collections.sort(emps, new EmployeeSalaryComparator());
		}
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		Employee joe = new Employee("Joe", 100000);
		Employee joe2 = new Employee("Joe", 200000);
		System.out.println("joe equals joe? " + joe.equals(joe2));
		EmployeeNameComparator c = new EmployeeNameComparator();
		System.out.println("joe equals joe? " + (c.compare(joe, joe2)==0) );

	}
}
