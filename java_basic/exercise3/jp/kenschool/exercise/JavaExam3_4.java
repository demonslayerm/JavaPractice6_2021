package jp.kenschool.exercise;

public class JavaExam3_4 {
	public static void main(String[] args) {
		Calculator over = new Calculator();
		int ans1 = over.calc("5");
		int ans2 = over.calc("5", "4");
		System.out.println("引数が一つのメソッド: " + ans1);
		System.out.println("引数が二つのメソッド: " + ans2);
	}
}
