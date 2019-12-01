package h.animals.tests;

import e.singleton.Superman;
import h.animals.Bat;
import h.animals.Butterfly;
import h.animals.Hawk;
import h.animals.interfaces.AdvancedFlyer;
import h.animals.interfaces.Flyer;

public class Test2 {

	public static void main(String[] args) {
		Flyer[] flyers = new Flyer[5];

		flyers[0] = new Bat();
		flyers[1] = new Hawk();
		flyers[2] = new Butterfly();
		flyers[3] = Superman.getInstance();

		for (Flyer f : flyers) {
			if (f != null) {
				f.fly();
				if (f instanceof AdvancedFlyer) {
					AdvancedFlyer adv = (AdvancedFlyer) f;
					adv.land();
					adv.navigate();
				}
			} else {
				System.out.println("empty");
			}
			System.out.println("========");
		}
	}
}
