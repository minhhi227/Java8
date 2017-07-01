package prob5.flybehavior;

public interface Flyable extends FlyBehavior {

	@Override
	default void fly() {
		// TODO Auto-generated method stub
		System.out.println("FlyWithWings");
	}	
	
}
