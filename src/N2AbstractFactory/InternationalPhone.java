package N2AbstractFactory;

public class InternationalPhone implements InterfacePhone{
	
	private int phoneNumber;
	
	@Override
	public String createPhone() {
		phoneNumber = Input.getInt("Phone number:");
		int prefix = 0;
		try {
			prefix = Menu.searchPrefix();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "+" + prefix + " " + phoneNumber;
	}

}
