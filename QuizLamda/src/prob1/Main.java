package prob1;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<List<String>, List<String>> uppers = w -> w.stream()
															.map(e ->e.toUpperCase())
															.collect(Collectors.toList());
	}

}
