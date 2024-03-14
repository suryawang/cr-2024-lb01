package the_dispensable;

public class ExtractVariable {
	private int quantity;
	private int itemPrice;

	double price() {
		final int basePrice = quantity * itemPrice;
		final double discount = Math.max(0, quantity - 500) * itemPrice * 0.05;
		final double shippingCost = Math.min(quantity * itemPrice * 0.1, 100.0);
		return basePrice - discount + shippingCost;
	}

	void test() {
		quantity = 10;
		itemPrice = 100;
		System.out.println(price());
	}

	public static void main(String[] a) {
		new ExtractVariable().test();
	}
}
