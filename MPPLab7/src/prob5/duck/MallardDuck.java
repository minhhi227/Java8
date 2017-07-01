package prob5.duck;

import prob5.flybehavior.FlyWithWings;
import prob5.quackbehavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super();
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		quackBehavior.quack();
	}
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		flyBehavior.fly();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display");
	}
}
