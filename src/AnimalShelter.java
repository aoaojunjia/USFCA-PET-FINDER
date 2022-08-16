/** A class representing an animal shelter, stores Pet references in an array; */
public class AnimalShelter {
    private Pet[] pets; // the array of pets
    private int count; // the current number of pets

    /** Constructor for AnimalShelter. Takes the maximum number of pets it can store as a parameter */
    public AnimalShelter(int maxCapacity) {
        // FILL IN CODE: initialize the pets array
        // initilize the count to 0 (at first, we have no pets).
        count = 0;
        pets = new Pet[maxCapacity];

    }

    /** Creates a Pet with the given name, type and breed, and adds it to the pets array.
     * Increments the count variable.
     */
    public void addPet(String name, String type, String breed) {
        // FILL IN CODE: create a Pet and add it to the pets array. Increment the count
        if(count == pets.length){
            System.out.println("Pet numbers excess shelter size, we cannot add more");
            return;
        }
        pets[count] = new Pet(name, type, breed);
        count++;
    }

    /** Print information about the pets that are available for adoption (those for which isAvailable flag is true) */
    public void printAvailablePets() {
        System.out.println("Pets available for adoption: ");
        // FILL IN CODE:
        for(Pet i : pets){
            if(i.check_adopted()){
                System.out.println(i.toString());
            }
        }

    }

    public void search(String type, String breed) {
        // FILL IN CODE: shows available pets with the given type and breed. For instance, if this method is called with // "dog" and "Golden Retriever", this method should print all available Golden Retriever dogs to the consoler.

        // If the breed is left blank "", then show all the breeds for the given type that are available
        // If both the type and the breed are blank "", show all the pets that are available
        if(type.equals("") && breed.equals("")){
            printAvailablePets();
        }
        else if (breed.equals("") && !type.equals("")){
            for(Pet i : pets){
                if(i.get_type().equals(type) && i.check_adopted()){
                    System.out.println(i.toString());
                }
            }
        }
        else if(type.equals("") && !breed.equals("")){
            for(Pet i : pets){
                if(i.get_breed().equals(breed) && i.check_adopted()){
                    System.out.println(i.toString());
                }
            }
        }
        else{
            for(Pet i : pets){

                if(i.get_breed().equals(breed) && i.get_type().equals(type) && i.check_adopted()){
                    System.out.println(i.toString());
                }
            }
        }

    }

    /** Adopts a pet with the given name */
    public boolean adopt(String petName) {
        // FILL IN CODE: find the pet with the given name (assume the name is unique), adopt it if available  and return true
        // If not available or no such name, return false
        for(Pet i : pets){
            if(i.get_name().equals(petName) && i.check_adopted()){
                return i.adopt();
            }
        }
        return false; // was not available for adoption
    }

}