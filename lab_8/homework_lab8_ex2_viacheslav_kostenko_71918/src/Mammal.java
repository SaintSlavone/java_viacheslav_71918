public class Mammal extends Animal {
    private String furColor;

    public Mammal() {
        super();
        this.furColor = "Unknown";
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, String furColor) {
        super(name, 0);
        this.furColor = furColor;
    }

    public void eat() {
        System.out.println(getName() + " the mammal is eating food");
    }

    public void getVoice() {
        System.out.println(getName() + " the mammal makes a sound");
    }

    public void sleep() {
        System.out.println(getName() + " the mammal is sleeping");
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String toString() {
        return "Mammal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", furColor='" + furColor + '\'' +
                '}';
    }
}