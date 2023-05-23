package otherTest;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Test;

public class StreamTest {

	@Test
	public void test() {

		getB().name();

		Set<Integer> listInsideIntegers1 = new LinkedHashSet<>();

		listInsideIntegers1.add(1);
		listInsideIntegers1.add(2);
		listInsideIntegers1.add(3);
		listInsideIntegers1.add(4);
		listInsideIntegers1.add(5);

		Set<Integer> listInsideIntegers2 = new LinkedHashSet<>();

		listInsideIntegers2.add(5);
		listInsideIntegers2.add(6);
		listInsideIntegers2.add(6);
		listInsideIntegers2.add(4);
		listInsideIntegers2.add(2);

		Set<Integer> listInsideIntegers3 = new LinkedHashSet<>();

		listInsideIntegers3.add(7);
		listInsideIntegers3.add(1);
		listInsideIntegers3.add(2);
		listInsideIntegers3.add(12);
		listInsideIntegers3.add(10);

		List<Set<Integer>> list = new CopyOnWriteArrayList<>();
		list.add(listInsideIntegers1);
		list.add(listInsideIntegers2);
		list.add(listInsideIntegers3);

		System.out.println(list);

		Map<Integer, Long> map1 = list.stream().flatMap(l -> l.stream())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(list);
		System.out.println(map1);

		Map<Integer, Long> map2 = list.stream().flatMap(l -> l.stream())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.<Integer, Long>comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(list);
		System.out.println(map1);
		System.out.println(map2);

	}

	public A getB() {

		class B extends A {
			@Override
			public void name() {
				System.out.println("Christine");
			}
		}

		return new B();
	}

}

class A {

	public void name() {
		System.out.println("dennis");
	}
}
