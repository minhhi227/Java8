package lesson9.labs.prob2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}
	
	static class PrimeStream {
		final Stream<Integer> primes = Stream.iterate(1, n -> n + 1);
		
		public void printFirstNPrimes(int n){
			final List<Integer> addprimes = new ArrayList<>(n);
			primes.filter(i -> isPrime(i)).limit(n).forEach(addprimes::add);
		    
			addprimes.forEach(System.out::println);
		}
		
		public static boolean isPrime(int num) {
	        if (num < 2) return false;
	        if (num == 2) return true;
	        if (num % 2 == 0) return false;
	        for (int i = 3; i * i <= num; i += 2)
	            if (num % i == 0) return false;
	        return true;
		}
		public static int nextPrime(int n) {
		    boolean isPrime = false;
		    int m = (int) Math.ceil(Math.sqrt(n));
		    int start = 3;
		    if (n % 2 == 0) {
		        n = n + 1;
		    }
		    while (!isPrime) {
		        isPrime = true;
		        for (int i = start; i <= m; i = i + 2) {
		            if (n % i == 0) {
		                isPrime = false;
		                break;
		            }
		        }
		        if (!isPrime) {
		            n = n + 2;
		        }
		    }
		    return n;
		}
	}


}
