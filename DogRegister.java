import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DogRegister {

    private List<Dog> dogRegister;

    public DogRegister() {
        dogRegister = new ArrayList<>();
    }

    public void addDog(Dog dog) {

        dogRegister.add(dog);//ck


    }    // Adds a dog to the register
    // regNum, if it exists, otherwise returns null.

    public Dog getDog(int regNum) {

        for (Dog dog : dogRegister) {
            if (dog.getRegNum() == regNum) {
                return dog;
            }
        }
        return null;


    } // Returns the Dog with a registration number of

    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Dog dog : dogRegister) {
            sb.append(dog).append("\n");
        }
        return sb.toString();

    }

    // The usual toString method.
    public List<Dog> getRegister() {

        return dogRegister;//ck


    } // Returns the current dog register

    public Dog deleteDog(int regNum)
    // Removes, and returns, the Dog with a registration number of regNum
    // If there is no Dog with that registration number, null is returned.
    // Include thorough testing code in the main method.
    {

        for (Dog dog : dogRegister) {
            if (dog.getRegNum() == regNum) {
                dogRegister.remove(dog);
                return dog;
            }
        }
        return null;//ck
    }


    public Collection<Dog> getDogsWhoseNameContains(String charSequence)
    // Returns a Collection<Dog> containing all the Dogs whose name contains
    // charSequence.  Does not change the contents of the register.
// Include thorough testing code in the main method.

    {

        List<Dog> result = new ArrayList<>();
        for (Dog dog : dogRegister) {
            if (dog.getName().contains(charSequence)) {
                result.add(dog);
            }
        }
        return result;


    }


}
