package h.animals.interfaces;

// interfaces can have multiple inheritance
public interface AdvancedFlyer extends Flyer, Navigator {

	void takeOff();

	void land();
}
