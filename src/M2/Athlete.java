package M2;

public abstract class Athlete extends Participant {
	private int points;

	public Athlete(String ID, int age, String name, String state) {
		super(ID, age, name, state);
	}
}
