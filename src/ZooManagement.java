import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
         /*   int nbrCage;
        String cageName;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter the number of Cages:");
            sc.nextLine();
        } while (!sc.hasNextInt());
        nbrCage = sc.nextInt();


        System.out.println("Please enter the name of the Cage:");
        cageName = sc.next();

        System.out.println(cageName + " comporte " + nbrCage + " cages");

    Animal lion = new Animal("simba", 18, "lion", true);
        Zoo myZoo = new Zoo("Esprit", "ariana", 20);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
   */

        System.out.println(Zoo.nbrAnimals);
        Zoo myZoo = new Zoo();
        myZoo.nbrAnimals = 3;
        System.out.println(myZoo.nbrAnimals);
        myZoo.nbrAnimals = 2;
        System.out.println(myZoo.nbrAnimals);
        System.out.println(Zoo.nbrAnimals);

    }
}
