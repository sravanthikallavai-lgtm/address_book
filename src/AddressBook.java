import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contact> contacts = new <Contact>ArrayList();

    ArrayList<Contact> getContacts() {
        return contacts;
    }

    Scanner scanner = new Scanner(System.in);

    public void addContact() {
        Contact contact = new Contact();
        System.out.println("Enter first name");
        contact.setFirstName(scanner.nextLine());
        System.out.println("Enter last name");
        contact.setLastName(scanner.nextLine());
        System.out.println("Enter address");
        contact.setAddress(scanner.nextLine());
        System.out.println("Enter city");
        contact.setCity(scanner.nextLine());
        System.out.println("Enter state");
        contact.setState(scanner.nextLine());
        System.out.println("Enter Zipcode");
        contact.setZipCode(scanner.next());
        System.out.println("Enter PhoneNumber");
        contact.setPhoneNumber(scanner.next());
        System.out.println("Enter email");
        contact.setEmail(scanner.next());
        contacts.add(contact);
    }
}
