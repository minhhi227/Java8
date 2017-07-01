package prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class FunctionExample {
	/* As a lambda:
	 * public static void main(String[] args) { BiFunction<Integer, Integer,
	 * Integer> f = (x,y) -> 2*x - y; System.out.println(f.apply(2, 3)); }
	 */
	public static void main(String[] args) {
		/*
		class MyBiFunction implements BiFunction<Integer, Integer, Integer> {
			public Integer apply(Integer x, Integer y) {
				return 2 * x.intValue() - y.intValue();
			}
		}
		*/
		//MyBiFunction f = new MyBiFunction();
		BiFunction<Integer, Integer, List<Double>> f = (x,y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x,y));
			list.add((double) (x * y));
			return list;
			};
		 System.out.println(f.apply(2, 3)); 
	}

}
