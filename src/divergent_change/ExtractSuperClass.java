package divergent_change;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractSuperClass {
	class Employee {
		private String name;
		private int annualCost;
		private String id;

		public Employee(String name, String id, int annualCost) {
			this.name = name;
			this.id = id;
			this.annualCost = annualCost;
		}

		public int getAnnualCost() {
			return annualCost;
		}

		public String getId() {
			return id;
		}

		public String getName() {
			return name;
		}
	}

	class Department {
		private String name;
		private Vector<Employee> staff = new Vector();

		public Department(String name) {
			this.name = name;
		}

		public int getTotalAnnualCost() {
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

		public String getName() {
			return name;
		}
	}

	void test() {
		Employee andi = new Employee("Andi", "001", 100);
		Employee budi = new Employee("Budi", "002", 120);
		Department departement = new Department("Binus University");
		departement.addStaff(andi);
		departement.addStaff(budi);
		System.out.printf("Department %s: %d\n", departement.getName(), departement.getTotalAnnualCost());
		System.out.printf("Employee %s: %d\n", andi.getName(), andi.getAnnualCost());
		System.out.printf("Employee %s: %d\n", budi.getName(), budi.getAnnualCost());
	}

	public static void main(String[] a) {
		new ExtractSuperClass().test();
	}
}
