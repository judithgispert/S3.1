package N2AbstractFactory;

public class FactoryAddress implements AbstractFactory{

	@Override
	public InterfaceAddress createAddress(String country) {
		if (country.equalsIgnoreCase("Spain")) {
			return new NationalAddress();
		} else {
			return new InternationalAddress();
		}
	}

	@Override
	public InterfacePhone createPhone(String country) {
		return null;
	}

}
