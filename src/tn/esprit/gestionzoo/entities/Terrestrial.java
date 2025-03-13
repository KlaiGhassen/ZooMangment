package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial(String name, int age, String family, boolean isMammmal, int nbrLegs) {
        super(name, age, family, isMammmal);
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial() {

    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + "Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                '}';
    }
}
