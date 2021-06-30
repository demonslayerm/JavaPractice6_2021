
class MultiArray {

	public static void main(String[] args) {
		int [][] goods;
		goods = new int[2][5];
		goods[0][0] = 100;
		goods[0][1] = 101;
		goods[0][2] = 102;
		goods[0][3] = 103;
		goods[0][4] = 104;
		goods[1][0] = 3000;
		goods[1][1] = 500;
		goods[1][2] = 4500;
		goods[1][3] = 6000;
		goods[1][4] = 1;
		int num = Integer.parseInt(args[0]);
		System.out.println("いらっしゃいませ");
		System.out.println(goods[0][num] + "番の商品は" + goods[1][num] + "円です");
	}

}
