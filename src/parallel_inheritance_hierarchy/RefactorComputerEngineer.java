package parallel_inheritance_hierarchy;

public class RefactorComputerEngineer implements EngineerMileStone {

	private String type;
	private int salary;

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int getSalary() {
		return salary;
	}

	@Override
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String work() {
		return "Build a Billing MicroService";
	}

	@Override
	public String target() {
		return "Has to be finshed in 14 PD";
	}

	@Override
	public String toString() {
		return "RefactorComputerEngineer [type=" + type + ", salary=" + salary + ", getType()=" + getType()
				+ ", getSalary()=" + getSalary() + ", work()=" + work() + ", target()=" + target() + "]";
	}
}