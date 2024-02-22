package the_bloater.large_class;

public class ExtractClass {
	// todo extract class TelephoneNumber from class Person
	public class TelephoneNumber {
		public String areaCode;
		public String number;

		public TelephoneNumber(String areaCode, String number) {
			this.areaCode = areaCode;
			this.number = number;
		}

		public String getTelephoneNumber() {
			return "(" + areaCode + ") " + number;
		}
	}

	class Person {
		private String name;
		private TelephoneNumber officeNumber;

		public Person(String name, TelephoneNumber officeNumber) {
			this.name = name;
			this.officeNumber = officeNumber;
		}

		public String getName() {
			return name;
		}

		public String getTelephoneNumber() {
			return officeNumber.getTelephoneNumber();
		}

		public TelephoneNumber getOfficeNumber() {
			return officeNumber;
		}

		public void setOfficeNumber(TelephoneNumber number) {
			officeNumber = number;
		}
	}
}