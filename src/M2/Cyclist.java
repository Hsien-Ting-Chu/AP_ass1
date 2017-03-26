package M2;
//Class Author : Haifan Wang 
import java.util.Random;

public class Cyclist extends Athletes implements ICompetable {
	// Constructor
	public Cyclist(String ID, int age, String name, String state) {
		super(ID, age, name, state);
	}
	
	//Define range 500~800
	final int range = 301; 
	final int start = 500;

	// implement compete
	public int compete(int seconds) {
		
		Random r = new Random();
		seconds = r.nextInt(range) + start;
		return seconds;
	}

}
