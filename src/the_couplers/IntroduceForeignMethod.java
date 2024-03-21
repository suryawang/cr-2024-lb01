package the_couplers;

import java.sql.Date;

public class IntroduceForeignMethod {
	class Account {
		Date previousDate;
		double schedulePayment() {
			Date paymentDate = new Date(previousDate.getYear(), previousDate.getMonth(), previousDate.getDate() + 7);

			return 0;
		}
	}
}
