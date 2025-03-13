package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    static final int NBR_CAGES = 3;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals;
    private int aquaticAnimal;

    public Zoo() {
    }

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[NBR_CAGES];
        this.name = name;
        this.city = city;
        aquaticAnimals = new Aquatic[3];

    }

    public void displayNumberOfAquaticsByType() {
        int nbrPenguins = 0;
        int nbrDophins = 0;
        for (int i = 0; i < aquaticAnimal; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
            if (aquaticAnimals[i] instanceof Dophin) {
                nbrDophins++;
            }
        }
        System.out.println("the zoo " + " named " + name + " has " + nbrPenguins + " penguins and " + nbrDophins + " dophins.");
    }


    public float maxPenguinSwimmingDepth() {
        float maxPenguinSwimmingDepth = 0f;
        for (int i = 0; i < aquaticAnimal; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (maxPenguinSwimmingDepth < penguin.getSwimmingDepth()) {
                    maxPenguinSwimmingDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxPenguinSwimmingDepth;


    }


    public void addAquaticAnimal(Aquatic aquatic) {
        this.aquaticAnimals[aquaticAnimal] = aquatic;
        aquaticAnimal++;
    }


    void displayZoo() {
        System.out.println(name + " " + city + " " + NBR_CAGES);

    }

    public void addAnimal(Animal animal) throws ZooFullException {
        this.animals[nbrAnimals] = animal;
        this.nbrAnimals++;
        System.out.println("nbr animals" + nbrAnimals);
        if (isZooFull()) {
            throw new ZooFullException("zoo is full");
        }

    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getNamee().equals(animal.getNamee())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        this.animals[index] = null;
        this.nbrAnimals--;
        return true;
    }

    public boolean isZooFull() {
        return this.nbrAnimals >= NBR_CAGES;
    }

    public String toString() {
        return "name " + name + " city " + city + " nbrcage " + NBR_CAGES;
    }

    public Zoo compareToZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;

        }
        return z2;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Empty name");
        }
        this.name = name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public int getAquaticAnimal() {
        return aquaticAnimal;
    }

    public void setAquaticAnimal(int aquaticAnimal) {
        this.aquaticAnimal = aquaticAnimal;
    }
}
