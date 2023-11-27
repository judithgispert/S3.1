package N3Command.Command;

import N3Command.Parking.VehicleAbstract;

public class Start implements InterfaceCommand{

	private VehicleAbstract vehicle;
	
	public Start (VehicleAbstract vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public void execute() {
		vehicle.start();
	}

}
