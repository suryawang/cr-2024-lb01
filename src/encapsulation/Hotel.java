package encapsulation;

import java.util.List;

public class Hotel extends HotelStar {
	public String HotelId;
	private String HotelName;
	private String Address;
	private List<String> RoomType;

	public Hotel() {
	}

	public void setHotelName(String HotelName) {
		this.HotelName = HotelName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public List<String> getRoomType() {
		return RoomType;
	}

	public void setRoomType(List<String> roomType) {
		RoomType = roomType;
	}

	public String getHotelName() {
		return HotelName;
	}

}
