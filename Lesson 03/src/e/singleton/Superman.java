package e.singleton;

import h.animals.interfaces.Flyer;

public class Superman implements Flyer {

	// step 1 - create a private static instance of the type
	private static Superman instance;
	/////////////////////
	// other fields as needed
	/////////////////////

	// step 2 - define a private CTOR to prevent instance creation outside of this
	// class
	private Superman() {
	}

	// step 3 - provide getter method for the single instance
	public static Superman getInstance() {
		if (instance == null) {
			instance = new Superman();
		}
		return instance;
	}

	@Override
	public void fly() {
		System.out.println("Fly like a superman");

	}

	/////////////////////
	// other methods as needed
	/////////////////////

}
