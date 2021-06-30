
class Sample4 {

	public static void main(String[] args) {
		int value1, value2;
		boolean boo1;

		value1 = 5;
		value2 = 5;

		boo1 = (value1 == value2);
		System.out.println("value1 == value2:" + boo1);

		value1 = 10;

		boo1 = (value1 == value2);
		System.out.println("value1 == value2:" + boo1);

		boo1 = (value1 > value2);
		System.out.println("value1 > value2:" + boo1);

	}

}
