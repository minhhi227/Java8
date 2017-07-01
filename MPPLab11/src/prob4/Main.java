package prob4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> ints = new ArrayList<Integer>();
//		ints.add(1);
//		ints.add(2);
//		List<? extends Number> nums = ints;
//		double dbl = sum(nums);
//		nums.add(3.14);  // Compiler error. As prob1
		
//		List<Object> objs = new ArrayList<Object>();
//		objs.add(1);
//		objs.add("two");
//		List<? super Integer> ints = objs;
//		ints.add(3);
//		double dbl = sum(ints); // Compiler error. List<? super Integer> is not equal to Collection<? extends Number>

	}

	public static double sum(Collection<? extends Number> nums){
		double s = 0.0;
		for(Number num : nums ) s+=num.doubleValue();
		return s;
	}
}
