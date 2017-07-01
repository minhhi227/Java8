package prob4;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Even more functional approach -- count number of elements 
//using a pure expression -- no auxiliary function calls
//All assignments are atomic.
public class Better {
	final Function<String, Predicate<String>> contain 
    	= letter -> name -> name.contains(letter);
    final Function<String, Predicate<String>> notcontain 
    	= letter -> name -> !name.contains(letter);
    final Function<Integer, Predicate<String>> length 
    	= length -> name -> name.length() == length;

	
	public int countWords(List<String> list, char c, char d, int len ) {
		return 
		     list.stream()
				.filter(contain.apply(""+c))
				.filter(notcontain.apply(""+d))
				.filter(length.apply(4))
				.collect(Collectors.toList())
				.size();
	}

	public static void main(String[] args) {
		Better b = new Better();

		System.out.println("Friends with names that start"
				+ " with 'N': " + b.countWords(Folks.friends, 'N','H',4));

	}
}
