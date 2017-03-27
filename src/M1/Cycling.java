package M1;

// @Author : Hsienting Chu
import java.util.List;
import M2.Athlete;
import M2.Cyclist;
import M2.Official;
import M2.SuperAthlete;

public class Cycling extends Game {

	public Cycling(String ID, List<Athlete> athletes, Official referee) {
		super(ID, Driver.TYPE_CYCLE, athletes, referee);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean checkIsMatch(Athlete athlete) {
		return athlete instanceof Cyclist || athlete instanceof SuperAthlete;
	}

}
