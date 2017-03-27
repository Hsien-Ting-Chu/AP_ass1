package M1;

// @Author : Hsienting Chu
import java.util.List;

import M2.Athlete;
import M2.Official;
import M2.SuperAthlete;
import M2.Swimmer;

public class Swimming extends Game {

	public Swimming(String Id, List<Athlete> athletes, Official referee) {
		super(Id, Driver.TYPE_SWIM, athletes, referee);
	}

	@Override
	protected boolean checkIsMatch(Athlete athlete) {
		return athlete instanceof Swimmer || athlete instanceof SuperAthlete;
	}
}
