package N2AbstractFactory;

public class NationalPhone implements InterfacePhone{

	private static final int prefix = 34;
	private int phoneNumber;
	
	
	@Override
	public String createPhone() {
		phoneNumber = Input.getInt("Phone number:");
		
		return "+" + prefix + " " + phoneNumber;
	}

	

}
