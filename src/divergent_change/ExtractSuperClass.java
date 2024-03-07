package divergent_change;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractSuperClass {
	abstract class Party {
		private String name;

		public String getName() {
			return name;
		}

		public Party(String name) {
			this.name = name;
		}

		abstract int getAnnualCost();
	}

	class Employee extends Party {
		private int annualCost;
		private String id;

		public Employee(String name, String id, int annualCost) {
			super(name);
			this.id = id;
			this.annualCost = annualCost;
		}

		public int getAnnualCost() {
			return annualCost;
		}

		public String getId() {
			return id;
		}

	}

	class Department extends Party {
		private Vector<Employee> staff = new Vector();

		public Department(String name) {
			super(name);
		}

		public int getAnnualCost() {
			int result = 0;
			for (Employee employee : staff)
				result += employee.getAnnualCost();
			return result;
		}

		public int getHeadCount() {
			return staff.size();
		}

		public Enumeration getStaff() {
			return staff.elements();
		}

		public void addStaff(Employee arg) {
			staff.addElement(arg);
		}
	}

	void test() {
		Employee andi = new Employee("Andi", "001", 100);
		Employee budi = new Employee("Budi", "002", 120);
		Department departement = new Department("Binus University");
		departement.addStaff(andi);
		departement.addStaff(budi);
		print(departement, "Departement");
		print(andi, "Employee");
		print(budi, "Employee");
	}

	void print(Party party, String type) {
		System.out.printf("%s %s: %d\n", type, party.getName(), party.getAnnualCost());
	}

	public static void main(String[] a) {
		new ExtractSuperClass().test();
	}
}
