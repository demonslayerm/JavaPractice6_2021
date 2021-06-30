
class Sample5 {

	public static void main(String[] args) {
		int score = 90;
		if (score >= 80) {
			System.out.println("合格です");
		}
		System.out.println("処理を終了します");

		score = 70;
		if (score >= 80) {
			System.out.println("合格です");
		} else if (score >= 60) {
			System.out.println("補欠合格です");
		}
		System.out.println("処理を終了します");

		score = 50;
		if (score >= 80) {
			System.out.println("合格です");
		} else if (score >= 60) {
			System.out.println("補欠合格です");
		} else {
			System.out.println("不合格です");
		}
		System.out.println("処理を終了します");

		score = 120;
		if (score <= 120) {
			if (score >= 80) {
				System.out.println("合格です");
			} else {
				System.out.println("不合格です");
			}
		} else {
			System.out.println("値の範囲が無効です");
		}
		System.out.println("処理を終了します");
	}

}
