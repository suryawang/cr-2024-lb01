package refused_bequest;

public class ReplaceInheritanceWithDelegation {
	class Engine {
		// …
		private double fuel;
		private double CV;

		public double getFuel() {
			return fuel;
		}

		public void setFuel(double fuel) {
			this.fuel = fuel;
		}

		public double getCV() {
			return CV;
		}

		public void setCV(double cv) {
			this.CV = cv;
		}

		public String toString() {
			return String.format("CV %f, fuel %f", CV, fuel);
		}
	}

	class Car extends Engine {
		// ...
		private String brand;
		private String model;

		public String getName() {
			return brand + " " + model + " (" + getCV() + "CV)";
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public String toString() {
			return String.format("Car %s type %s: Engine: %s", brand, model, super.toString());
		}
	}

	void test() {
		Car audi = new Car();
		audi.setModel("A001");
		audi.setBrand("Audi");
		audi.setCV(100);
		audi.setFuel(70);
		System.out.println(audi);
	}

	public static void main(String[] a) {
		new ReplaceInheritanceWithDelegation().test();
	}
}
