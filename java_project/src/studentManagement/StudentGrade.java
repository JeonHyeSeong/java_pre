package studentManagement;

public class StudentGrade {
	
	private String subject;
	private int score;
	
	public StudentGrade() {}
	
	
	public StudentGrade(String subject, int score) {
		this.subject = subject;
		this.score = score;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	


	@Override
	public String toString() {
		return subject + " : " + score;
	}
	
	

}
