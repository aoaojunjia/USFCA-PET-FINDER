

/* A class representing a pet */
public class Pet {
    // FILL IN CODE: add instance variables for the name, type and breed (all Strings)

    // FILL IN CODE: add a boolean instance variable called isAvailable that tells us whether the pet is available for adoption or not.
    // This variable should initially be set to true. If the pet is adopted, isAvailable should be set to false.

    private Boolean adopted;
    private String name, type, breed;

    /** Constructor of class Pet */
    public Pet(String name, String type, String breed) {
        // FILL IN CODE
        adopted = true;
        this.name = name;
        this.type = type;
        this.breed = breed;

    }

    // FILL IN CODE: add getters as needed

    /** If the pet is available for adoption, "adopts" the pet by setting the isAvailable variable to false (so that it is no longer available for adoption, it has already been adopted) 
     * and returns true (meaning the adoption was successful).
     * If the pet is not available, returns false (it means we were not able to adopt this pet since it is not available).
     */
    public boolean adopt() {
        // FILL IN CODE
        if(adopted){
            adopted = false;
            return true;
        }
        return false; // change
    }

    /**  Returns a string representation of this pet */
    public String toString() {
        // FILL IN CODE: return a string that contains the name, the type and the breed separated by comma

        return name + ", " + type + ", " + breed;
    }

    public String get_name(){
        return name;
    }
    public String get_type(){
        return type;
    }
    public String get_breed(){
        return breed;
    }

    public boolean check_adopted(){
        return adopted;
    }
}