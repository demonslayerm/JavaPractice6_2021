
class ForTest {

	public static void main(String[] args) {
		int i, j;
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("i =  " + i + " j = " + j);
			}
		}

		for (int i2 = 0; i2 < 4; i2++) {
			if (i2 == 1) {
				System.out.println("continue");
				continue;
			} else if (i2 == 3) {
				System.out.println("break");
				break;
			}
			System.out.println("i2 = " + i2);
		}
	}

}
