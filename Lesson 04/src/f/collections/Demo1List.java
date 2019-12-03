package f.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo1List {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("AAA");
		list.add("AAA");
		list.add(new Date());
		list.add(5);
		list.add("AAA");

		List<String> l2 = list; // not safe

		System.out.println(list);
	}
}
