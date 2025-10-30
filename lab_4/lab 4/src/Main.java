//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Car{
    private String brand;
    private String model;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String brand, String model, int year, double price, String color, int quantity){

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void sell(int quantity){
        this.quantity -= quantity;
    }
    public void delivery(int quantity){
        this.quantity += quantity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

void main(){
    Car car1 = new Car("Toyota", "Hilux", 2000, 5000.0, "White", 10);
    System.out.println(car1);
    car1.sell(2);
    System.out.println(car1);
    car1.delivery(2);
    System.out.println(car1);
    car1.setBrand("GEEP");
    System.out.println(car1.getBrand());
    System.out.println(car1.toString());
}