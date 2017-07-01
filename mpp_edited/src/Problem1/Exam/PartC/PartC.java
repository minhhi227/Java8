/**
 *
 */
/**
 * @author sshad
 *
 */
package Problem1.Exam.PartC;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class PartC {

	//(Integer key,String value) ->System.out.println("Key:"+ key+" Value:"+ value)
	// name and type of lambda goes here
	BiConsumer<Integer, String> cal1 = (key, value) -> System.out.println("Key:" + key + " Value:" + value);

	// representing lambda as a method reference
	BiConsumer<Integer, String> cal2 = PartC::display;

	class MyBiConsumer implements BiConsumer<Integer, String> {

		@Override
		public void accept(Integer key, String value) {
			System.out.println("Key:" + key + " Value:" + value);
		}

	}

	private static void display(final Integer key, final String value) {
		System.out.println("Key:" + key + " Value:" + value);
	}

	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.forEach(cal1);// Use lambda to display all items
		map.forEach(cal2);// Use method reference to display all items
		map.forEach(new MyBiConsumer());// Use static nested class to display all items
	}

	public static void main(String[] args) {
		PartC p = new PartC();
		p.evaluator();
	}
}