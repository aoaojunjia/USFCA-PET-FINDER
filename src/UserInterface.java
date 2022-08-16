import java.util.Scanner;

public class UserInterface {

    public void interact(AnimalShelter shelter) {
        String name, type, breed;
        Scanner sc  = new Scanner(System.in);

        System.out.println();
        System.out.println("Press 1 to see available pets");
        System.out.println("Press 2 to search for a pet by type and breed");
        System.out.println("Press 3 to adopt the pet by name");
        System.out.println("Press 4 to exit");

        // FILL IN CODE: repeatedly read the user's input, and allow the user to interact with the shelter information
        switch (sc.nextLine()) {
            case "1":
                shelter.printAvailablePets();
                interact(shelter);  //recall program
                break;
            case "2":
                System.out.println("Enter the type: ");
                type = sc.nextLine();
                System.out.println("Enter the breed: ");
                breed = sc.nextLine();
                shelter.search(type, breed);
                interact(shelter);  //recall program
                break;
            case "3":
                System.out.println("Enter the name of the pet you want to adopt: ");
                name = sc.nextLine();
                if (shelter.adopt(name)) {
                    System.out.println("Congratulations! You adopted " + name);
                } else {
                    System.out.println("Sorry, this pet is not available for adoption.");
                }
                interact(shelter); //recall program
                break;
            case "4":
                System.out.println("Exiting the program.");  //ending program
                break;
        }




    }

}