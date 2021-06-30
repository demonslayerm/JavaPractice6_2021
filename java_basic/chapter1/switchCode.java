
class switchCode {

	public static void main(String[] args) {
		char moji = 'a';
		switch (moji) {
		case 'a':
			System.out.println("aです");
			break;
		case 'b':
			System.out.println("bです");
			break;
		case 'c':
			System.out.println("cです");
			break;
		default:
			System.out.println("a,b,c以外です");
			break;
		}
	}

}
