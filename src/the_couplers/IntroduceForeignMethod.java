package the_couplers;

import java.sql.Date;

public class IntroduceForeignMethod {
	class Account {
		Date previousDate;

		double schedulePayment() {
			Date paymentDate = nextWeek(previousDate);

			return 0;
		}

		/**
		 * Foreign method. Should be in the Date class.
		 */
		public static Date nextWeek(Date arg) {
			return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 7);
		}
	}
}
