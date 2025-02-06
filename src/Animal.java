public class Animal {
    String name;
    int age;
    String family;
    boolean isMammmal;

    Animal(String name, int age, String family, boolean isMammmal) {
        this.name = name;
        this.age = age;
        this.family = family;
        this.isMammmal = isMammmal;

    }

    public String toString() {
        return "name " + name + " age " + age + " family " + family;
    }

}
