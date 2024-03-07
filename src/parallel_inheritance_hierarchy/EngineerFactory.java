package parallel_inheritance_hierarchy;

public class EngineerFactory {

	public static Engineer getEngineer(Class clazz) throws InstantiationException, IllegalAccessException {
		return (Engineer) clazz.newInstance();
	}
}