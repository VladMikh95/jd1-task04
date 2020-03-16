package by.htp.train.main;

public class Date {
	
	private int year;
	
	private int month;
	
	private int day;
	
	private int hour;
	
	private int minute;
	
	public Date(int year, int month, int day, int hour, int minute) {
		if (checkParam(year, month, day, hour, minute)) {
			this.year = year;
			this.month = month;
			this.day = day;
			this.hour = hour;
			this.minute =  minute;
		}
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public String getDate() {
		String s = this.year + "/" + this.month + "/" + this.day + " " 
				+ this.hour + "." + this.minute;
		return s;
	}
	
	private boolean checkParam(int year, int month, int day, int hour, int minute) {
		if (year != 2020) {
			return false;
		}
		
		if ((month < 1) || (month > 12)) {
			return false;
		}
		
		if (month == 2) {
			if ((day < 1) || (day > 28)) {
				return false;
			} 
		}
		
		if ((month == 1) || (month == 3) || (month == 5) || (month == 7)
				|| (month == 8)  || (month == 10) || (month == 12)) {
			if ((day < 1) || (day > 31)) {
				return false;
			} 
		} 
		
		if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
			if ((day < 1) || (day > 30)) {
				return false;
			} 
		}
		
		if ((hour < 0) || (hour > 23)) {
			return false;
		}
		
		if ((minute < 0) || (minute > 59)) {
			return false;
		}
		
		return true;
	}
}


