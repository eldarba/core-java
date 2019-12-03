package b.classNesting;

public class State {
	private String name;
	private int population;

	public State(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public class Citizen {
		private String name;

		public Citizen(String name) {
			super();
			this.name = name;
			State.this.population++;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public State getState() {
			return State.this;
		}

		@Override
		protected void finalize() throws Throwable {
			State.this.population--;
		}

	}

}
