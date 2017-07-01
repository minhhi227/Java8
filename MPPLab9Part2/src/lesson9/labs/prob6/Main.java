package lesson9.labs.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

	public static final Set<String> EMPTY_SET = new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main u = new Main();
		Set<String> set1  = new HashSet<>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		Set<String> set2  = new HashSet<>();
		set2.add("E");
		set2.add("F");
		set2.add("G");
		List<Set<String>> list = new ArrayList<>();
		list.add(set1);
		list.add(set2);
		System.out.println(u.union(list));
	}
	public Set<String> union(List<Set<String>> sets)  {
		return sets.stream().reduce(EMPTY_SET, (s, t) -> {s.addAll(t); return s;});
	}

}
