package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		// list
		System.out.println("=========== List");
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbbbbbbb");
		list.add("ccc");
		list.add("aaaaa");
		list.add("aaa");
		System.out.println(list);

		// set
		System.out.println("=========== Set");
		Set<String> set = new HashSet<>(list);
		System.out.println(set);

		// map
		System.out.println("=========== Map");
		Map<Character, Integer> map = new LinkedHashMap<>();
		map.put('A', 65);
		map.put('B', 66);
		map.put('C', 67);
		map.put(null, null);
		System.out.println(map);

		// iterator
		System.out.println("=========== Iterator");
		Iterator<String> it = list.iterator();
		System.out.println(it.getClass());
		while (it.hasNext()) {
			String curr = it.next();
			if (curr == null) {
				continue;
			}
			System.out.println(curr);
			if (curr.length() > 3) {
				it.remove();
			}
		}

		System.out.println(list);

		// iterating maps
		System.out.println("=========== iterating maps");
		Iterator<Character> itMap = map.keySet().iterator();
		while (itMap.hasNext()) {
			Character key = itMap.next();
			if (key == null) {
				continue;
			}
			System.out.println(key + " - " + map.get(key));
		}
	}

}
