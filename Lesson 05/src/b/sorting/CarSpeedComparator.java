package b.sorting;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {
		int sp1 = c1.getSpeed();
		int sp2 = c2.getSpeed();
		return sp1 < sp2 ? -1 : sp1 == sp2 ? 0 : 1;
	}

}
