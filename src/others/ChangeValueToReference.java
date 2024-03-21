package others;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public class ChangeValueToReference {
	class Customer {
		private final String name;

		public Customer(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}
	class CustomerRepository {
		  private static Dictionary<String, Customer> instances = new Hashtable<String, Customer>();
		  public static void addCustomer(Customer customer) {
			  instances.put(customer.getName(),customer);
		  }
		  public static Customer getByName(String name) {
			  return instances.get(name);
		  }
	}

	class Order {
		// …
		private Customer customer;

		public String getCustomerName() {
			return customer.getName();
		}

		public void setCustomer(String customerName) {
			customer = CustomerRepository.getByName(customerName);
		}

		public void setCustomerByValue(String customerName) {
			customer = new Customer(customerName);
		}
		
		public Order(String customerName) {
			setCustomer(customerName);
		}
		public Customer getCustomer() {
			return customer;
		}
	}

	// Some client code, which uses Order class.
	private static int numberOfOrdersFor(Collection orders, String customer) {
		int result = 0;
		Iterator iter = orders.iterator();
		while (iter.hasNext()) {
			Order each = (Order) iter.next();
			if (each.getCustomerName().equals(customer)) {
				result++;
			}
		}
		return result;
	}
	void test() {
		CustomerRepository.addCustomer(new Customer("Andy"));
		CustomerRepository.addCustomer(new Customer("Sinta"));
		CustomerRepository.addCustomer(new Customer("Riska"));
		var orders = new Vector<Order>();
		var o1 = new Order("Andy");
		var o2 = new Order("Andy");
		o2.setCustomerByValue("Andy");
		var o3 = new Order("Sinta");
		var o4 = new Order("Sinta");
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		orders.add(o4);
		for(Order o: orders)
			System.out.println(o.getCustomer() + ", Name: " + o.getCustomerName());
	}
	public static void main(String a[]) {
		new ChangeValueToReference().test();
	}
}
