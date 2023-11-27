package N3Command.Parking;

public class Bike extends VehicleAbstract{

	public Bike(int speed) {
		super(speed);
	}

	@Override
	public void start() {
		System.out.println("Bike started.");
	}

	@Override
	public void accelerate(int speedAccelerate) {
		super.setSpeed(super.getSpeed() + speedAccelerate);
		System.out.println("The bike is accelerating " + speedAccelerate + "Km/h. The speed now is " + super.getSpeed() + "Km/h.");
	}

	@Override
	public void brake(int speedBrake) {
		super.setSpeed(super.getSpeed() - speedBrake);
		if (super.getSpeed() == 0) {
			System.out.println("The bike is braking " + speedBrake + "Km/h. The bike is stopped.");
		} else {
			System.out.println("The bike is braking " + speedBrake + "Km/h. The speed now is " + super.getSpeed() + "Km/h.");
		}
	}
}
