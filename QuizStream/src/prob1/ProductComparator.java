package prob1;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		//return arg0.getName().compareTo(arg1.getName());
		if(arg0.getPrice() == arg1.getPrice()) return 0;
		else if(arg0.getPrice() < arg1.getPrice()) return -1;
		else return 1;
	}

}
