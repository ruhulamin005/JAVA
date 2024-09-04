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
