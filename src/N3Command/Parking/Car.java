package N3Command.Parking;

public class Car extends VehicleAbstract{

	public Car(int speed) {
		super(speed);
	}

	@Override
	public void start() {
		System.out.println("Car started.");
	}

	@Override
	public void accelerate(int speedAccelerate) {
		super.setSpeed(super.getSpeed() + speedAccelerate);
		System.out.println("The car is accelerating " + speedAccelerate + "Km/h. The speed now is " + super.getSpeed() + "Km/h.");
	}

	@Override
	public void brake(int speedBrake) {
		super.setSpeed(super.getSpeed() - speedBrake);
		if (super.getSpeed() == 0) {
			System.out.println("The car is braking " + speedBrake + "Km/h. The car is stopped.");
		} else {
			System.out.println("The car is braking " + speedBrake + "Km/h. The speed now is " + super.getSpeed() + "Km/h.");
		}
	}

}
