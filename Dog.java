import java.util.HashSet;
import java.util.Set;

public class Dog {

    //task 1 create Dog class

    private String name = "unknown";
    private String dogBreed = "unknown";
    public Set<String> owners = new HashSet<>();
    private int regNum = -1;
    private int seqNum;
    public static int count = 0;





/*
    public String toString() {

        return "Dog " + name + ", Breed = " + dogBreed + ", Registration #: " + regNum;

    }

 */

    public Dog(String name, String dogBreed, int regNum) {
        this.name = name;
        this.dogBreed = dogBreed;
        this.regNum = regNum;
        count++;
        this.seqNum = count;
    }


//getter setter


    public Set<String> getOwners() {
        return owners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return dogBreed;
    }

    public void setBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public static int getCount() {
        return count;
    }

    Dog() {

        this.dogBreed = "unknown";
        count++;
        this.seqNum = count;

    }


    //getter setter Done

    public static void printTotal() {
        System.out.println("Total number of dogs bred = " + count);
    }

    @Override
    public String toString() {
        return "Dog " + name + ", Breed = " + dogBreed + ", #owners = " + owners.size() +
                ", Registration #: " + regNum + ", Sequence #: " + seqNum;
    }


    public void addOwner(String owner) {
        owners.add(owner);
    }

    public int getSeqNum() {
        return seqNum;
    }



}





