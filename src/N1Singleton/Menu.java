package N1Singleton;

import java.util.Scanner;

public class Menu {
	
	public void menuApp() {
		System.out.println("Choose the section you want to access: \r\n" 
							+ "1. Add new command. \r\n" 
							+ "2. Remove last command. \r\n" 
							+ "3. History of n commands.\r\n"
							+ "0. Exit app.");	
	}
	
	public void app() {
		
		Undo undoApp = Undo.getInstance();
		boolean exit = true;
		Scanner input = new Scanner (System.in);
		
		do {
			menuApp();
			int num = input.nextInt();
			input.nextLine();
			
			switch(num) {
			
				case 1:
					System.out.println("Write the command to add:");
					String command = input.nextLine();
					undoApp.addCommand(command);
					break;
				case 2:
					undoApp.removeCommand();
					break;
				case 3:
					System.out.println("Write the number of commands to show:");
					int x = input.nextInt();
					undoApp.historyCommand(x);
					break;
				case 0:
					System.out.println("Closing application.");
					exit = true;
					break;
				default:
					System.out.println("Error.");
			}	
		}while(exit == false);
		input.close();
	}

}
