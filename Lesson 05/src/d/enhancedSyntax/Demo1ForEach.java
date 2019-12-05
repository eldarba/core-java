package d.enhancedSyntax;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo1ForEach {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// String curr - reference to the current element
		// set - the collection
		for (String curr : set) {
			System.out.println(curr);
			if (curr.equals("bbb")) {
				set.remove(curr);
			}
		}

		System.out.println(set);
	}

}
