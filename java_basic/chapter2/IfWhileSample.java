
class IfWhileSample {

	public static void main(String[] args) {
		int i = 1;
		if (i <= 3) {
			System.out.println("iは" + i + "です");
			i = i + 1;
		}

		int n = 1;
		while (n <= 3) {
			System.out.println("nは" + n + "です");
			n = n + 1;
		}

		int max = 10;
		int num = 1;
		int sum = 0;
		while (num <= max) {
			sum = sum + num;
			num = num + 1;
		}
		System.out.println("1~" + max + "までの合計は" + sum + "です");

		int d = 1;
		do {
			System.out.println(d + "回繰り返し");
			d++;
		} while (d <= 5);
	}

}
