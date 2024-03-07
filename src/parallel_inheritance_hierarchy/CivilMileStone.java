package parallel_inheritance_hierarchy;

public class CivilMileStone implements MileStone {
	@Override
	public String work() {
		// TODO Auto-generated method stub
		return "Create  Twin Towers";
	}

	@Override
	public String target() {
		// TODO Auto-generated method stub
		return "Has to be completed in 2 years";
	}

	@Override
	public String toString() {
		return "CivilMileStone [work()=" + work() + ", target()=" + target() + "]";
	}
}
