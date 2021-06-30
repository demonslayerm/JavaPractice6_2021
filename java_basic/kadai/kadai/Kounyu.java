package kadai;

class Item {
	String name;
	int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	int buy (int num) {
		int gokei = price * num;
		if (gokei >= 1000) {
			gokei = gokei * 9/10;
		}
		return gokei;
	}
}

public class Kounyu {
	public static void main(String[] args) {
		Item item = new Item("ボールペン", 380);
		int num = 3;
		System.out.println(item.name + num);
		System.out.println(item.buy(num));
	}
}