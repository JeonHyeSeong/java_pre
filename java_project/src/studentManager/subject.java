package studentManager;

public class subject {
	private String course;
	private String time;
	private String period;
	private String day;
	
	public subject() {}
	
	public subject(String course, String period, String time, String day) {
		this.course = course;
		this.period = period;
		this.time = time;
		this.day = day;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	

}
