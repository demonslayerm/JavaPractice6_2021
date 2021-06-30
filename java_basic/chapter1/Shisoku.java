
class Shisoku {

	public static void main(String[] args) {
		int value1, value2, ans;
		value1 = 10;
		value2 = 5;
		ans = value1 + value2;
		System.out.println("加算=>" + ans);
		ans = value1 - value2;
		System.out.println("減算=>" + ans);
		ans = value1 * value2;
		System.out.println("乗算=>" + ans);
		ans = value1 / value2;
		ans = value1 % value2;
		System.out.println("剰余算=>" + ans);

		int num1 = 10;
		int num2 = 10;
		int ans1, ans2;

		ans1 = num1++;
		ans2 = ++num2;

		System.out.println("num1 =>" + num1);
		System.out.println("num2 =>" + num2);
		System.out.println("ans1 =>" + ans1);
		System.out.println("ans2 =>" + ans2);
	}

}
