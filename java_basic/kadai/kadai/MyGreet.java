package kadai;

public class MyGreet {

	public static void main(String[] args) {
		Greeting aisatu = new Greeting("さとうさん");
		System.out.println(aisatu.morningG());
		System.out.println(aisatu.dailyG());
		System.out.println(aisatu.eveningG());
	}

}
