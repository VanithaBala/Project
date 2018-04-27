import java.util.*;
import java.io.*;

public class ContactApp extends Contact {
	// public static void main(String args[]){
	void getContact() throws FileNotFoundException, IOException {
		int ch;
		boolean loop=true;
		while(loop){
		Scanner in = new Scanner(System.in);
		System.out.println("****Phoneboook Application****\n");
		System.out.println("1.Create Contact");
		// System.out.println("Press Y to continue");
		System.out.println("2.View Contacts");
		System.out.println("3.Edit Contact");
		System.out.println("4.Delete Contact");
		System.out.println("5.Call Contact");
		System.out.println("Enter your choice");
		ch = in.nextInt();
		//boolean loop = true;
	//	while (loop) {
			switch (ch) {
			case 1:
				createContact();
				break;
			case 2:
				viewContact();
				break;
			case 3: {
				System.out.println("Enter the contact name to edit");
				String name = in.nextLine();
				while (in.hasNextLine()) {
					if (name.equals(in.nextLine().trim())) {
						System.out.println(name);
						break;
					} else {
						System.out.println("The entered name is not exist");
					}

				}
				break;

			}
			case 4:{
				System.out.println("Entere the name to delete");
				while (in.hasNextLine()) {
					if (name.equals(in.nextLine().trim())) {
						in.close();
					}
				}
			if (ch == 4) {
				loop = false;
			}
			break;
		}
	}
}
	}
}

