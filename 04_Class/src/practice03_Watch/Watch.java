package practice03_Watch;

public class Watch {

	// 필드
		private int hour;  // 0 ~ 23
		private int minute;  // 0 ~ 59
		private int second;  // 0 ~ 59
		
		// 생성자
		public Watch(int hour, int minute, int second) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		}

		
		// 메소드
		
		
		
		public void addHour(int hour) {
			
			this.hour += hour;
		
		}
		public void addMinute(int minute) {
			int x = minute / 60; // 시간 
			
			if(x >= 1) {
				hour += x;
				this.minute += (minute - (60 * x));
			}
			else {
				this.minute += minute;
			}
			if(this.minute >= 60) {
				hour++;
				this.minute -= 60;
			}
		}
		public void addSecond(int second) { 
			int y = second / 60; // 분
			
			if(y < 60) {
				minute += y;
				this.second += second - ( 60 *y );
			}
			else if(y >= 60) {
				hour += second / 3600;
				this.minute += (second % 3600) / 60;
				this.second += (second % 3600) % 60;
			}
			else {
				this.second += second;
			}
			if(this.second >= 60) {
				this.minute++;
				this.second -= 60;
			}
			
		}
		public void see() {
			System.out.println(hour + "시 " + minute + " 분 " + second + " 초");
		}
		
}
