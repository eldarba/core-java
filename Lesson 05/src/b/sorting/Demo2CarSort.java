package b.sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo2CarSort {
	public static void main(String[] args) {

		Car c1 = new Car(999, "audi", 50);
		Car c2 = new Car(555, "volvo", 70);
		Car c3 = new Car(222, "mazda", 0);

		// static initialization of a list by converting varargs of a type to List
		List<Car> cars = Arrays.asList(c1, c2, c3);
		System.out.println("insertion order");
		print(cars);

		Collections.sort(cars);
		System.out.println("=============");
		System.out.println("natural order - car number");
		print(cars);

		CarSpeedComparator speedComparator = new CarSpeedComparator();
		Collections.sort(cars, speedComparator);
		System.out.println("=============");
		System.out.println("other order - car speed");
		print(cars);
	}

	private static void print(List<?> col) {
		for (Object curr : col) {
			System.out.println(curr);
		}

	}
}
