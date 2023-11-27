package N3Command;

import N3Command.Command.Accelerate;
import N3Command.Command.Brake;
import N3Command.Command.Start;
import N3Command.Parking.Airplane;
import N3Command.Parking.Bike;
import N3Command.Parking.Boat;
import N3Command.Parking.Car;

public class Methods {
	
	public void methodsCar(Car car, Invoker invoker) {
		Start startCar = new Start(car);
		Accelerate accelerateCar = new Accelerate(car, 55);
		Brake brakeCar = new Brake(car, 45);
		Brake brakeCarStop = new Brake(car, 20);
		
		invoker.receiveCommand(startCar);
		invoker.receiveCommand(accelerateCar);
		invoker.receiveCommand(brakeCar);
		invoker.receiveCommand(brakeCarStop);
		invoker.realizeCommands();
	}
	
	public void methodsBike(Bike bike, Invoker invoker) {
		Start startBike = new Start(bike);
		Accelerate accelerateBike = new Accelerate(bike, 20);
		Brake brakeBike = new Brake(bike, 15);
		Brake brakeBikeStop = new Brake(bike, 10);
		
		invoker.receiveCommand(startBike);
		invoker.receiveCommand(accelerateBike);
		invoker.receiveCommand(brakeBike);
		invoker.receiveCommand(brakeBikeStop);
		invoker.realizeCommands();
	}
	
	public void methodsAirplane(Airplane airplane, Invoker invoker) {
		Start startAirplane = new Start(airplane);
		Accelerate accelerateAirplane = new Accelerate(airplane, 300);
		Brake brakeAirplane = new Brake(airplane, 400);
		Brake brakeAirplaneStop = new Brake(airplane, 200);
		
		invoker.receiveCommand(startAirplane);
		invoker.receiveCommand(accelerateAirplane);
		invoker.receiveCommand(brakeAirplane);
		invoker.receiveCommand(brakeAirplaneStop);
		invoker.realizeCommands();
	}
	
	public void methodsBoat(Boat boat, Invoker invoker) {
		Start startBoat = new Start(boat);
		Accelerate accelerateBoat = new Accelerate(boat, 100);
		Brake brakeBoat = new Brake(boat, 200);
		Brake brakeBoatStop = new Brake(boat, 50);
		
		invoker.receiveCommand(startBoat);
		invoker.receiveCommand(accelerateBoat);
		invoker.receiveCommand(brakeBoat);
		invoker.receiveCommand(brakeBoatStop);
		invoker.realizeCommands();
	}

}
