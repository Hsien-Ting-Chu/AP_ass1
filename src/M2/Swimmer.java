package M2;

import java.util.Random;

public class Swimmer extends Athletes {

	@Override
	public int compete(int result) {
		Random r = new Random();
		result = r.nextInt(11) + 10;

		return result;
	}

}