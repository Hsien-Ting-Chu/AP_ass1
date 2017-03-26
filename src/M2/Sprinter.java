	package M2;
//Class Author : Haifan Wang 
import java.util.Random;

public class Sprinter extends Athletes {
	// Constructor
	public Sprinter(String ID, int age, String name, String state) {
		super(ID, age, name, state);
	}

	// implement compete
	public int compete(int seconds) {
		Random r = new Random();
		seconds = r.nextInt(11) + 10;
		return seconds;
	}

}
