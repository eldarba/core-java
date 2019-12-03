package f.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo6Iterator {

	public static void main(String[] args) {

		Set<Integer> set = new LinkedHashSet<>();

		set.add(5);
		set.add(9);
		set.add(11);
		set.add(98);
		set.add(17);

		System.out.println(set);

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int curr = it.next();
			System.out.println(curr);
			if (curr > 15) {
				it.remove();
			}
		}

		System.out.println(set);
	}

}
