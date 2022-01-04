package test9t;

public class Java93 {
	public static void main(String[] args) {
		Date time = new Date(0);
		int t = 10000;
		time.setTime(t);
		System.out.println(time.ToString());
		for(int i = 0;i < 7;i++) {
			t *= 10;
			time.setTime(t);
			System.out.println(time.ToString());
		}
	}
}

class Date {
	int time,day,hour,min,sec;
	Date(int newTime){
		time = newTime;
		day = time / 86400;
		time %= 86400;
		hour = time / 3600;
		time %= 3600;
		min = time / 60;
		time %= 60;
		sec = time;
	}
	void setTime(int newTime) {
		time = newTime;
		day = time / 86400;
		time %= 86400;
		hour = time / 3600;
		time %= 3600;
		min = time / 60;
		time %= 60;
		sec = time;
	}
	String ToString() {
		String str = "";
		str += this.day;
		str += "day:";
		str += this.hour;
		str += "hour:";
		str += this.min;
		str += "min:";
		str += sec;
		str += "sec:";
		return str;
	}
}
