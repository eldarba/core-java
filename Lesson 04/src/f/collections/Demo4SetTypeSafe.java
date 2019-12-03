package f.collections;

import java.util.HashSet;
import java.util.Set;

public class Demo4SetTypeSafe {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("AAA");
		set.add("BBB");
		set.add("AAA");
		set.add("CCC");
		set.add("AAA");

		System.out.println(set);
	}
}
