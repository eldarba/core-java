package f.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo5Map {

	public static void main(String[] args) {

		Map<String, Double> map = new HashMap<>();

		map.put("Yosi", 15_000.30);
		map.put("Danna", 16_000.30);
		map.put("Danna", 17_000.30);
		map.put("Ron", 8_000.48);

		System.out.println(map);
		System.out.println("Ron's salary: " + map.get("Danna"));

		System.out.println("is there a Yosi? " + map.containsKey("Yosi"));

		map.remove("Yosi");
		System.out.println(map);

		System.out.println("is there a Yosi? " + map.containsKey("Yosi"));

		Set<String> names = map.keySet();
		System.out.println(names);

		//
		Map<String, Map<String, Double>> map2 = new HashMap<>();
	}

}
