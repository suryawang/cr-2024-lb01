package parallel_inheritance_hierarchy;

public class CivilEngineer implements Engineer {
	private String type;
	private int salary;
	private MileStone mileStone;

	public void setType(String type) {
		this.type = type;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setMileStone(MileStone mileStone) {
		this.mileStone = mileStone;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public MileStone getMileStone() {
		// TODO Auto-generated method stub
		return mileStone;
	}

	@Override
	public String toString() {
		return "CivilEngineer [type=" + type + ", salary=" + salary + ", mileStone=" + mileStone + "]";
	}
}
