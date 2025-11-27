public class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, breed);
        this.breed = breed;
    }

    public void eat() {
        System.out.println(getName() + " the dog is eating meat");
    }

    public void getVoice() {
        System.out.println(getName() + " the dog is barking: Woof!");
    }

    public void bark() {
        System.out.println(getName() + " is barking loudly");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", furColor='" + getFurColor() + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}