package b.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<>();
		integers.add(5);
		integers.add(100);
		integers.add(35);
		integers.add(17);
		integers.add(9);

		// use ctor to convert the collection type
		Set<Integer> set = new TreeSet<>(integers);
		// trees are always sorted
		System.out.println(set);

		System.out.println(integers);
		Collections.sort(integers);
		System.out.println(integers);

		List<String> strings = new ArrayList<>();
		strings.add("BBB");
		strings.add("ZZZ");
		strings.add("HHH");
		strings.add("Hello");
		System.out.println(strings);
		Collections.sort(strings);
		System.out.println(strings);

	}
}
