package N3Command;

import java.util.ArrayList;
import java.util.List;

import N3Command.Command.InterfaceCommand;

public class Invoker {
	
	private List<InterfaceCommand> commandsList = new ArrayList<>();

	public void receiveCommand (InterfaceCommand command) {
		this.commandsList.add(command);
	}
	
	public void realizeCommands() {
		this.commandsList.forEach(l -> l.execute());
		this.commandsList.clear();
	}
}
