package kadai;

class Kadai {

String concatPath(String folder, String file) {
	if (!folder.endsWith("\\")) {
		folder += "\\";
	}
	return folder + file;


}

}