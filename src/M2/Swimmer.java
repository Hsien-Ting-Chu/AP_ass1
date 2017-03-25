package M2;
//Class Author : Haifan Wang
import java.util.Random;

public class Swimmer extends Athletes {
	// Constructor
	public Swimmer(String ID, String name, int age, String state) {
		super();
	}
	//implement compete
	public int compete(int result) {
		Random r = new Random();
		result = r.nextInt(11) + 10;

		return result;
	}

}