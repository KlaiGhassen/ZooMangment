package tn.esprit.gestionzoo.entities;

public class Dophin extends Aquatic {

    private float swimmingSpeed;

    public Dophin(String name, int age, String family, boolean isMammmal, String habitat, float swimmingSpeed) {
        super(name, age, family, isMammmal, habitat);
        this.swimmingSpeed = swimmingSpeed;

    }

    public Dophin() {

    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public String toString() {
        return super.toString() + "swimming Speed " + this.swimmingSpeed;
    }
    public void swim(){
        System.out.println("dophin is swimming.");

    }

}
