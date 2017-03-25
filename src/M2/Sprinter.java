package M2;

import java.util.Random;

public class Sprinter extends Athletes {
	// Constructor
	public Sprinter(String ID, String name, int age, String state) {
		super();
	}
	//implement compete
	public int compete(int result) {
		Random r = new Random();
		result = r.nextInt(101) + 100;

		return result;
	}

}
