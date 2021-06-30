package kadai;

public class ChangeEnglish {
	public String convSeason(char season) {
		String rtnStr;

		if (season == '春') {
			rtnStr = "Spring";
		}else if (season == '夏') {
			rtnStr = "Summer";
		}else if (season == '秋') {
			rtnStr = "Autumn";
		}else if (season == '冬') {
			rtnStr = "Winter";
		} else {
			rtnStr = "変換不可能";
		}
		return rtnStr;
	}

	public String convDay(char day) {
		String rtnStr;

		if (day == '月') {
			rtnStr = "Monday";
		}else if (day == '火') {
			rtnStr = "Tuesday";
		}else if (day == '水') {
			rtnStr = "Wednesday";
		}else if (day == '木') {
			rtnStr = "Thursday";
		}else if (day == '金') {
			rtnStr = "Friday";
		}else if (day == '土') {
			rtnStr = "Saturday";
		}else if (day == '日') {
			rtnStr = "Sunday";
		} else {
			rtnStr = "変換不可能";
		}
		return rtnStr;
	}

	public String convMonth(int month) {
		String rtnStr;
		switch (month) {
		case 1:
			rtnStr = "January";
			break;
		case 2:
			rtnStr = "February";
			break;
		case 3:
			rtnStr = "March";
			break;
		case 4:
			rtnStr = "April";
			break;
		case 5:
			rtnStr = "May";
			break;
		case 6:
			rtnStr = "June";
			break;
		case 7:
			rtnStr = "July";
			break;
		case 8:
			rtnStr = "August";
			break;
		case 9:
			rtnStr = "September";
			break;
		case 10:
			rtnStr = "October";
			break;
		case 11:
			rtnStr = "November";
			break;
		case 12:
			rtnStr = "December";
			break;
		default:
			rtnStr = "変換不可能";
			break;
		}
		return rtnStr;
	}

}
