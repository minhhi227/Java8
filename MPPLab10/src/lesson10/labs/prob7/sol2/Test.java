package lesson10.labs.prob7.sol2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.Stream;

import lesson10.labs.prob7.Employee;
import lesson10.labs.prob7.Main;

public class Test {

	@org.junit.Test
	public void test() {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
												new Employee("Joe", "Stevens", 200000),
												new Employee("Alice", "Richards", 101000),
								                new Employee("Donald", "Trump", 100000)).stream();
		//fail("Not yet implemented");
		assertEquals("Alice Richards, Joe Stevens", Main.asString2(emps));
	}

}
