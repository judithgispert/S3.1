package N1Singleton;

import java.util.ArrayList;
import java.util.Collections;

public class Undo {
	
	private static Undo instance;
	public ArrayList<String> commandList;
	
	private Undo() {
		this.commandList = new ArrayList<String>();
	}
	
	public static Undo getInstance() {
		if (instance == null) {
			instance = new Undo();
		}
		return instance;
	}
	
	public void addCommand(String command) {
		commandList.add(command);
		System.out.println("Command added.");
	}
	
	public void removeCommand() {
		commandList.remove(commandList.size()-1);
		System.out.println("Command removed.");
	}
	
	public void historyCommand(int x) {
		if(commandList.isEmpty()) {
			System.out.println("No commands added, empty history.");
		} else {
			Collections.reverse(commandList);
			commandList.stream().limit(x).forEach(System.out::println);
		}
		
	}

}
