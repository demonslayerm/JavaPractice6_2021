
class ArrayCode1 {

	public static void main(String[] args) {
		int[] no = new int[3];

		no[0] = 1;
		no[1] = 5;
		no[2] = 2;

		System.out.println("1番のお客さま、　" + no[0] + "番の窓口へ");
		System.out.println("2番のお客さま、　" + no[1] + "番の窓口へ");
		System.out.println("3番のお客さま、　" + no[2] + "番の窓口へ");
		System.out.println("");
		//--------------------------------------

		int[] no2 = { 142, 3, 5 };

		System.out.println("1番のお客さま、　" + no2[0] + "番の窓口へ");
		System.out.println("2番のお客さま、　" + no2[1] + "番の窓口へ");
		System.out.println("3番のお客さま、　" + no2[2] + "番の窓口へ");
		System.out.println("");
		//--------------------------------------

		int[] no3 = { 1, 4, 6 };
		int len = no3.length;
		System.out.println("1番のお客さま、　" + no3[0] + "番の窓口へ");
		System.out.println("2番のお客さま、　" + no3[1] + "番の窓口へ");
		System.out.println("3番のお客さま、　" + no3[2] + "番の窓口へ");
		System.out.println("現在のお客様は" + len + "人です");
		System.out.println("");
		//--------------------------------------

		int[] no4 = { 4, 8, 12, 7 };
		int len4 = no4.length;
		for (int i4 = 0; i4 < len4; i4++) {
			System.out.println((i4 + 1) + "番目のおきゃくさま、　" + no4[i4] + "番窓口へ");
		}
		System.out.println("現在のお客様は" + len + "人です");
		System.out.println("");
	}

}
