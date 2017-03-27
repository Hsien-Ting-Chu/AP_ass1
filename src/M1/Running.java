package M1;

// @Author : Hsienting Chu
import java.util.List;

import M2.Athlete;
import M2.Official;
import M2.Sprinter;
import M2.SuperAthlete;

public class Running extends Game {

	public Running(String Id, List<Athlete> athletes, Official referee) {
		super(Id, Driver.TYPE_RUN, athletes, referee);
	}

	@Override
	protected boolean checkIsMatch(Athlete athlete) {
		return athlete instanceof Sprinter || athlete instanceof SuperAthlete;
	}
}