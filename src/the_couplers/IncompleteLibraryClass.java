package the_couplers;

import java.sql.Date;

public class IncompleteLibraryClass {
	class Account {
		Date previousDate;

		double schedulePayment() {
			Date paymentDate = new LocalDate(previousDate).nextWeek();

			return 0;
		}
	}
	class LocalDate extends Date{
		public LocalDate(Date date) {
			super(date.getTime());
		}
	
		public Date nextWeek() {
			return new Date(this.getYear(), this.getMonth(), this.getDate() + 7);
		}
	}
}
