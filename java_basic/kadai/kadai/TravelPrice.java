package kadai;

public class TravelPrice {
	String tourName;
	int normalCharge;

	public TravelPrice(String name, int charge) {
		this.tourName = name;
		this.normalCharge = charge;
	}

	public String standardPrice() {

		String rtnStr;
		rtnStr = "\n---------------------------------"
				+ "\nツアー名: 【" + tourName + "】"
				+ "\n旅行代金: 【" + normalCharge + "】"
				+ "\nキャンセル料は3日前より発生いたします"
				+ "\n---------------------------------";
		return rtnStr;
	}

	public String memberPrice() {

		String rtnStr ;
		long discount20 = normalCharge * 80/100;
		rtnStr = "\n---------------------------------"
				+ "\nツアー名: 【" + tourName + "】"
				+ "\n旅行代金: 【" + discount20 + "】"
				+ "\n会員割引で20%offとなっております"
				+ "\nキャンセル料は3日前より発生いたします"
				+ "\n---------------------------------";
		return rtnStr;
	}

	public String employeePrice() {

		String rtnStr ;
		long discount30 = normalCharge * 70/100;
		rtnStr = "\n---------------------------------"
				+ "\nツアー名: 【" + tourName + "】"
				+ "\n旅行代金: 【" + discount30 + "】"
				+ "\n会員割引で20%offとなっております"
				+ "\nキャンセル料は3日前より発生いたします"
				+ "\n---------------------------------";
		return rtnStr;
	}

}
