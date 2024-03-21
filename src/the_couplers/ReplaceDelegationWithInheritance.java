package the_couplers;

public class ReplaceDelegationWithInheritance {
	class Person {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLastName() {
			return name.substring(name.lastIndexOf(' ') + 1);
		}
	}

	class Employee {
		protected Person person;

		public Employee() {
			this.person = new Person();
		}

		public String getName() {
			return person.getName();
		}

		public void setName(String name) {
			person.setName(name);
		}

		@Override
		public String toString() {
			return "Emp: " + person.getLastName();
		}
	}
}
