package the_dispensable;

import java.sql.Date;

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
	
	class Staff extends Employee {
		private Date endContract;
		public Staff(String name, String id, Date endContract) {
			super(name, id);
			this.endContract = endContract;
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
