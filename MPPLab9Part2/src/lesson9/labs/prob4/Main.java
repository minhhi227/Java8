package lesson9.labs.prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquares(4);
		
	}
	
	public static void printSquares(int num){
		final Stream<Integer> primes = Stream.iterate(2, n -> n + 1);
		
		final List<Integer> addsquare = new ArrayList<>(num);
		primes.filter(i -> {if((int)Math.sqrt(i) * (int)Math.sqrt(i) == i) return true;
							else return false;
							}).limit(num).forEach(addsquare::add);
		
	    
	addsquare.forEach(System.out::println);
	}

}
