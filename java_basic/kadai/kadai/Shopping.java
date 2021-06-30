package kadai;

public class Shopping {
	int purse;
	int point;

	public int setPurse(int money) {
		purse = purse + money;
		return purse;
	}

	public boolean anyLeft(int money) {
		if (purse < money) {
			return false;
		} else {
			return true;
		}
	}

	public int addPoint(int money) {
		int addedPoint = money / 100;
		this.point = this.point + addedPoint;
		return addedPoint;
	}

	public String purchase(String name, int price, int howMany) {
		int sum = price * howMany;
		boolean canBuy = anyLeft(sum);
		String rtnStr;

		if (canBuy == true) {
			this.purse = this.purse - sum;
			rtnStr = "\n---------------------------------"
					+ "\n商品　 :【" + name + "】"
					+ "\n価格　: 【" + price + "】"
					+ "\n個数　: 【" + howMany + "】"
					+ "\n合計　: 【" + sum + "】"
					+ "\n"
					+ "\n【" + addPoint(sum) + "】　point加算"
					+ "\n現在　【" + point + "】　point　です"
					+ "\n---------------------------------";

		} else {
			rtnStr = "残金が足りず購入できません-----" + name;
		}
		return rtnStr;
	}

	public String mealBreak(String name, int price) {
		boolean canBuy = anyLeft(price);
		String rtnStr;

		if (canBuy == true) {
			this.purse = this.purse - price;
			rtnStr = "\n【" + name + "】 (" + price + "）円を注文しました";
		} else {
			rtnStr = "\n残金が足りず購入できません-----" + name;
		}
		return rtnStr;
	}

}
