package b.classNesting;

import b.classNesting.State.Citizen;

public class StateTest {

	public static void main(String[] args) throws InterruptedException {
		State il = new State("Israel");
		State fr = new State("France");
		Citizen c1 = il.new Citizen("Dan");
		Citizen c2 = fr.new Citizen("Paul");
		Citizen c3 = il.new Citizen("Danna");

		System.out.println("state name: " + il.getName());
		System.out.println("citizen name: " + c1.getName());

		System.out.println(c1.getName() + " from " + c1.getState().getName());
		System.out.println(c2.getName() + " from " + c2.getState().getName());

		System.out.println(il.getName() + " citiezens: " + il.getPopulation());
		System.out.println(fr.getName() + " citiezens: " + fr.getPopulation());

		c2 = null;
		System.gc();

		Thread.sleep(2000);

		System.out.println(il.getName() + " citiezens: " + il.getPopulation());
		System.out.println(fr.getName() + " citiezens: " + fr.getPopulation());
	}
}
