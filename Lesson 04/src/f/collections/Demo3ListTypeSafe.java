package f.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo3ListTypeSafe {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("AAA");
		list.add("BBB");
		list.add("AAA");
		list.add("CCC");
		list.add("AAA");

		System.out.println(list);
	}
}
