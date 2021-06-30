package java_basic;

public class TableStand {
	char bodyColor;
	boolean power;

	public TableStand(char bodyColor) {
		this.bodyColor = bodyColor;
	}

	public void on() {
		this.power = true;
		System.out.println("電源を入れました");
	}

	public void off() {
		this.power = false;
		System.out.println("電源を切りました");
	}

}
