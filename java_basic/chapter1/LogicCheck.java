
class LogicCheck {

	public static void main(String[] args) {
		int math = 80;
		int eng = 50;
		if (math >= 80 || eng >= 80) {
			System.out.println("合格です");
		} else {
			System.out.println("負合格です");
		}

		int num = 11;
		if (num == 11 &&(num = num + 1) == 12) {

		}
		System.out.println("num =" + num);

		num = 11;
		if (num == 11 && ++num == 12) {

		}
		System.out.println("num =" + num);

		num = 11;
		if (num == 11 && num = ben) {

		}
		System.out.println("num =" + num);

//		------------------------------

		num = 11;
		if ((num = num +1) == 12) {

		}
		System.out.println("num =" + num);

	}

}
