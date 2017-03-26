package M2;

import java.util.Random;

<<<<<<< HEAD
public class Swimmer extends Athlete {
=======
public class Swimmer extends Athletes implements ICompetable {
>>>>>>> origin/master
	// Constructor
	public Swimmer(String ID, int age, String name, String state) {
		super(ID, age, name, state);
	}

	// Define range 100~200
	final int range = 101;
	final int start = 100;

	// implement compete
	public int compete(int seconds) {
		Random r = new Random();
		seconds = r.nextInt(range) + start;
		return seconds;
	}

}