package M2;
//Class Author : Haifan Wang
import java.util.Random;

public class Cyclist extends Athletes {
	// Constructor
	public Cyclist(String ID, String name, int age, String state) {
		super();
	}
	//implement compete
	public int compete(int result) {
		Random r = new Random();
		result = r.nextInt(301) + 500;

		return result;
	}

}
