package e.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import b.sorting.Car;

public class Demo91ReadObject {

	public static void main(String[] args) {

		Car car;

		// deserialize from file: car.obj

		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("files/car.obj")));) {

			Object obj = in.readObject();
			if (obj instanceof Car) {
				car = (Car) obj;
				System.out.println(car + " deserialized");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
