package M2;
//Class Author : Haifan Wang

import M1.Driver;

public class SuperAthlete extends Athlete {

	// Constructor
	// The superathletes that can attend three different kinds of games
	private Swimmer swimmer;
	private Sprinter sprinter;
	private Cyclist cyclist;

	// Create three kinds of athlete for superAthlete
	public SuperAthlete(String ID, int age, String name, String state) {
		super(ID, age, name, state);
		cyclist = new Cyclist(ID, age, name, state);
		sprinter = new Sprinter(ID, age, name, state);
		swimmer = new Swimmer(ID, age, name, state);
	}

	public int compete() {
		throw new RuntimeException(
				"You should call getCompeter() for superAthlete, superAthlete.compete is not available");
	}

	// Return to the right competer according to the game type
	@Override
	public ICompetable getCompeter(String gameType) {
		switch (gameType) {
		case Driver.TYPE_RUN:
			return sprinter;
		case Driver.TYPE_SWIM:
			return swimmer;
		case Driver.TYPE_CYCLE:
			return cyclist;
		}
		throw new RuntimeException("Wrong gameType");
	}
}