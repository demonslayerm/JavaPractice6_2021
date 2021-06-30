package kadai;

public class MyHoliday {

	public static void main(String[] args) {
		Shopping shopped = new Shopping();
		System.out.println(shopped.setPurse(30000));
		System.out.println(shopped.purchase("本だな", 5501, 25));
		System.out.println(shopped.purchase("くまちゃん", 551, 2));
		System.out.println(shopped.purchase("リボン", 1441, 3));
		System.out.println(shopped.mealBreak("やきそば", 800));
		System.out.println(shopped.mealBreak("パッタイ", 80043));
	}

}
