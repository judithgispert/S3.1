package N3Command.Parking;

public abstract class VehicleAbstract {

	protected int speed;
	
	public VehicleAbstract(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public abstract void start();
	public abstract void accelerate(int speedAccelerate);
	public abstract void brake(int speedBrake);
	
}
