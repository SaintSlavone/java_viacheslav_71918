
void main(String[] args) {
    Animal[] animals = new Animal[9];

    animals[0] = new Dog("Rex", 5, 30.0, "Brown", "Labrador");
    animals[1] = new Dog("Max", "Big Black Ovcharka");
    animals[2] = new Dog("Buddy", "Golden Retriever");

    animals[3] = new Pigeon("Coo", 2, 0.5, "White", "Rock Pigeon");
    animals[4] = new Pigeon("Dove", "B345 Pigeon");
    animals[5] = new Pigeon("Sky", "Wood Pigeon");

    animals[6] = new Blowfish("Puff", 1, 0.3, "Saltwater", false);
    animals[7] = new Blowfish("Spike", false);
    animals[8] = new Blowfish("Balloon", true);

    System.out.println("Animal Info:");
    for (Animal animal : animals) {
        System.out.println(animal.toString());
    }

    System.out.println("\nWhat animal is eating:");
    for (Animal animal : animals) {
        animal.eat();
    }

    System.out.println("\nWhat voice animal is making:");
    for (Animal animal : animals) {
        animal.getVoice();
    }

    System.out.println("\nSpecific methods:");
    ((Dog) animals[0]).bark();
    ((Pigeon) animals[3]).coo();
    ((Pigeon) animals[3]).fly();
    ((Blowfish) animals[6]).inflate();

    System.out.println("\nSleep method:");
    ((Dog) animals[0]).sleep();
}