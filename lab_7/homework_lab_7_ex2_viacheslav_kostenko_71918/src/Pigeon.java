public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, species);
        this.species = species;
    }

    public void eat() {
        System.out.println(getName() + " the pigeon is eating grain");
    }

    public void getVoice() {
        System.out.println(getName() + " the pigeon is cooing");
    }

    public void coo() {
        System.out.println(getName() + " is making cooing sounds");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String toString() {
        return "Pigeon{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", featherColor='" + getFeatherColor() + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}