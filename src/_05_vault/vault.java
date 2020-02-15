package _05_vault;

import java.util.Random;

public class vault {

}
class jBond {
	Random rand = new Random();
	int code = rand.nextInt(100000);
	

	
	public void tryCode() {
		for (int i = 0; i < 1000000; i++) {
			if (i == code) {
				System.out.println(i);
			}
			else if (i > code) {
				break;
			}

		}
	}



}