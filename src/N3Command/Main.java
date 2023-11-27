package N3Command;

import N3Command.Parking.Airplane;
import N3Command.Parking.Bike;
import N3Command.Parking.Boat;
import N3Command.Parking.Car;

public class Main {
	
	public static void main (String[]args) {
		
		Methods methodsCommand = new Methods();
		Invoker invoker = new Invoker();
		
		Car car = new Car(10);
		methodsCommand.methodsCar(car, invoker);
		
		Bike bike = new Bike (5);
		methodsCommand.methodsBike(bike, invoker);
		
		Airplane airplane = new Airplane(300);
		methodsCommand.methodsAirplane(airplane, invoker);
		
		Boat boat = new Boat(150);
		methodsCommand.methodsBoat(boat, invoker);
	}
}
