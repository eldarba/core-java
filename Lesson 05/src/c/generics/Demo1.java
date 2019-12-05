package c.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		// arrays has sub typing - dangerous can fail at runtime
		Animal[] animals = new Lion[3];

		animals[0] = new Lion();
		animals[1] = new Cat(); // fail at runtime

		System.out.println(Arrays.toString(animals));

		// Collections has no sub typing - safe will fail at compile time
		// List<Animal> list = new ArrayList<Lion>();

		// ? wild card means - any type - will point to any list
		List<?> listofAnyType = new ArrayList<Lion>();
		listofAnyType = new ArrayList<String>();
		// cons:
		// 1 - we can add only null
		listofAnyType.add(null); // can't add anything else
		// 2 - return type is Object
		Object o = listofAnyType.get(0);

		// ? extens Type wild card means - any type extending Type - will point to any
		// list of the type or down
		List<? extends Cat> list = new ArrayList<Cat>();
		list = new ArrayList<Lion>();
		// cons:
		// 1 - we can add only null
		list.add(null); // can't add anything else
		// pros
		// 1 - get will return a known type
		Cat c = list.get(0);

		// ? super
		List<? super Cat> list2 = new ArrayList<Cat>();
		list2 = new ArrayList<Mammal>();
		list2 = new ArrayList<Animal>();
		list2 = new ArrayList<Object>();

		// cons
		// 1 - return type is Object
		Object o2 = list2.get(0);

		// pros
		// 1 - we can add elements of Type and down
		list2.add(new Cat());
		list2.add(new Lion());

	}

}
