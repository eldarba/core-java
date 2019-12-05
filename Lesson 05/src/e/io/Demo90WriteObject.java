package e.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import b.sorting.Car;

public class Demo90WriteObject {

	public static void main(String[] args) {

		Car car = new Car(4141, "Ford", 20);

		// serialize into file: car.obj

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("files/car.obj")));) {

			out.writeObject(car);
			System.out.println(car + " serialized");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
