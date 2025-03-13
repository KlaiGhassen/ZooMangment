package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Animal extends Object {
    private String name;
    private int age;
    private String family;
    private boolean isMammmal;

    public Animal(String name, int age, String family, boolean isMammmal) {
        if (age < 0) {
            throw new InvalidAgeException("age must be a positive integer ");
        }
        this.name = name;
        this.age = age;
        this.family = family;
        this.isMammmal = isMammmal;

    }

    public Animal() {
    }

    public String toString() {
        return "name " + name + " age " + age + " family " + family;
    }

    public boolean equals(Object a) {
        if (a == null) return false;
        if (this == a) return true;
        if (a instanceof Animal animal) {
            return animal.age == age;
        }
        return false;
    }


    public String getNamee() {
        return this.name;
    }

    public int getAge() {

        return this.age;
    }

    public String getFamily() {
        return this.family;
    }

    public boolean isMammmal() {
        return this.isMammmal;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            throw new InvalidAgeException("age must be a positive integer ");
        }
        this.age = newAge;
    }

    public void setFamily(String newFamily) {
        this.family = newFamily;
    }

    public void setMammmal(boolean isMammmal) {
        this.isMammmal = isMammmal;
    }


}
