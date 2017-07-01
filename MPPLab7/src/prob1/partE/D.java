package prob1.partE;

public interface D extends B, C {

	@Override
	default void method1() {
		
		// TODO Auto-generated method stub
		C.super.method1();
	}	
}
