package example;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TriFunction<Integer,Integer,Integer,Integer> f = (x,y,z) -> x+y+z;
		System.out.println(f.apply(10, 5, 1));
		
	}

}
