package switch_statement;

public final class ReplaceConditionalWithPolymorphism {

	public void test() {
		Employee abi = new Employee(EmployeeType.newType(EmployeeType.ENGINEER), 1200, 0, 0);
		Employee rika = new Employee(EmployeeType.newType(EmployeeType.SALESMAN), 1200, 500, 0);
		Employee eri = new Employee(EmployeeType.newType(EmployeeType.MANAGER), 1200, 0, 700);
		Employee sinta = new Employee(EmployeeType.newType(EmployeeType.STAFF), 1200,100,200);
		System.out.println("PayAmount " + abi.payAmount());
		System.out.println("PayAmount " + rika.payAmount());
		System.out.println("PayAmount " + eri.payAmount());
		System.out.println("PayAmount " + sinta.payAmount());
	}

	public static void main(String[] args) {
		new ReplaceConditionalWithPolymorphism().test();
	}

}

class Employee {
	private EmployeeType type;

	public int getTypeCode() {
		return type.getTypeCode();
	}

	public Employee(EmployeeType type, int salary, int commission, int bonus) {
		this.type = type;
		this.monthlySalary = salary;
		this.commission = commission;
		this.bonus = bonus;
	}

	public int monthlySalary;
	public int commission;
	public int bonus;

	// TODO:
	// Replace this method with polymorphism

	public int payAmount() {
		return type.payAmount(this);
	}
}

abstract class EmployeeType {
	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	static final int STAFF = 3;

	abstract public int getTypeCode();

	public static EmployeeType newType(int code) {
		switch (code) {
		case ENGINEER:
			return new Engineer();
		case SALESMAN:
			return new Salesman();
		case MANAGER:
			return new Manager();
		case STAFF:
			return new Staff();
		default:
			throw new IllegalArgumentException("Incorrect Employee Code");
		}
	}
	abstract int payAmount(Employee employee);
}

class Engineer extends EmployeeType {
	@Override
	public int getTypeCode() {
		return EmployeeType.ENGINEER;
	}

	@Override
	int payAmount(Employee employee) {
		return employee.monthlySalary;
	}
}

class Salesman extends EmployeeType {
	@Override
	public int getTypeCode() {
		return EmployeeType.SALESMAN;
	}

	@Override
	int payAmount(Employee employee) {
		return employee.monthlySalary + employee.commission;
	}
}

class Manager extends EmployeeType {
	@Override
	public int getTypeCode() {
		return EmployeeType.MANAGER;
	}

	@Override
	int payAmount(Employee employee) {
		return employee.monthlySalary + employee.bonus;
	}
}
class Staff extends EmployeeType {
	@Override
	public int getTypeCode() {
		return EmployeeType.STAFF;
	}

	@Override
	int payAmount(Employee employee) {
		return employee.monthlySalary + employee.bonus + employee.commission;
	}
}