package kadai;

public class MyPrice {

	public static void main(String[] args) {
		TravelPrice fee = new TravelPrice("秋の味覚食べ放題ツアー", 15000);

		System.out.println(fee.standardPrice());
		System.out.println(fee.memberPrice());
		System.out.println(fee.employeePrice());
	}

}
