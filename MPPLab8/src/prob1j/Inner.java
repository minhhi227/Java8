package prob1j;

import java.util.function.Supplier;

public class Inner {
	public static void main(String[] args) {
		Supplier<Double> random = (new Inner()).new MySupplier();
		System.out.println(random.get());
	}
	
	class MySupplier implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}
		
	}
}
