package prob0;

import java.util.Comparator;
import java.util.function.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClassNumbers s1= new MyClassNumbers(8,10);
		MyClassNumbers s2 = new MyClassNumbers(7,5);
		
		//obj::instanceMethod
		Function<MyClassNumbers, Integer> multiplity1 = n -> n.mulptiply();
		Function<MyClassNumbers, Integer> multiplity2 = MyClassNumbers::mulptiply;

		Function<MyClassNumbers, Integer> divide1 = n -> n.divide();
		Function<MyClassNumbers, Integer> divide2 = MyClassNumbers::divide;
	
		System.out.println(multiplity1.apply(s1));
		System.out.println(multiplity2.apply(s1));
		
		System.out.println(divide1.apply(s1));
		System.out.println(divide2.apply(s1));

	}

}
