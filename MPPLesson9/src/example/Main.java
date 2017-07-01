package example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stream<String> myname = Stream.generate(() -> "nguyen minh hieu");
		//myname.forEach(x -> System.out.println(x));
		List<Student> students = new ArrayList<>();
		students.add(new Student("nguyen minh hieu"));
		students.add(new Student("philip ye maung"));
		students.add(new Student("Vichrak"));
		students.add(new Student("Michrak"));
		
		Stream<Student> stream = students.stream()
								.filter(x -> x.getName().startsWith("M"))
								.filter(x -> x.getName().length()>6)
								.map(x -> new Student(x.getName().toUpperCase()));
		
		stream.forEach(x -> System.out.println(x.getName()));
		
		
	}

}
