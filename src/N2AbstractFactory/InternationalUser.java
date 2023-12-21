package N2AbstractFactory;

public class InternationalUser {
	
	private String userName;
	private String userSurname;
	String internationalAddress;
	String internationalPhone;
	
	public InternationalUser(String userName, String userSurname, String internationalAddress, String internationalPhone) {
		this.userName = userName;
		this.userSurname = userSurname;
		this.internationalAddress = internationalAddress;
		this.internationalPhone = internationalPhone;
		
	}
	
	public String getUserName() {
		return userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public String getInternationalAddress() {
		return internationalAddress;
	}
	public String getInternationalPhone() {
		return internationalPhone;
	}
	
	@Override
	public String toString() {
		return "NAME: " + userName + "\r\n" + "Surname: " + userSurname + "\r\n" + "Address: " + internationalAddress + "\r\n"
				+ "Phone: " + internationalPhone;
	}

}
