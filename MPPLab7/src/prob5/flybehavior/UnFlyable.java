package prob5.flybehavior;

public interface UnFlyable extends FlyBehavior {
	
	@Override
	default void fly() {
		// TODO Auto-generated method stub
		System.out.println("CannotFly");
	}		
	
}
