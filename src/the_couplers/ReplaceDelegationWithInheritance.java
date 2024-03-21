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

	class Employee extends Person {
		@Override
		public String toString() {
			return "Emp: " + getLastName();
		}
	}
}
