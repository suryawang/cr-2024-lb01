package encapsulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookingHotel {
	private Hotel BookedHotel;
	public Customer ReservedBy;
	private Date BookedDate;
	private int RatePerNight;
	public String BookingId;

	public BookingHotel() {
	}

	public String getBookingId() {
		return BookingId;
	}

	public Hotel getBookedHotel() {
		return BookedHotel;
	}

	public void setBookedHotel(Hotel bookedHotel) {
		BookedHotel = bookedHotel;
	}

	public Customer getReservedBy() {
		return ReservedBy;
	}

	public void setReservedBy(Customer reservedBy) {
		ReservedBy = reservedBy;
	}

	public Date getBookedDate() {
		return BookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		BookedDate = bookedDate;
	}

	public void setBookedDate(String bookedDate) {
		try {
			DateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy");
			this.BookedDate = formatTanggal.parse(bookedDate);
		} catch (Exception e) {
			System.out.println("Error While Parsing Date [BookingHotel:setBookedDate] : " + e);
		}
	}

	public int getRatePerNight() {
		return RatePerNight;
	}

	public void setRatePerNight(int ratePerNight) {
		RatePerNight = ratePerNight;
	}

}
