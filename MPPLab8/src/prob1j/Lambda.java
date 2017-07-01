package prob1j;
import java.util.function.Supplier;
public class Lambda {

	public static void main(String[] args) {
		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());

	}

}
