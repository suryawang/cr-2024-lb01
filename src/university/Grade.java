package university;

public class Grade {
	private Student student;
	private Subject subject;
	private int score;

	public Grade(Student student, Subject subject, int score) {
		this.student = student;
		this.subject = subject;
		this.score = score;
	}

	public Student getStudent() {
		return student;
	}

	public Subject getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}

	public String toString() {
		return String.format("Student: %s, Subject: %s, Score: %d\n", 
				student.getStudentId() + "-" + student.getName(),
				subject.getCode() + "-" + subject.getName(), score);
	}
}
