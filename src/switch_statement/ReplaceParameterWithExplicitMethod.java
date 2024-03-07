package switch_statement;

public class ReplaceParameterWithExplicitMethod {
	class Order {
		public static final int FIXED_DISCOUNT = 0;
		public static final int PERCENT_DISCOUNT = 1;
		private int price;
		private int size;

		public Order(int price, int size) {
			this.price = price;
			this.size = size;
		}

		public int getPrice() {
			return price;
		}

		public int getSize() {
			return size;
		}

		// TODO:
		// change apply discount in this Fixed discount and Percent discount
		// with each own method

		public void applyDiscount(int type, double discount) {
			switch (type) {
			case FIXED_DISCOUNT:
				price -= discount;
				break;
			case PERCENT_DISCOUNT:
				price *= discount;
				break;
			default:
				throw new IllegalArgumentException("Invalid discount type");
			}
		}
	}

	public void test() {
		Order order = new Order(20, 4);
		boolean weekend = false;
		if (weekend) {
			order.applyDiscount(Order.FIXED_DISCOUNT, 10);
		}
		if (order.getSize() > 5) {
			order.applyDiscount(Order.PERCENT_DISCOUNT, 0.2);
		}
		System.out.println("price = " + order.getPrice());

		Order order1 = new Order(20, 7);
		boolean weekend1 = true;
		if (weekend1) {
			order1.applyDiscount(Order.FIXED_DISCOUNT, 10);
		}
		if (order1.getSize() > 5) {
			order1.applyDiscount(Order.PERCENT_DISCOUNT, 0.2);
		}
		System.out.println("price = " + order1.getPrice());

		Order order2 = new Order(20, 7);
		boolean weekend2 = false;
		if (weekend2) {
			order2.applyDiscount(Order.FIXED_DISCOUNT, 10);
		}
		if (order2.getSize() > 5) {
			order2.applyDiscount(Order.PERCENT_DISCOUNT, 0.2);
		}
		System.out.println("price = " + order2.getPrice());

	}

	public static void main(String[] args) {
		new ReplaceParameterWithExplicitMethod().test();
	}

}