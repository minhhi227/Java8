package prob3;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> words = Stream.of("test1", "test2","test3");
		Stream<Double> randoms = Stream.generate(Math::random);
		
		words.filter(w -> w.length()==5)
		     .map(x -> x.toUpperCase())
		     .forEach(x -> System.out.println(x));;
	}

}
