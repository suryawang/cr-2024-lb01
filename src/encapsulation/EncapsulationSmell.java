package encapsulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EncapsulationSmell {

	public static void main(String[] args) {
		Hotel hotelSantika = new Hotel();
		hotelSantika.setHotelName("Hotel Santika Jakarta Barat");
		hotelSantika.setStar(5);

		Customer yangPesan = new Customer();
		yangPesan.setCustomerName("Andi Budi");
		yangPesan.setContactNo("6281222333444");
		yangPesan.setAddress("Kebon Jeruk");

		BookingHotel transaksiPemesanan = new BookingHotel();
		transaksiPemesanan.setReservedBy(yangPesan);
		transaksiPemesanan.setBookedHotel(hotelSantika);
		transaksiPemesanan.BookingId = "HTLBKG2016052100001";
		transaksiPemesanan.setRatePerNight(550000);
		transaksiPemesanan.setBookedDate(new Date("2016-05-21"));
		transaksiPemesanan.setBookedDate("12-05-2016");

		transaksiPemesanan.ReservedBy.CustomerName = "Budiono";
		hotelSantika.setDescription("Description of " + hotelSantika.getHotelName() + " : Test");
		System.out.println(hotelSantika.getDescription());
		hotelSantika.HotelId = "HOTEL000001";
		System.out.println(hotelSantika.HotelId);
		System.out.println(transaksiPemesanan.getBookingId());
		System.out.println(transaksiPemesanan.getBookedDate());
	}
}
