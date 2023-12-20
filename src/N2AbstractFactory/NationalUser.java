package N2AbstractFactory;


public class NationalUser {
	
	private String userName;
	private String userSurname;
	String nationalAddress;
	String nationalPhone;
	
	public NationalUser(String userName, String userSurname, String nationalAddress, String nationalPhone) {
		this.userName = userName;
		this.userSurname = userSurname;
		this.nationalAddress = nationalAddress;
		this.nationalPhone = nationalPhone;
		
	}
	
	public String getUserName() {
		return userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public String getNationalAddress() {
		return nationalAddress;
	}
	public String getNationalPhone() {
		return nationalPhone;
	}
	
	@Override
	public String toString() {
		return "NAME: " + userName + "\r\n" + "Surname: " + userSurname + "\r\n" + "Address: " + nationalAddress + "\r\n"
				+ "Phone: " + nationalPhone;
	}
}
