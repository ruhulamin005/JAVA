## Step-by-Step Guide to Solve Task 3
1. Add a Static Variable count

Purpose: The count variable will track the total number of Dog objects created.
Implementation: You’ve already defined count as a static variable. This should be done at the class level, outside any methods or constructors.
Error if Not Implemented: If the count variable is not static, each Dog instance would have its own separate count, leading to incorrect tracking of the total number of dogs.
java


```java
private static int count = 0;
```


2. Modify Constructors to Increment count

Purpose: Both constructors need to increment count each time a Dog object is created.
Implementation: You have correctly implemented this step in both the parameterized and default constructors.
Error if Not Implemented: If you don’t increment count in both constructors, the total count of Dog objects created will be inaccurate.

```java
public Dog(String name, String dogBreed, int regNum) {
    this.name = name;
    this.dogBreed = dogBreed;
    this.regNum = regNum;
    count++; // Increment count when a new Dog is created
    this.seqNum = count;
}

public Dog() {
    this.dogBreed = "unknown";
    count++; // Increment count even when default constructor is used
    this.seqNum = count;
}
3. Add a Getter Method for count

Purpose: This method will allow external classes or methods to retrieve the current value of count.
Implementation: Implement a static getter method for count.
Error if Not Implemented: Without this getter, other classes cannot access the value of count, making it difficult to track the total number of Dog objects created.
java
Copy code
public static int getCount() {
    return count;
}
```
4. Add a Static Method printTotal

Purpose: This method will print the total number of dogs created. It is a simple utility function to display the value of count.
Implementation: Create a static method that prints the value of count.
Error if Not Implemented: Without this method, you’d need to manually print the value of count each time, which is less modular and reusable.

```java
public static void printTotal() {
    System.out.println("Total number of dogs bred = " + count);
}

```
5. Store and Return the Sequence Number (seqNum)

Purpose: The sequence number represents the order in which each Dog object was created, based on the value of count at the time of creation.
Implementation: You've correctly implemented the seqNum as an instance variable and set its value in the constructors.
Error if Not Implemented: If seqNum is not stored correctly, the order of dog creation will not be tracked, leading to incorrect or missing sequence numbers.

```java
private int seqNum;

public int getSeqNum() {
    return seqNum;
}

```
6. Update the toString Method

Purpose: Modify the toString method to include the sequence number (seqNum) in the output.
Implementation: Update the method to include seqNum in the return string.
Error if Not Implemented: Without including seqNum in toString, the printed details of each Dog object will be incomplete.

```java
@Override
public String toString() {
    return "Dog " + name + ", Breed = " + dogBreed + ", #owners = " + owners.size() +
           ", Registration #: " + regNum + ", Sequence #: " + seqNum;
}

```
7. Add Statements to the main Method

Purpose: This ensures that the program outputs the correct details before and after dog objects are created.
Implementation: Add calls to printTotal at the start and end of the main method.
Error if Not Implemented: The output will not show the correct total number of dogs created at different stages of the program, missing the requirement of the task.

```java
public static void main(String[] args) {
    System.out.println("Starting dog application ");
    
    // Print total at the beginning
    Dog.printTotal();

    Dog myDog1 = new Dog();
    Dog myDog2 = new Dog("Fluffy", "Poodle", 3496);

    System.out.println(myDog1);
    System.out.println(myDog2);

    myDog1.setName("Fido");
    myDog1.addOwner("Anne");
    myDog1.addOwner("Bob");

    myDog2.addOwner("Martha");

    System.out.println(myDog1);
    System.out.println(myDog2);

    System.out.println(myDog1.getName());
    System.out.println(myDog2.getName());

    // Print total at the end
    Dog.printTotal();
}
```

### Conclusion:
This solution ensures that all requirements of Task 3 are met. The static count variable accurately tracks the number of Dog objects, and the sequence number (seqNum) correctly reflects the order of creation. The static method printTotal provides a convenient way to display the total number of dogs bred. If any of these steps are skipped or implemented incorrectly, the program will fail to meet the task’s requirements, either by miscounting the number of dogs or by providing incomplete information about each dog.


## Step-by-Step Guide to Solve Task 4
1. Create the DogRegister Class

Purpose: The DogRegister class will manage a collection of Dog objects.
Implementation: Define the class and a private instance variable to hold the list of Dog objects.
Error if Not Implemented: Without a proper class structure, you cannot manage the Dog objects effectively, leading to a disorganized and inefficient implementation.
```java
import java.util.ArrayList;
import java.util.List;

public class DogRegister {
    private List<Dog> dogRegister;

    public DogRegister() {
        dogRegister = new ArrayList<>();
    }
}
```
2. Implement addDog Method

Purpose: Adds a Dog object to the dogRegister.
Implementation: Create a method that accepts a Dog object and adds it to the list.
Error if Not Implemented: If you don't have a method to add Dog objects to the register, you'll have no way to store them, rendering the register useless.

```
public void addDog(Dog dog) {
    dogRegister.add(dog);
}

```

3. Implement getDog Method

Purpose: Retrieves a Dog object based on its registration number.
Implementation: Iterate through the list to find the Dog with the matching regNum.
Error if Not Implemented: Without this method, you won't be able to access specific Dog objects in the register, making it impossible to retrieve or manipulate them based on their registration numbers.


```
public Dog getDog(int regNum) {
    for (Dog dog : dogRegister) {
        if (dog.getRegNum() == regNum) {
            return dog;
        }
    }
    return null;
}

```
4. Implement toString Method

Purpose: Provides a string representation of the DogRegister.
Implementation: Override the toString method to return details of all Dog objects in the register.
Error if Not Implemented: Without a proper toString method, you won't be able to easily print or inspect the contents of the register, making debugging and verification difficult.
```
public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Dog dog : dogRegister) {
        sb.append(dog).append("\n");
    }
    return sb.toString();
}
```
5. Implement getRegister Method

Purpose: Returns the current list of Dog objects.
Implementation: Create a method that returns the dogRegister list.
Error if Not Implemented: Without this method, you won’t have direct access to the entire list, limiting the flexibility of what you can do with the register.
```
public List<Dog> getRegister() {
    return dogRegister;
}
```
6. Modify the main Method

Purpose: Create a DogRegister object and add Dog objects to it. Test the methods by calling them and checking the output.
Implementation: Add code to demonstrate the functionality of the DogRegister.
Error if Not Implemented: Without testing in the main method, you won't be able to verify that the DogRegister class works as expected.
```
public static void main(String[] args) {
    System.out.println("Starting dog application ");
    
    Dog.printTotal();

    DogRegister dogRegister = new DogRegister();
    
    Dog myDog1 = new Dog();
    Dog myDog2 = new Dog("Fluffy", "Poodle", 3496);

    dogRegister.addDog(myDog1);
    dogRegister.addDog(myDog2);

    System.out.println(dogRegister);

    System.out.println("Retrieve Dog with regNum 3496: " + dogRegister.getDog(3496));

    Dog.printTotal();
}
```

7. Implement deleteDog Method

Purpose: Removes and returns a Dog object based on its registration number.
Implementation: Search for the Dog in the list, remove it, and return the object. If not found, return null.
Error if Not Implemented: Without this method, you won’t be able to manage the removal of Dog objects, which is crucial for keeping the register accurate and up-to-date.
```java
public Dog deleteDog(int regNum) {
    for (Dog dog : dogRegister) {
        if (dog.getRegNum() == regNum) {
            dogRegister.remove(dog);
            return dog;
        }
    }
    return null;
}

```
Testing in main Method:

Add code to test the deleteDog method.
```
System.out.println("Deleting Dog with regNum 3496: " + dogRegister.deleteDog(3496));
System.out.println(dogRegister);

 ```
8. Implement getDogsWhoseNameContains Method

Purpose: Returns a collection of Dog objects whose names contain a specific character sequence.
Implementation: Iterate through the list, check if the Dog's name contains the sequence, and add it to a result collection.
Error if Not Implemented: Without this method, you won’t be able to filter Dog objects based on partial name matches, limiting the usefulness of the DogRegister.
```java
public Collection<Dog> getDogsWhoseNameContains(String charSequence) {
    List<Dog> result = new ArrayList<>();
    for (Dog dog : dogRegister) {
        if (dog.getName().contains(charSequence)) {
            result.add(dog);
        }
    }
    return result;
```
Testing in main Method:

Add code to test the getDogsWhoseNameContains method.
```java
System.out.println("Dogs whose names contain 'Fluff': " + dogRegister.getDogsWhoseNameContains("Fluff"));
```
### Conclusion:
This solution ensures that all requirements of Task 4 are met. The DogRegister class is structured to manage a collection of Dog objects effectively. Each method is designed to handle specific tasks, such as adding, retrieving, deleting, and filtering dogs in the register. If any of these steps are skipped or implemented incorrectly, the program will fail to manage the Dog objects properly, leading to potential errors or incomplete functionality.
