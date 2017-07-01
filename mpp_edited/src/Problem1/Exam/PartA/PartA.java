package Problem1.Exam.PartA;

import java.util.function.BiPredicate;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class PartA {
	// name and type of lambda goes here
	// name and type of lambda goes here
	BiPredicate<Double, Double> f1 = (x, y) -> x * y < x + y;

	// representing lambda as a method refrence
	BiPredicate<Double, Double> f2 = PartA::check;

	//representing lambda as a static nested class
	class MyBiPredicate implements BiPredicate<Double, Double> {

		@Override
		public boolean test(Double t, Double u) {
			// TODO Auto-generated method stub
			return t * u < t + u;
		}

	}

	public static Boolean check(Double x, Double y) {
		return x * y < x + y;
	}

	//evaluate with Double inputs 2.1, 0.35

	public void evaluator() {
		System.out.println(f1.test(2.1, 0.35));
		System.out.println(f2.test(2.1, 0.35));
		System.out.println(new MyBiPredicate().test(2.1, 0.35));
	}

	public static void main(String[] args) {
		PartA test = new PartA();
		test.evaluator();
	}

}
