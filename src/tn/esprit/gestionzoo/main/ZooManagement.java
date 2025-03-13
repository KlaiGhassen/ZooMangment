package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

import java.sql.SQLOutput;

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

        tn.esprit.gestionzoo.entities.Zoo myZoo = new tn.esprit.gestionzoo.entities.Zoo("Esprit", "ariana", 20);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
   */

        //tn.esprit.gestionzoo.entities.Zoo myZoo = new tn.esprit.gestionzoo.entities.Zoo("Esprit", "ariana", 20);
        //tn.esprit.gestionzoo.entities.Zoo myZoo1 = new tn.esprit.gestionzoo.entities.Zoo("tekup", "ariana", 20);
        //tn.esprit.gestionzoo.entities.Animal tiger = new tn.esprit.gestionzoo.entities.Animal("bagira", 18, "bagira", true)
        //myZoo.displayZoo();
        //myZoo.addAnimal(lion);
        //myZoo.addAnimal(new tn.esprit.gestionzoo.entities.Animal("ace", 18, "chat", true));
        // myZoo.displayAnimals();
        //myZoo.addAnimal(lion);
        //myZoo.addAnimal(tiger);
        Zoo myZoo = new Zoo("Esprit", "ariana", 20);


        Animal lion = new Animal("simba", 18, "lion", true);
        Animal lion2 = new Animal("simba", 18, "lion", true);


        System.out.println(lion.equals(lion2));
        try {
            Dophin dophin = new Dophin("dophin", -2, "dophin", true, "test habitat", 300);

        Penguin penguin = new Penguin("penguin", 18, "penguin", true, "test habitat", 400);
        Terrestrial terrestrial = new Terrestrial("terrestrial", 18, "terrestrial", true, 4);
        System.out.println(terrestrial);
        System.out.println(penguin);
        System.out.println(dophin);
        dophin.swim();
        penguin.swim();
        myZoo.addAquaticAnimal(dophin);
        myZoo.addAquaticAnimal(penguin);
        try {
            myZoo.addAnimal(dophin);
            myZoo.addAnimal(dophin);
            myZoo.addAnimal(dophin);
            myZoo.addAnimal(dophin);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }


        // System.out.println(myZoo.searchAnimal(lion));

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        }
    }
}
