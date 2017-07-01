package prob3;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Hieu");
		names.add("Vichrak");
		names.add("Philip");

		names.stream()
					.map(x -> new Person(x.toUpperCase()))
					.map(x -> Main.isLowerCase(x.getName()))
		  			.forEach(x -> System.out.println(x));
		
		System.out.println(countNames2(names,"Hieu"));
		//System.out.println(countNames(names,"Hieu"));
		
	}
	
//	private boolean checkLegal(Person g) throws IllegalGuestException {
//		boolean isIllegal = (g.getName().contains(s));
//		if(isIllegal) throw new IllegalGuestException(String.format(
//					"Illegal guest %s has attempted entry to the event", g.getName()));
//		else return true;
//	}
//	
	public static String isLowerCase(String str)
	{
		if(str == str.toLowerCase() && str != str.toUpperCase())
			throw new IllegalStateException("Not upper case");
		return str;
	}
	
	public static int countNames(List<String> strs, String s){
//		int count = 0;
//		for(String t : strs){
//			if(t == s) count++;
//		}
//		return count;
		return  strs.stream()
					.filter(x -> x == s)
					.collect(Collectors.toList())
					.size();
	}
	
	public static <T> int countNames2(List<T> strs, T s){
//		int count = 0;
//		for(Object t : strs){
//			if((String)t == s) count++;
//		}
//		return count;
		return  strs.stream()
				.filter(x -> x.equals(s))
				.collect(Collectors.toList())
				.size();
		}
	public static<T extends Comparable<T>> T findMax(List<T> list){
		return list.stream()
					.max((o1,o2) -> o1.compareTo(o2))
					.get();
					
	}


}
