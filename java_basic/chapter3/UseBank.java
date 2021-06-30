
public class UseBank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		int mny = Integer.parseInt(args[0]);
		bank.setMoney(mny);
		System.out.println("振込額: " + mny);
//		bank.money = 0;
		int nowMoney = bank.getMoney();
		System.out.println("現在の所持金: " + nowMoney);
	}

}
