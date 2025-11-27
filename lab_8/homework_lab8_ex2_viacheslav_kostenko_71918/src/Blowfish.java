import interfaces.AnimalBehavior;

public class Blowfish extends Fish implements AnimalBehavior {
    private boolean isInflated;

    public Blowfish() {
        super();
        this.isInflated = false;
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean isInflated) {
        super(name, age, weight, waterType);
        this.isInflated = isInflated;
    }

    public Blowfish(String name, boolean isInflated) {
        super(name, "Saltwater");
        this.isInflated = isInflated;
    }

    public void eat() {
        System.out.println(getName() + " the blowfish is eating small organisms");
    }

    public void getVoice() {
        System.out.println(getName() + " the blowfish makes squeaking sounds");
    }

    public void inflate() {
        this.isInflated = true;
        System.out.println(getName() + " the blowfish is inflating itself");
    }

    public void move() {
        System.out.println(getName() + " the blowfish is swimming");
    }

    public void sleep() {
        System.out.println(getName() + " the blowfish is sleeping at the bottom");
    }

    public boolean isInflated() {
        return isInflated;
    }

    public void setInflated(boolean inflated) {
        isInflated = inflated;
    }

    public String toString() {
        return "Blowfish{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", waterType='" + getWaterType() + '\'' +
                ", isInflated=" + isInflated +
                '}';
    }
}