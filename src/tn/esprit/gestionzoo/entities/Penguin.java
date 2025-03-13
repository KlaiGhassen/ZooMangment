package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String name, int age, String family, boolean isMammmal, String habitat, float swimmingDepth) {
        super(name, age, family, isMammmal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin() {

    }

    @Override
    public void swim() {
        System.out.println("Penguin swimming");
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public String toString() {
        return super.toString() + "\nswimmingDepth: " + swimmingDepth;

    }
}
