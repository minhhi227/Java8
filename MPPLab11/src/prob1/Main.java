package prob1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> ints = new ArrayList<Integer>();
//		ints.add(1);
//		ints.add(2);
//		List<Number> nums = ints; // Compiler error
//		nums.add(3.14);
		/*
		 *List<Number> is not equal to List<Integer>
		 */
		
//		List<Integer> ints = new ArrayList<Integer>();
//		ints.add(1);
//		ints.add(2);
//		List<? extends Number> nums = ints; 
//		nums.add(3.14);  // Compiler error:  
//		
		/*
		 * The wildcard declaration of List<? extends Number> nums means that the variable foo3 can hold any value from a family of types (rather than any value of a specific type). 
		 * It means that any of these are legal assignments
		 */
		
	}

}
