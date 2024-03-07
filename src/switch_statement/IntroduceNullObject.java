package switch_statement;

public class IntroduceNullObject {
	class Company {
		// …
		private Customer customer;

		public Customer getCustomer() {
			return customer == null ? new NullCustomer() : customer;
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

	class NullCustomer extends Customer {
		public String getName() {
			return "N/A";
		}

		public BillingPlan getPlan() {
			return BillingPlan.basic();
		}

		public PaymentHistory getHistory() {
			return new NullPaymentHistory();
		}
	}

	class PaymentHistory {
		public int getWeeksDelinquentInLastYear() {
			return 100;
		}
	}

	class NullPaymentHistory extends PaymentHistory {
		public int getWeeksDelinquentInLastYear() {
			return 0;
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
		String customerName = customer.getName();

		// …
		BillingPlan plan = customer.getPlan();

		// …
		int weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
		System.out.println(weeksDelinquent);
	}

	public static void main(String[] a) {
		new IntroduceNullObject().test();
	}
}
