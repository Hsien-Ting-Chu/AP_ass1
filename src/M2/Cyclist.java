package M2;

import java.util.Random;

public class Cyclist extends Athletes {

	@Override
	public int compete(int result) {
		Random r = new Random();
		result = r.nextInt(301) + 500;

		return result;
	}

}
