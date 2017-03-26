package M2;

import java.util.Random;

public class Swimmer extends Athletes {
	// Constructor
	public Swimmer(String ID, int age, String name, String state) {
		super(ID, age, name, state);
	}

	// implement compete
	public int compete(int seconds) {
		Random r = new Random();
		seconds = r.nextInt(101) + 100;
		return seconds;
	}

}