import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        System.out.println("-----Menu-----");
        System.out.println("");
        System.out.println("1- add a contact.");
        System.out.println("2- print all contact.");
        System.out.println("3- Exit.");
        System.out.println("");

        System.out.println("please enter a number from above Menu:");
        Scanner scanner = new Scanner(System.in);

        int user_choice = scanner.nextInt();
        scanner.nextLine();

        if(user_choice == 1){
            AddContact addContact = new AddContact();
            System.out.println("Enter the contact first Name:");
            addContact.firstName[0] = scanner.nextLine();
            System.out.println("\nuser first name is :");
            System.out.println(addContact.firstName[0]);

        }


    }
}
