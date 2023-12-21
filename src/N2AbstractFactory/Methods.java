package N2AbstractFactory;

import java.util.List;

public class Methods {
	
	public static void createNationalContact (List<Object>addressBookList) {
		String nationalAddress = createNationalAddress();
		String nationalPhone = createNationalPhone();	
		addressBookList.add(new NationalUser(Input.getString("Contact name:"), Input.getString("Contact surname:"), nationalAddress, nationalPhone));
	}
	
	public static String createNationalAddress() {
		AbstractFactory FactoryAddress = FactoryProducer.getTypeFactory("Address");
		InterfaceAddress nationalInterfaceAddress = FactoryAddress.createAddress("Spain");
		String nationalAddress = nationalInterfaceAddress.createAddress();
		return nationalAddress;
	}
	
	public static String createNationalPhone() {
		AbstractFactory FactoryPhone = FactoryProducer.getTypeFactory("Phone");
		InterfacePhone nationalInterfacePhone = FactoryPhone.createPhone("Spain");
		String nationalPhone = nationalInterfacePhone.createPhone();
		return nationalPhone;
	}
	
	public static void createInternationalContact(List<Object>addressBookList) {
		System.out.println("Write the name of user's country:");
		String country = Input.getString("Germany - France - Italy - UnitedKingdom - Russia - Ukraine - Poland - Romania - Netherlands - Belgium - Greece"
				+ " - Portugal - Sweden - Norway");
		String internationalAddress = createInternationalAddress(country);
		String internationalPhone = createInternationalPhone(country);
		addressBookList.add(new InternationalUser(Input.getString("Contact name:"), Input.getString("Contact surname:"), internationalAddress, internationalPhone));
	}
	
	public static String createInternationalAddress(String country) {
		AbstractFactory FactoryAddress = FactoryProducer.getTypeFactory("Address");
		InterfaceAddress internationalInterfaceAddress = FactoryAddress.createAddress(country);
		String internationalAddress = internationalInterfaceAddress.createAddress();
		return internationalAddress;
	}
	
	public static String createInternationalPhone(String country) {
		AbstractFactory FactoryPhone = FactoryProducer.getTypeFactory("Phone");
		InterfacePhone internationalInterfacePhone = FactoryPhone.createPhone(country);
		String internationalPhone = internationalInterfacePhone.createPhone();
		return internationalPhone;
	}
	
	public static void showAddressBookList(List<Object>addressBookList) {
		if (addressBookList.isEmpty()) {
			System.out.println("The address book doesn't have contacts.");
		}else {
			addressBookList.forEach(System.out::println);
		}
	}
}
