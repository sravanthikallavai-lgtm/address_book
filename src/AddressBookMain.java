
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class AddressBookMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Hashtable<String, AddressBook> dictionary = new Hashtable<>();
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Enter your choice\n1.Add new AddressBook\n2.Edit or View Existing AddressBook\n3.View all AddressBooks\n4.Exit");
            int userChoice = scanner.nextInt();
            scanner.nextLine();
            switch (userChoice) {
                case 1 -> {
                    System.out.println("Enter AddressBook name");
                    String addressBookName = scanner.nextLine();
                    AddressBook addressBook = addAddressBook();
                    dictionary.put(addressBookName, addressBook);
                }
                case 2 -> {
                    System.out.println("Enter name of AddressBook to view");
                    String addBookName = scanner.nextLine();
                    if (dictionary.containsKey(addBookName)) {
                        AddressBook addressBook = dictionary.get(addBookName);
                        addOrEditOptionsForAddressBook(addressBook);
                    } else {
                        System.out.println("No address book with name: " + addBookName);
                    }
                }
                case 3 -> {
                    if (dictionary.isEmpty()){
                        System.out.println("No address books");
                    }else {
                        for (AddressBook addressBook : dictionary.values()){
                            System.out.println("Address Book");
                            for (Contact contact: addressBook.getContacts()){
                                System.out.println(contact.toString());
                            }
                        }
                    }
                }
                case 4 -> {
                    isExit = true;
                }
                default -> {
                    System.out.println("Invalid Choice. Please enter valid option");
                }
            }
        }
    }

    static AddressBook addAddressBook() {
        AddressBook addressBook = new AddressBook();
        addOrEditOptionsForAddressBook(addressBook);
        System.out.println("AddressBook added successfully");
        return addressBook;
    }

    static void addOrEditOptionsForAddressBook(AddressBook addressBook) {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Enter choice\n1.Add Contact\n2.Show contacts in Address Book\n3.Edit Contact\n4.Delete Contact\n5.Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    addressBook.addContact();
                    System.out.println("Added Successfully");
                }
                case 2 -> {
                    ArrayList<Contact> contacts = addressBook.getContacts();
                    if (contacts.isEmpty()) {
                        System.out.println("No Contacts");
                    } else {
                        System.out.println("Contacts in Address Book");
                        for (Contact contact : contacts) {
                            System.out.println(contact.toString());
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Enter first name of contact you want to edit");
                    String fName = scanner.nextLine();
                    addressBook.editContact(fName);
                }
                case 4 -> {
                    System.out.println("Enter first name of contact you want to delete");
                    String fNameToBeDeleted = scanner.nextLine();
                    addressBook.deleteContact(fNameToBeDeleted);
                }
                case 5 -> {
                    isExit = true;
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}
