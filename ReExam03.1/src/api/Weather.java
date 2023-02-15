package api;

public class Weather {

	private int temp;
	private String wfKor;
	private int hour;
	
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public String getwfKor() {
		return wfKor;
	}
	public void setwfKor(String sfKor) {
		this.wfKor = sfKor;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	@Override
	public String toString() {
		return "Weather [temp=" + temp + ", sfKor=" + wfKor + ", hour=" + hour + "]";
	}
	
	
	
}
