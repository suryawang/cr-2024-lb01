package parallel_inheritance_hierarchy;

public class ComputerMileStone implements MileStone {
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
		return "ComputerMileStone [work()=" + work() + ", target()=" + target() + "]";
	}
}