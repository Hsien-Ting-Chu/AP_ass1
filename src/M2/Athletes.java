package M2;

public abstract class Athletes extends Participants {
	private int points;

	public Athletes(String ID, int age, String name, String state) {
		super(ID, age, name, state);
	}
}
