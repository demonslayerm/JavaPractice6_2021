package java_basic;

public class Business {
	int expense;

	public void processExp(int amount) {
		this.expense = this.expense + amount;
		System.out.println("♦♦♦現在の経費は　" + this.expense + "です。♦♦♦");
	}

	public void processFare(int fare) {
		this.expense = this.expense - fare;
		System.out.println("～電車（" + fare + ")で移動します。～");
		System.out.println("♦♦♦現在の経費は　" + this.expense + "です。♦♦♦");
	}

	public void giveEst(String customer, String product, int estimate) {
		System.out.println(customer + "　御中");
		System.out.println("商　品　名: " + product);
		System.out.println("お見積金額: " + estimate + "円");
		System.out.println("株式会社　KEN");
		System.out.println("営業一家");
		System.out.println("KEN太郎");
		System.out.println("電話");
	}

	 public void recess(String drink, int amount) {
		 this.expense = this.expense - amount;
		 System.out.println("～" + drink + "(" + amount + "円)を飲んで休憩中です！～");
		 System.out.println("♦♦♦現在の経費は　" + this.expense + "です。♦♦♦");

	 }

}
