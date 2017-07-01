package prob5.duck;

import prob5.flybehavior.FlyBehavior;
import prob5.flybehavior.Flyable;
import prob5.flybehavior.UnFlyable;
import prob5.quackbehavior.QuackBehavior;

public abstract class Duck implements Flyable, UnFlyable {	
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void quack();
	public abstract void fly();
	public void swim() {
		System.out.println("Swimming");
	}
	public abstract void display();

}
