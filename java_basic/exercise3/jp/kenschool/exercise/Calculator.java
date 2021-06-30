package jp.kenschool.exercise;

public class Calculator {
	public int calc(String str) {
		int intNum = Integer.parseInt(str);
		intNum *= intNum;
		return intNum;
	}

	public int calc(String s1, String s2) {
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		int ans = num1 * num2;
		return ans;

	}
}
