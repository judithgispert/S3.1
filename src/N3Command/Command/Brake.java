package N3Command.Command;

import N3Command.Parking.VehicleAbstract;

public class Brake implements InterfaceCommand{

	private VehicleAbstract vehicle;
	private int speedBrake;
	
	public Brake(VehicleAbstract vehicle, int speedBrake) {
		this.vehicle = vehicle;
		this.speedBrake = speedBrake;
	}
	
	@Override
	public void execute() {
		vehicle.brake(speedBrake);
	}

}
