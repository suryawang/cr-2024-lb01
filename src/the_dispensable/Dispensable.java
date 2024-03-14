package the_dispensable;

import java.util.Vector;
import java.util.Random;

public class Dispensable {
	public static void main(String[] a) {
		Master m = new Master();
		String[] names = { "Pencil HB", "Ballpoint Pen Red", "Ballpoint Pen Blue", "Ballpoint Pen Green" };
		Random rnd = new Random(0);
		Vector<SaleItem> items = new Vector<>();
		for (String n : names) {
			items.add(new SaleItem(n, rnd.nextInt(50), m.getPrice(n)));
		}
		for (SaleItem s : items) {
			System.out.println(s.markdownView());
			System.out.println(s.htmlView());
		}
	}
}

// refactor the following class methods with substitute algorithm
class Master {
	public int getPrice(String name) {
		if (contain(name)) {
			if (name.equals("Pencil HB"))
				return 120;
			if (name.equals("Ballpoint Pen Red"))
				return 150;
			if (name.equals("Ballpoint Pen Blue"))
				return 145;
			if (name.equals("Ballpoint Pen Green"))
				return 155;
		}
		return -1;
	}

	public boolean contain(String name) {
		if (name.equals("Pencil HB"))
			return true;
		if (name.equals("Ballpoint Pen Red"))
			return true;
		if (name.equals("Ballpoint Pen Blue"))
			return true;
		if (name.equals("Ballpoint Pen Green"))
			return true;
		return false;
	}
}

class SaleItem {
	private int quantity;
	private int itemPrice;
	private String name;

	public SaleItem(String name, int quantity, int itemPrice) {
		this.name = name;
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}

	public String getName() {
		return this.name;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public int getItemPrice() {
		return this.itemPrice;
	}

	// refactor this method using inline method
	private int FirstFiveHundredNoDiscount() {
		return this.quantity - 500;
	}

	// refactor this method using extract variable
	public double price() {
		// Price consists of: base price - discount + shipping cost
		return quantity * itemPrice - Math.max(0, FirstFiveHundredNoDiscount()) * itemPrice * 0.05
				+ Math.min(quantity * itemPrice * 0.1, 100.0);
	}

	// refactor the following two method using form template method
	public String markdownView() {
		String out = "#" + this.getName() + "\r\n";
		out += "> Quantity = " + this.getQuantity() + "\r\n";
		out += "> Price = " + this.getItemPrice() + "\r\n";
		out += "= " + this.price() + "\r\n";
		return out;
	}

	public String htmlView() {
		String out = "<dl><dt>" + this.getName() + "</dt>";
		out += "<dd> Quantity = " + this.getQuantity() + "</dd>";
		out += "<dd> Price = " + this.getItemPrice() + "</dd>";
		out += "<dd> Total =" + this.price() + "</dd></dl>";
		return out;
	}
}
