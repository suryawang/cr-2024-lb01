package switch_statement;

public class IntroduceNullObject {
	class Company {
		// …
		private Customer customer;

		public Customer getCustomer() {
			return customer;
		}
	}

	class Customer {
		private String name;
		private BillingPlan plan;
		private PaymentHistory history;

		public String getName() {
			return name;
		}

		public BillingPlan getPlan() {
			return plan;
		}

		public PaymentHistory getHistory() {
			return history;
		}
	}

	class PaymentHistory {

		public int getWeeksDelinquentInLastYear() {
			return 100;
		}
	}

	public static class BillingPlan {
		private int plan;

		public int getPlan() {
			return plan;
		}
		public static BillingPlan basic() {
			var b = new BillingPlan();
			b.plan = 10;
			return b;
		}
	}

	void test() {
		Company site = new Company();
		Customer customer = site.getCustomer();
		String customerName;
		if (customer == null) {
			customerName = "N/A";
		} else {
			customerName = customer.getName();
		}

		// …
		BillingPlan plan;
		if (customer == null) {
			plan = BillingPlan.basic();
		} else {
			plan = customer.getPlan();
		}

		// …
		int weeksDelinquent;
		if (customer == null) {
			weeksDelinquent = 0;
		} else {
			weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
		}
		System.out.println("done");
	}

	public static void main(String[] a) {
		new IntroduceNullObject().test();
	}
}
