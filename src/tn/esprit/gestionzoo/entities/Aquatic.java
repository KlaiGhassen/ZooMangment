package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String name, int age, String family, boolean isMammmal, String habitat) {
        super(name, age, family, isMammmal);
        this.habitat = habitat;
    }

    public Aquatic() {
    }

    public abstract void swim();


    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String toString() {
        return super.toString() + "Aquatic [habitat=" + this.habitat + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic a)
            return this.getAge() == a.getAge() && this.getNamee().equals(a.getNamee()) && this.getHabitat().equals(a.getHabitat());
        return false;
    }

}
