package university;

public class Student {
	private String studentId; // field
	private String name;
	private int ipk;

	public Student(String id, String name) {
		this.studentId = id;
		this.name = name;
		ipk = 0;
	}

	public String getStudentId() { // method
		return studentId;
	}

	public String getName() {
		return name;
	}

	public int getIpk() {
		return ipk;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIpk(int ipk) {
		this.ipk = ipk;
	}

	public String toString() {
		return studentId + ":" + name + ", ipk: " + (ipk / 100) + "." + (ipk % 100);
	}
}
