
public class ArgsSample {

	public static void main(String[] args) {
		String message;
		message = "さん、こんにちは";
		message = args[0] + message;
		System.out.println(message);
		System.out.println("");
//		-------------------------------

		int score = Integer.parseInt(args[0]);
		if (score >= 80) {
			System.out.println("ごうかくです");
		} else {
			System.out.println("不合格です");
		}


	}

}
