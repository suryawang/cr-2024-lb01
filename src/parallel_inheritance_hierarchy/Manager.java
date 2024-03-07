package parallel_inheritance_hierarchy;

public class Manager {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		Engineer comp = new ComputerEngineer();
		comp.setType("Computer Engineer");
		comp.setSalary(50000);
		comp.setMileStone(new ComputerMileStone());
		Engineer civil = new CivilEngineer();
		civil.setType("Civil Engineer");
		civil.setSalary(60000);
		civil.setMileStone(new CivilMileStone());
		System.out.println(comp);
		System.out.println("********************");
		System.out.println(civil);

		// Solution 2:
		Engineer comp2 = EngineerFactory.getEngineer(PartialComputerEngineer.class);
		comp2.setType("Computer Engineer");
		comp2.setSalary(50000);

		Engineer civil2 = EngineerFactory.getEngineer(PartialCivilEngineer.class);
		civil2.setType("Civil Engineer");
		civil2.setSalary(60000);

		System.out.println(comp2);
		System.out.println("********************");
		System.out.println(civil2);

		// Solution 3:
		EngineerMileStone comp3 = new RefactorComputerEngineer();
		comp3.setType("Computer Engineer");
		comp3.setSalary(50000);

		EngineerMileStone civil3 = new RefactorCivilEngineer();
		civil3.setType("Civil Engineer");
		civil3.setSalary(60000);

		System.out.println(comp3);
		System.out.println("********************");
		System.out.println(civil3);
	}
}