package N3Command.Parking;

public class Airplane extends VehicleAbstract{

	public Airplane(int speed) {
		super(speed);
	}

	@Override
	public void start() {
		System.out.println("Airplane started.");
	}

	@Override
	public void accelerate(int speedAccelerate) {
		super.setSpeed(super.getSpeed() + speedAccelerate);
		System.out.println("The airplane is accelerating " + speedAccelerate + "Km/h. The speed now is " + super.getSpeed() + "Km/h.");
	}

	@Override
	public void brake(int speedBrake) {
		super.setSpeed(super.getSpeed() - speedBrake);
		if (super.getSpeed() == 0) {
			System.out.println("The airplane is braking " + speedBrake + "Km/h. The airplane is stopped.");
		} else {
			System.out.println("The airplane is braking " + speedBrake + "Km/h. The speed now is " + super.getSpeed() + "Km/h.");
		}
	}

}
