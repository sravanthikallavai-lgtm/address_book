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

    public void editContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                boolean check = true;
                while (check) {
                    System.out.println("Edit Options 1.firstName 2.lastName 3.address 4.city 5.state 6.zip 7.phonenumber 8.email 9.exit");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1 -> {
                            System.out.println("Enter your new firstName :");
                            String firstName = scanner.nextLine();
                            contact.setFirstName(firstName);
                        }
                        case 2 -> {
                            System.out.println("Enter your new lastName : ");
                            String lastName = scanner.nextLine();
                            contact.setLastName(lastName);
                        }
                        case 3 -> {
                            System.out.println("Enter your new address :");
                            String address = scanner.nextLine();
                            contact.setAddress(address);
                        }
                        case 4 -> {
                            System.out.println("Enter your new city : ");
                            String city = scanner.nextLine();
                            contact.setCity(city);
                        }
                        case 5 -> {
                            System.out.println("Enter your new state :");
                            String state = scanner.nextLine();
                            contact.setState(state);
                        }
                        case 6 -> {
                            System.out.println("Enter your new zip : ");
                            String zip = scanner.nextLine();
                            contact.setZipCode(zip);
                        }
                        case 7 -> {
                            System.out.println("Enter your new phoneNumber :");
                            String phoneNumber = scanner.nextLine();
                            contact.setPhoneNumber(phoneNumber);
                        }
                        case 8 -> {
                            System.out.println("Enter your new email : ");
                            String email = scanner.nextLine();
                            contact.setEmail(email);
                        }
                        default -> check = false;
                    }
                }
            }
        }
    }
}