package java_basic;

public class MyJob {

	public static void main(String[] args) {
		Business salesman = new Business();
		salesman.processExp(2000);
		salesman.processFare(180);
		salesman.giveEst("XYZ株式会社", "おもちゃ", 5300 );
		salesman.recess("珈琲", 350);
	}

}
