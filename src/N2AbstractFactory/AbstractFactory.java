package N2AbstractFactory;

public interface AbstractFactory {
	
	InterfaceAddress createAddress(String country);
	InterfacePhone createPhone(String country);

}
