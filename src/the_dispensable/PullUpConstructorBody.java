package the_dispensable;

public class PullUpConstructorBody {
	class Employee {
		protected String name;
		protected String id;

		public Employee(String name, String id) {
			this.name = name;
			this.id = id;
		}

		public String toString() {
			return id + ": " + name;
		}
	}

	class Manager extends Employee {
		private int grade;

		public Manager(String name, String id, int grade) {
			super(name, id);
			this.grade = grade;
		}

		public String toString() {
			return super.toString() + ", grade: " + grade;
		}
	}

	void test() {
		var m = new Manager("Andi", "0001", 10);
		System.out.println(m);
	}

	public static void main(String[] a) {
		new PullUpConstructorBody().test();
	}
}
