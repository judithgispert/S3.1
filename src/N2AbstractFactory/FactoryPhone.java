package N2AbstractFactory;


public class FactoryPhone implements AbstractFactory{

	@Override
	public InterfaceAddress createAddress(String country) {
		return null;
	}

	@Override
	public InterfacePhone createPhone(String country) {
		if (country.equalsIgnoreCase("Spain")) {
			return new NationalPhone();
		} else {
			return new InternationalPhone();
		}
		
	}
}
