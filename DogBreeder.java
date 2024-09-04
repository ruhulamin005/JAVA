
public class DogBreeder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Prints the message "Starting dog application"

        System.out.println("Starting dog application ");

        Dog.printTotal();

        DogRegister dogRegister = new DogRegister();


        //Object

        Dog myDog1 = new Dog();
        // System.out.println(myDog);


        //setting value to myDog

        Dog myDog2 = new Dog("Fluffy", "Poodle", 3496);


        //System.out.println(myDog1);
        //System.out.println(myDog2);

        dogRegister.addDog(myDog1);
        dogRegister.addDog(myDog2);

        System.out.println(dogRegister);
        System.out.println("Retrieve Dog with regNum 3496: " + dogRegister.getDog(3496));

/*

        myDog1.setName("Fido");
        myDog1.addOwner("Anne");
        myDog1.addOwner("Bob");


        myDog2.addOwner("Martha");


        System.out.println(myDog1);
        System.out.println(myDog2);


        System.out.println(myDog1.getName());
        System.out.println(myDog2.getName());



 */

        System.out.println("Deleting Dog with regNum 3496: " + dogRegister.deleteDog(3496));
        System.out.println(dogRegister);

        System.out.println("Dogs whose names contain 'Fluff': " + dogRegister.getDogsWhoseNameContains("Fluff"));




        Dog.printTotal();




    }
}
