package prob4;

import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(final String[] args) {
		Good good = new Good();
		
		System.out.println(String.format("Friends with names contain N and not contain H "+ good.countWords(Folks.friends, 'N','H',4)));

	}
	
	public int countWords(List<String> list, char c, char d, int len ) {
		return 
		     list.stream()   //convert list to stream
         	     .filter(name -> name.contains(""+c)) //returns filtered stream, lexical scoping
         	     .filter(name -> !name.contains(""+d))
         	     .filter(name -> name.length() == len)
         	     .collect(Collectors.toList())
         	     .size(); //organizes into a list		
	}
}
