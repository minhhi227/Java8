package prob2;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> song = Stream.of("gently", "down", "the", "stream");
		Stream<String> silence = Stream.empty();
		Stream<String> echos = Stream.generate(() -> "Echo");
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
		List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
		Stream<String> longWords = messages.stream().filter(w -> w.length() > 12);
		Stream<String> lowercaseWords = messages.stream().map(String::toLowerCase);
		Stream<String> firstLetters = messages.stream().map(s -> s.substring(0, 1));
		
		Stream<Stream<String>> result = messages.stream().map(w -> letters(w));
		Stream<String> flatResult = messages.stream().flatMap(w -> letters(w));
		flatResult.forEach(System.out::println);
		
		Stream<Double> randoms100 = Stream.generate(Math::random).limit(100);
		
		Stream<String> uniqueWords
		= Stream.of("merrily", "merrily", "merrily", "gently").distinct();
		
		Optional<String> startsWithQ
		= messages.stream().filter(s -> s.startsWith("Q")).findFirst();
		Optional<String> startsWithQ2
		= messages.stream().parallel().filter(s -> s.startsWith("Q")).findAny();
//		
//		Map<Integer, String> idToName = people.collect(
//				Collectors.toMap(Person::getId, Person::getName));
//		Map<Integer, Person> idToPerson = people.collect(
//				Collectors.toMap(Person::getId, Function.identity()));
//		Map<String, Set<String>> countryLanguageSets = locales.collect(
//				Collectors.toMap(
//				Locale::getDisplayCountry,
//				l -> Collections.singleton(l.getDisplayLanguage()),
//				(a, b) -> { // Union of a and b
//				Set<String> union = new HashSet<>(a);
//				union.addAll(b);
//				return union; }));
//		Map<Integer, Person> idToPerson = people.collect(
//				Collectors.toMap(
//				Person::getId,
//				Function.identity(),
//				(existingValue, newValue) -> { throw new IllegalStateException(); },
//				TreeMap::new));
		
//		int[] shortWords = new int[12];
//		words.parallelStream().forEach(
//		s -> { if (s.length() < 12) shortWords[s.length()]++; });
//		// Error—race condition!
//		System.out.println(Arrays.toString(shortWords));
//		
//		Map<Integer, Long> shortWordCounts =
//				words.parallelStream()
//				.filter(s -> s.length() < 10)
//				.collect(groupingBy(
//				String::length,
//				counting()));
//		
	}
	public static Stream<String> letters(String s) {
		List<String> result = new ArrayList<>();
		for (int i = 0; i < s.length(); i++)
		result.add(s.substring(i, i + 1));
		return result.stream();
		}

}
