package the_bloater.large_class;

public class ExtractInterface {
	class TimeSheet {
		public double charge(Employee employee, int days) {
			double base = employee.getRate() * days;
			if (employee.hasSpecialSkill()) {
				return base * 1.05;
			} else {
				return base;
			}
		}
	}

	class Employee {
		private int rate;
		private boolean hasSpecialSkill;

		public Employee(int rate, boolean hasSpecialSkill) {
			this.rate = rate;
			this.hasSpecialSkill = hasSpecialSkill;
		}

		public int getRate() {
			return rate;
		}

		public boolean hasSpecialSkill() {
			return hasSpecialSkill;
		}
	}

	void test() {
		var e1 = new Employee(100, false);
		var e2 = new Employee(90, true);
		var ts = new TimeSheet();
		System.out.println(ts.charge(e1, 10));
		System.out.println(ts.charge(e2, 10));
	}

	public static void main(String[] args) {
		new ExtractInterface().test();
	}
}