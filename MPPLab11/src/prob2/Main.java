package prob2;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3);
		 reverse(list);
		 list.forEach(System.out::println);
		
	}
	public static void reverse(List<?> list){
		reverseHelper(list);
	}
	private static <T> void reverseHelper(List<T> items) {
		Collections.reverse(items);
	}

}
