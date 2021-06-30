package jp.kenschool.exercise;
//
//public class MyConstClass {
//	private String expression;
//	public int x;
//	public int y;
//
//	public MyConstClass(String expression) {
//		this.expression = expression;
//	}
//
//	public String calcMethod(int x, int y) {
//		this.x = x;
//		this.y = y;
//		System.out.println(expression + x * y);
//	}
//}

public class MyConstClass{
	private String expression;
	public MyConstClass(String tmp) {
		expression = tmp;
	}
	public String calcMethod(int v1, int v2) {
		int ans = v1 * v2;
		String message = expression + ans;
		return message;
	}
}
