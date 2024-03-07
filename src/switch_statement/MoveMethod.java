package switch_statement;

public class MoveMethod {
	// TODO:
	// move overdraftCharge to AccountType class

	class Account {
		private AccountType type;
		private int daysOverdrawn;

		public Account() {
			type = new AccountType();
		}

		public void setOverdrawn(int value) {
			this.daysOverdrawn = value;
		}

		public void updateToPremium() {
			type.setPremium(true);
		}

		public double overdraftCharge() {
			if (type.isPremium()) {
				double result = 10;
				if (daysOverdrawn > 7) {
					result += (daysOverdrawn - 7) * 0.85;
				}
				return result;
			} else {
				return daysOverdrawn * 1.75;
			}
		}

		public double bankCharge() {
			double result = 4.5;
			if (daysOverdrawn > 0) {
				result += overdraftCharge();
			}
			return result;
		}
	}

	class AccountType {
		public boolean premium;

		public AccountType() {
			this.premium = false;
		}

		public boolean isPremium() {
			return premium;
		}

		public void setPremium(boolean premium) {
			this.premium = premium;
		}
	}

	public void test() {
		Account acc = new Account();
		System.out.println("Bank Charge 1 = " + acc.bankCharge());
		acc.setOverdrawn(10);
		System.out.println("Bank Charge 2 = " + acc.bankCharge());
		acc.updateToPremium();
		System.out.println("Bank Charge 3 = " + acc.bankCharge());
	}

	public static void main(String[] args) {
		new MoveMethod().test();
	}
}
