package Problem6.Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConditionalRemove {

	static class StrLengthCondition implements Predicate<String> {
		@Override
		public boolean test(String s) {
			return s.length() == 5;
		}
	}

	static Predicate<String> removeStringContainsK = s -> s.contains("k");
	static Predicate<Employees> removeEmployeeSalaryLessThan60000 = e -> e.getSalary() < 60000;
	static Predicate<Integer> removeIntegerGreaterThan100 = i -> i > 100;

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>() {
			{
				add("Hello");
				add("Goodbye");
			}
		};
		ArrayList<String> list2 = new ArrayList<String>() {
			{
				add("abc");
				add("akx");
				add("xyz");
			}
		};
		ArrayList<Employees> list3 = new ArrayList<Employees>() {
			{
				add(new Employees("1", "Vichrak", 20, "Male", 50000));
				add(new Employees("2", "Hieu", 20, "Male", 60000));
				add(new Employees("3", "Phillip", 20, "Male", 70000));
			}
		};
		ArrayList<Integer> list4 = new ArrayList<Integer>() {
			{
				add(1);
				add(20);
				add(200);
				add(100);
			}
		};

		System.out.println(conditionalRemove(list, new StrLengthCondition()));
		System.out.println(conditionalRemove(list2, removeStringContainsK));
		System.out.println(conditionalRemove(list3, removeEmployeeSalaryLessThan60000));
		System.out.println(conditionalRemove(list4, removeIntegerGreaterThan100));
	}

	public static <T> List<T> conditionalRemove(ArrayList<T> list, Predicate<T> condition) {
		//		StrLengthCondition cond = new StrLengthCondition();
		//		for(T s : list) {
		//			if(s.toString().contains(""+'k')
		//			   || (Employees)
		//					) {
		//				list.remove(s);
		//			}
		//		}
		return list.stream()
			.filter(o -> !condition.test(o))
			.collect(Collectors.toList());
	}
}
