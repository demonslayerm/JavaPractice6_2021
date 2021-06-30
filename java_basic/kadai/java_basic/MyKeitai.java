package java_basic;

public class MyKeitai {

	public static void main(String[] args) {
		MobilePhone myPhone = new MobilePhone("Ken太郎", "090-333-2132", "taro@ken.com");
		myPhone.info();
		myPhone.start();
		myPhone.stop();
		myPhone.call("030-6666-6666");
		myPhone.mail("ドキンちゃん", "やっほ～", "本文だよ");
		System.out.println(myPhone.createSig());
	}

}
