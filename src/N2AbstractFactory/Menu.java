package N2AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	public static int showMenu() {
		System.out.println("Choose the country of the phone number: \r\n"
				+ "1. Germany. \r\n"
                + "2. France. \r\n"
                + "3. Italy. \r\n"
                + "4. United Kingdom. \r\n"
                + "5. Russia. \r\n"
                + "6. Ukraine. \r\n"
                + "7. Poland. \r\n"
                + "8. Romania. \r\n"
                + "9. Netherlands. \r\n"
                + "10. Belgium. \r\n"
                + "11. Greece. \r\n"
                + "12. Portugal. \r\n"
                + "13. Sweden. \r\n"
                + "14. Norway. \r\n");
		int menu = Input.getInt("Number:");
		return menu;
	}
	
	public static int searchPrefix() {
		int prefix = 0;
		switch (showMenu()) {
			case 1:
				prefix = 49;
				break;
			case 2:
				prefix = 33;
				break;
			case 3:
				prefix = 39;
				break;
			case 4:
				prefix = 44;
				break;
			case 5:
				prefix = 7;
				break;
			case 6:
				prefix = 380;
				break;
			case 7:
				prefix = 48;
				break;
			case 8:
				prefix = 40;
				break;
			case 9:
				prefix = 31;
				break;
			case 10:
				prefix = 32;
				break;
			case 11:
				prefix = 30;
				break;
			case 12:
				prefix = 351;
				break;
			case 13:
				prefix = 46;
				break;
			case 14:
				prefix = 47;
				break;
			default:
				System.out.println("Incorrect number.");
				break;
		}
		return prefix;
	}
	
	public static int showMenuApp() {
		System.out.println("ADDRESS BOOK: \r\n"
				+ "1. Add national contact. \r\n"
                + "2. Add international contact. \r\n"
                + "3. Show address book list. \r\n"
                + "0. Exit. \r\n");
		int menu = Input.getInt("Choose the section you want to access:");
		return menu;
	}
	
	public static void menuApp() {
		boolean exit = false;
		List <Object> addressBookList = new ArrayList <Object>();
		do {
			switch (showMenuApp()) {
				case 1:
					System.out.println("1. Add national contact.");
					Methods.createNationalContact(addressBookList);
					break;
				case 2:
					System.out.println("2. Add international contact.");
					Methods.createInternationalContact(addressBookList);
					break;
				case 3:
					System.out.println("4. Show address book list.");
					Methods.showAddressBookList(addressBookList);
					break;
				case 0:
					exit = true;
					break;
				default:
					System.out.println("Incorrect number.");
					break;
			}
		} while (!exit);
	}

}
