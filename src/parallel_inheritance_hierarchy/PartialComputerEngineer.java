package parallel_inheritance_hierarchy;

public class PartialComputerEngineer implements Engineer, MileStone {

	private String type;
	private int salary;

	@Override
	public String work() {
		return "Build a Billing MicroService";
	}

	@Override
	public String target() {
		return "Has to be finshed in 14 PD";
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public MileStone getMileStone() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void setMileStone(MileStone mileStone) {
		throw new UnsupportedOperationException("Not Supported");
	}

	@Override
	public String toString() {
		return "PartialComputerEngineer [type=" + type + ", salary=" + salary + ", work()=" + work() + ", target()="
				+ target() + ", getType()=" + getType() + ", getSalary()=" + getSalary() + "]";
	}
}