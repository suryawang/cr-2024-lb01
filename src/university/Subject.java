package university;

public class Subject {
	private String code;
	private String name;
	private int sks;

	public Subject(String code, String name, int sks) {
		this.code = code;
		this.name = name;
		this.sks = sks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}

	public String getCode() {
		return code;
	}

}
