package the_couplers;

public class RemoveMiddleMan {
	class Person {
		private Department department;

		public void setDepartment(Department arg) {
			department = arg;
		}

		public Person getManager() {
			return department.getManager();
		}
	}

	class Department {
		private String chargeCode;
		private Person manager;

		public Department(Person arg) {
			manager = arg;
		}

		public Person getManager() {
			return manager;
		}
	}

	void test() {
		Person john = new Person();
		var manager = john.getManager();
	}
}
