package prob5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,6,8);
		Integer i = secondsmallest(list);
		System.out.println(i);
	}
	
	public static <T extends Comparable<T>> T max(List<T> l) {
		T max = l.get(0);
		for(T i: l){
			if(i.compareTo(max)>0){
				max = i;
			}
		}
		return max;
	}
	public static <T extends Comparable<T>> T secondsmallest(List<T> l) {

		    T smallest = max(l); 
		    T secondSmallest = max(l); 
		    for (int i = 0; i < l.size(); i++) {
		    	T temp = l.get(i);
		        if (smallest.compareTo(temp)>0) {
		            secondSmallest = smallest;
		            smallest = temp;
		        } 
		        else if (secondSmallest.compareTo(temp)>0 && !smallest.equals(temp)) {
		            secondSmallest =temp;
		        }
		    }
		    return secondSmallest;
	}


}
