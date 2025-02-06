public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    static int nbrAnimals;

    public Zoo() {
    }

    Zoo(String name, String city, int nbrCages) {
        animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;

    }

    void displayZoo() {
        System.out.println(name + " " + city + " " + nbrCages);

    }

    public String toString() {
        return "name " + name + " city " + city + " nbrcage " + nbrCages;
    }

}
