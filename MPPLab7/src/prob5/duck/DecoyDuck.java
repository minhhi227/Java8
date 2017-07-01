package prob5.duck;

import prob5.flybehavior.CannotFly;
import prob5.quackbehavior.MuteQuack;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		super();
		// TODO Auto-generated constructor stub
		flyBehavior = new CannotFly();
		quackBehavior = new MuteQuack();
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
