	package M2;
//Class Author : Haifan Wang 
import java.util.Random;

<<<<<<< HEAD
public class Sprinter extends Athlete {
=======
public class Sprinter extends Athletes implements ICompetable{
>>>>>>> origin/master
	// Constructor
	public Sprinter(String ID, int age, String name, String state) {
		super(ID, age, name, state);
	}
	
	//Define range 10~20
		final int range = 11;
		final int start = 10;
		
	// implement compete
	public int compete(int seconds) {
		Random r = new Random();
		seconds = r.nextInt(range) + start;
		return seconds;
	}

}
