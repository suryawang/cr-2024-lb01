package alternative_class_with_different_interface;

public class ParameterizedMethod {

	class Bullet {
		private int type;
		private double speed;

		public static final int NORMAL = 0;
		public static final int SUPER = 1;
		public static final int HYPER = 2;

		public Bullet() {
			this.type = NORMAL;
			this.speed = 1;
		}

		public void updateBullet() {
			if (this.type == NORMAL) {
				this.type = SUPER;
				setSpeed(1.2);
			} else if (this.type == SUPER) {
				this.type = HYPER;
				setSpeed(1.5);
			}
		}

		protected void setSpeed(double speed) {
			this.speed = speed;
		}

		public double getSpeed() {
			return speed;
		}

		public int getType() {
			return type;
		}

		public String toString() {
			switch (type) {
			case NORMAL:
				return "Normal bullet";
			case SUPER:
				return "Super bullet";
			case HYPER:
				return "Hyper bullet";
			default:
				return "Unknown Bullet";
			}
		}
	}

	public void test() {
		Bullet a = new Bullet();
		System.out.println(a + " speed => " + a.getSpeed());
		a.updateBullet();
		System.out.println(a + " speed => " + a.getSpeed());
		a.updateBullet();
		System.out.println(a + " speed => " + a.getSpeed());
		a.updateBullet();
		System.out.println(a + " speed => " + a.getSpeed());
	}

	public static void main(String[] args) {
		new ParameterizedMethod().test();
	}

}
