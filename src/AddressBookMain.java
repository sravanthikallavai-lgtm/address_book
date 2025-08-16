import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Enter choice\n1.Add Contact\n2.Show contacts in Address Book\n3.Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    addressBook.addContact();
                    System.out.println("Added");
                    break;
                }
                case 2: {
                    ArrayList<Contact> contacts = addressBook.getContacts();
                    if (contacts.isEmpty()) {
                        System.out.println("No Contacts");
                    } else {
                        System.out.println("Contacts in Address Book");
                        for (Contact contact : contacts) {
                            System.out.println(contact.toString());
                        }
                    }
                    break;
                }
                case 3: {
                    isExit = true;
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
