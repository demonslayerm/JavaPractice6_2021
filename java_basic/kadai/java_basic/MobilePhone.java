package java_basic;

public class MobilePhone {
	String name;
	String phoneNum;
	String mailAdress;
	boolean voiceMail;

	public MobilePhone(String name, String phoneNum, String mailAdress) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.mailAdress = mailAdress;
	}

	public void start() {
		this.voiceMail = true;
		System.out.println("留守番電話サービスを開始しました");
	}

	public void stop() {
		this.voiceMail = false;
		System.out.println("留守番電話サービスを停止しました");
	}

	public void info() {
		System.out.println(this.name + "のケータイです");
		System.out.println("電話番号は「" + phoneNum + "」です");
		System.out.println("メールアドレスは「" + mailAdress + "」です");

		if (voiceMail == true) {
			System.out.println("留守番電話サービスは開始しています");
		} else {
			System.out.println("留守番電話サービスは開始していません");
		}
	}

	public void call(String othersNum) {
		System.out.println(othersNum + "に電話しました");
	}

	public void mail(String reciever, String title, String contents) {
		System.out.println(this.mailAdress + "からメールを送りました");
		System.out.println("宛先: 【" + reciever + "】");
		System.out.println("題名: 【" + title + "】");
		System.out.println("本文: 【" + contents + "】");
	}

	public String createSig() {

		String rtnStr;
		rtnStr = "\n---------------------------------"
				+ "\n株式会社KEN"
				+ "\n営業一課　 【" + name + "】"
				+ "\nTEL　 :【" + phoneNum + "】"
				+ "\nMail　: 【" + mailAdress + "】"
				+ "\n---------------------------------";
		return rtnStr;
	}
}
