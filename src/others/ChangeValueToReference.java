package others;

import java.util.Collection;
import java.util.Iterator;

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

	class Order {
		// …
		private Customer customer;

		public String getCustomerName() {
			return customer.getName();
		}

		public void setCustomer(String customerName) {
			customer = new Customer(customerName);
		}

		public Order(String customerName) {
			customer = new Customer(customerName);
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
}
