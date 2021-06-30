package kadai;

public class Greeting {
	String name;
	String rtnStr;

	public Greeting(String name) {
		this.name = name;
	}

	public String morningG() {
		 rtnStr = this.name + "サン、おはようございます";
		 return rtnStr;
	}

	public String dailyG() {
		return this.name + "サン、こんにちは";
	}

	public String eveningG() {
		return this.name + "サン、こんばんは";
	}
}
