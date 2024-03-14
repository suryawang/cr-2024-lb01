package the_dispensable;

public class ExtractVariable {
	private int quantity;
	private int itemPrice;

	double price() {
		// Price consists of: base price - discount + shipping cost
		return quantity * itemPrice - Math.max(0, quantity - 500) * itemPrice * 0.05
				+ Math.min(quantity * itemPrice * 0.1, 100.0);
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
