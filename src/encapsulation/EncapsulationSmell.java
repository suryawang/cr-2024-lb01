package encapsulation;

public class EncapsulationSmell {

	public static void main(String[] args) {
		Hotel hotelSantika = new Hotel();
		hotelSantika.setHotelName("Hotel Santika Jakarta Barat");
		hotelSantika.setStar(5);

		Customer yangPesan = new Customer();
		yangPesan.setCustomerName("Andi Budi");
		yangPesan.setContactNo("6281222333444");
		yangPesan.setAddress("Kebon Jeruk");

		BookingHotel transaksiPemesanan = new BookingHotel("21-05-2016");
		transaksiPemesanan.setReservedBy(yangPesan);
		transaksiPemesanan.setBookedHotel(hotelSantika);
		transaksiPemesanan.setRatePerNight(550000);
		var b = new Customer();
		b.setCustomerName("Budiono");
		transaksiPemesanan.setReservedBy(b);
		hotelSantika.setDescription("Description of " + hotelSantika.getHotelName() + " : Test");
		
		System.out.println(hotelSantika.getDescription());
		System.out.println(hotelSantika.getId());
		System.out.println(transaksiPemesanan.getBookingId());
		System.out.println(transaksiPemesanan.getBookedDate());
		
		var hotelHub = new Hotel();
		hotelHub.setHotelName("Hub Hotel");
		System.out.println(hotelHub.getId());
		var b1 = new BookingHotel("22-05-2016");
		System.out.println(b1.getBookingId());
	}
}
