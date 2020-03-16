package by.htp.time.model;

/*
 * 6. Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  
 * времени  и изменения  его  отдельных  полей  (час,  минута,  секунда) с  проверкой  допустимости 
 * вводимых  значений.  В  случае недопустимых значений полей поле устанавливается в значение 0. 
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */
public class Time {
	
	private int hour;
	
	private int minute;
	
	private int second;
	
	public Time() {
		
	}
	
	public Time(int hour, int minute, int second) {
		if ((hour > 0) && (hour < 24)) {
			this.hour = hour;
		}
		
		if ((minute > 0) && (minute < 60)) {
			this.minute = minute;
		}
		
		if ((second > 0) && (second < 60) ) {
			this.second = second;
		}
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if ((hour > 0) && (hour < 24)) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if ((minute > 0) && (minute < 60)) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if ((second > 0) && (second < 60) ) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}
	
	public void addHour(int h) {
		if(h > 0) {
			hour = (hour + h) % 24;
		} else {
			h = h % 24;
			if(hour >= - h) {
				hour = hour + h;
			} else {
				hour = 24 + hour + h; 
			}
		}
		
	}
	
	public void addMinute(int m) { 
		if (m > 0) {
			minute = (minute + m) % 60;
		} else {
			int temp = m % 60;
			if(minute >= - temp) {
				minute = minute + temp;
			} else {
				minute = 60 + minute + temp; 
			}
		}
		addHour(m / 60);
	}
	
	public void addSecond(int s) {
		if (s > 0) {
			second = (second + s) % 60;
		} else {
			int temp = s % 60;
			if(second >= - temp) {
				second = second + temp;
			} else {
				second = 60 + second + temp; 
			}
		}
		addMinute(s / 60);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Time other = (Time) obj;
		if (hour != other.hour) {
			return false;
		}
		
		if (minute != other.minute) {
			return false;
		}
		
		if (second != other.second) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}	
}
