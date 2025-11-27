public class Fish extends Animal {
    private String waterType;

    public Fish() {
        super();
        this.waterType = "Unknown";
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, String waterType) {
        super(name, 0);
        this.waterType = waterType;
    }

    public void eat() {
        System.out.println(getName() + " the fish is eating aquatic plants");
    }

    public void getVoice() {
        System.out.println(getName() + " the fish makes bubbling sounds");
    }

    public void swim() {
        System.out.println(getName() + " the fish is swimming in water");
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public String toString() {
        return "Fish{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", waterType='" + waterType + '\'' +
                '}';
    }
}