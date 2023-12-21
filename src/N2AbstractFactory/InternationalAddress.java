package N2AbstractFactory;

public class InternationalAddress implements InterfaceAddress{

	private String street;
	private int streetNum;
	private int floor;
	private int floorDoor;
	private int zipCode;
	private String city;
	private String country;
	
	@Override
	public String createAddress () {
		street = Input.getString("Street name, write with _ in spaces:");
		streetNum = Input.getInt("Door street number:");
		floor = Input.getInt("Floor number:");
		floorDoor = Input.getInt("Door floor number:");
		zipCode = Input.getInt("Zip code:");
		city = Input.getString("City name:");
		country = Input.getString("Country:");
		
		
		return "Address: " + street + ", " + streetNum + ", (" + floor + ", " + floorDoor + ") - " + zipCode + " " + city + ", " + country;
	}
}
