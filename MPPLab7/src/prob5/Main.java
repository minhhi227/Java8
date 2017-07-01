package prob5;

import prob5.duck.DecoyDuck;
import prob5.duck.Duck;
import prob5.duck.MallardDuck;
import prob5.duck.RedheadDuck;
import prob5.duck.RubberDuck;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = new Duck[] {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
		for (Duck duck : ducks) {
			System.out.println(duck.getClass().getSimpleName() + " : ");
			duck.display();
			duck.fly();
			duck.quack();
			duck.swim();
		}
	}
	
}
