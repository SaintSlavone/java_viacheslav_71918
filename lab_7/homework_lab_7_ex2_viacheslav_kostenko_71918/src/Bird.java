public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name, 0);
        this.featherColor = featherColor;
    }

    public void eat() {
        System.out.println(getName() + " the bird is eating seeds");
    }

    public void getVoice() {
        System.out.println(getName() + " the bird is singing");
    }

    public void fly() {
        System.out.println(getName() + " the bird is flying in the sky");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public String toString() {
        return "Bird{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", featherColor='" + featherColor + '\'' +
                '}';
    }
}