
class ExpansionCode {

	public static void main(String[] args) {
		int iValue = 10;
		double dValue;
		dValue = iValue;
		System.out.println("拡大変換 : int型の" + iValue + " から、double型の" + dValue);
		double ans = iValue * 2.5;
		System.out.println("計算結果は: " + ans + "です");

		byte bValue;
		bValue = 10;
		System.out.println("リテラルを縮小変換 : "+ bValue);

//		bValue = 500;
//		System.out.println("リテラルを縮小変換 : "+ bValue);
//
//		int iiValue = 20;
//		bValue = iiValue;
//		System.out.println("変数のデータを縮小変換: " + bValue);

		byte bValue1 = (byte) 20.5;
		System.out.println(bValue1);
		byte bValue2 = (byte) 264;
		System.out.println(bValue2);
		double dValue1 = (byte) 10.5;
		int iValue1  = (int)dValue1;
		System.out.println(iValue1);
	}

}
