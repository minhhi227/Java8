package prob1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		//type:  Class::instanceMethod
//		Function<Product, String> eToString1 = e -> e.getName();
//		Function<Product, String> eToString2 = Product::getName;
//		
//		//type: Class::instanceMethod
//		BiConsumer<Product, String> setName1 = (e,s) -> e.setName(s);
//		BiConsumer<Product, String> setName2 = Product::setName;
		
		                 
		
//		Scanner scan = new Scanner(System.in);
//		String subPattern = "";
//		System.out.println("Enter number of products:\n");
//		int noOfSubPattern = scan.nextInt();
//		scan.nextLine();
//		System.out.println("Enter product name for each line:\n");
//		for(int i = 0; i < noOfSubPattern; i++)
//		{
//		   String s = scan.nextLine();
//		   products.add(new Product(s));
//		}
//		
//	
//		System.out.println("********Before Stream*******");
//		products.forEach(s -> System.out.println(s.getName()));
//		
//		ProductComparator comp = new ProductComparator();
//		Comparator<Product> empComp1 = (e1, e2) -> comp.compare(e1,e2);
//		Comparator<Product> empComp2 = comp::compare;
//
//		System.out.println("*******After Stream (Flatten)**********");
//		
//		Stream<String> streamName= products.stream()
//			    .sorted((s1, s2) -> comp.compare(s1,s2))
//			    .map(p -> p.getName());
//		
//		System.out.println(
//				streamName
//				.map(w -> w.split(""))
//				.flatMap(Arrays::stream)
//		        //.distinct()
//				.collect(Collectors.toList()));
	
	}
	
	public static boolean testProduct(){
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("product1",50));
		products.add(new Product("product2",30));
		products.add(new Product("product3",40));
		products.add(new Product("product4",20));
		products.add(new Product("product5",100));
		
		ProductComparator comp = new ProductComparator();
		
		final Optional<Product> product= products.stream()
										//.reduce((a,b) -> a.getPrice()>b.getPrice()?a:b);
				.reduce((a,b) -> {
					if(a.getPrice()>b.getPrice()){
						return a;
					}
					return b;
				});

		//product.ifPresent(name -> System.out.println("Hello " + name.getFullName()));
		return product.isPresent();
		//return false;
		}

}
