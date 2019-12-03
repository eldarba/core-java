package f.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo2Set {

	public static void main(String[] args) {

		Set set = new HashSet();

		set.add("AAA");
		set.add("AAA");
		set.add(new Date());
		set.add(5);
		set.add("AAA");

		System.out.println(set);
	}
}
