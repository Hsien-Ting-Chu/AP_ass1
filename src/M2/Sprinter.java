package M2;

import java.util.Random;

public class Sprinter extends Athletes {

	@Override
	public int compete(int result) {
		Random r = new Random();
		result = r.nextInt(101) + 100;

		return result;
	}

}
