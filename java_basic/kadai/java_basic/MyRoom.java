package java_basic;

public class MyRoom {

	public static void main(String[] args) {
		TableStand stand = new TableStand('黒');

		char color = stand.bodyColor = '黒';
		System.out.println(color + "色の電気スタンドを作成しました");
		stand.on();
		stand.off();
	}

}
