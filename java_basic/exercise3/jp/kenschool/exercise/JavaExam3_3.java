package jp.kenschool.exercise;

public class JavaExam3_3 {

	public static void main(String[] args) {
		MyConstClass mcc = new MyConstClass("3x4=");
		String message = mcc.calcMethod(3, 4);
		System.out.println(message);
	}

}
