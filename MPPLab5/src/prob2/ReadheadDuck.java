package prob2;

public class ReadheadDuck extends Duck {
	public ReadheadDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}
	@Override
	public void display(){
		System.out.println("displaying");
	}

}
