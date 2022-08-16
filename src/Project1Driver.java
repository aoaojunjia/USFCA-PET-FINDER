/** The driver class for project 1. You do not need to change it. */
public class Project1Driver {

    public static void main(String[] args) {

        // Create an animal shelter object and add several pets to it.
        AnimalShelter shelter = new AnimalShelter(8);
        shelter.addPet("Luna", "dog","Golden Retriever");
        shelter.addPet("Teddy", "dog","Labrador");
        shelter.addPet("Charlie", "dog","Golden Retriever");
        shelter.addPet("Aster", "dog","Husky");
        shelter.addPet("Goldie", "cat","Shorthair");
        shelter.addPet("Lisa", "cat","Longhair");
        shelter.addPet("Timmy", "cat","Siamese");
        shelter.addPet("Oliver", "cat","Shorthair");

        // Create a UserInterface
        UserInterface ui = new UserInterface();
        // Allow the user to interact with the given shelter (see, search and adopt pets)
        ui.interact(shelter);
    }
}