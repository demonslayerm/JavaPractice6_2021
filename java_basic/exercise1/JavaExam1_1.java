
class JavaExam1_1 {

	public static void main(String[] args) {
		int num = 8;
		int price = 300;
		double amount;

		amount = num * price;

		if (num >= 10) {
			amount = amount * 0.9;
		}
		int how_much = (int)amount;
		System.out.println("合計金額は:  " + how_much + "円です");


	}

}
