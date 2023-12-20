package N2AbstractFactory;

public class FactoryProducer {

	public static AbstractFactory getTypeFactory(String typeFactory) {
		if (typeFactory.equalsIgnoreCase("Address")) {
			return new FactoryAddress();
		} else if (typeFactory.equalsIgnoreCase("Phone")) {
			return new FactoryPhone();
		}
		return null;
	}
}
