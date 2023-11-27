package N3Command.Command;

import N3Command.Parking.VehicleAbstract;

public class Accelerate implements InterfaceCommand{

	private VehicleAbstract vehicle;
	private int speedAccelerate;
	
	public Accelerate (VehicleAbstract vehicle, int speedAccelerate) {
		this.vehicle = vehicle;
		this.speedAccelerate = speedAccelerate;
	}
	
	@Override
	public void execute() {
		vehicle.accelerate(speedAccelerate);
	}
}
