package lesson10.labs.prob1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TDDPractice {
	 
	
	public List<String> changeLastCharToUpper(List<String> words){
		//List<String> src = new ArrayList<String>();

		 return words.stream()
					.map(x ->x.substring(0,x.length() -1) + x.substring(x.length() -1, x.length()).toUpperCase())
					.collect(Collectors.toList());

		
	}
}
