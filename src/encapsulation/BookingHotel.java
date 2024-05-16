package encapsulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookingHotel {
	private Hotel BookedHotel;
	private Customer ReservedBy;
	private Date BookedDate;
	private int RatePerNight;
	private String BookingId;
	private static int num;

	public BookingHotel(String bookedDate) {
		num++;
		setBookedDate(bookedDate);
		var f = new SimpleDateFormat("yyyyMMdd").format(BookedDate);
		BookingId = "HTLBKG" + f + String.format("%05d", num);
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

//	public void setBookedDate(Date bookedDate) {
//		BookedDate = bookedDate;
//	}

	private void setBookedDate(String bookedDate) {
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
