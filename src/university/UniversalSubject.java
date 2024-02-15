package university;

public class UniversalSubject extends Subject {
	private String globalCode;

	public UniversalSubject(String code, String name, int sks, String globalCode) {
		super(code, name, sks);
		this.globalCode = globalCode;
	}

	public String getGlobalCode() {
		return globalCode;
	}

	@Override
	public String toString() {
		return String.format("%s[%s] - %s", getCode(), globalCode, getName());
	}
}
