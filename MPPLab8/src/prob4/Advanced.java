package prob4;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Advanced {
	final QuadFunction<List<String>, String, String, Integer, Integer> countWords 
	    = (list,c,d,len) -> list.stream()
	                            .filter(name -> name.contains(c))
	                            .filter(name -> !name.contains(d))
	                            .filter(name -> name.length() == len)
	                            .collect(Collectors.toList())
	                            .size();    

	final Integer count = countWords.apply(Folks.friends, "N", "H",4);

	public static void main(String[] args) {
		Advanced adv = new Advanced();
		System.out.println(adv.count);
	}
}
