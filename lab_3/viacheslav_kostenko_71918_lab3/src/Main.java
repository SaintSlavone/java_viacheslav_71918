import java.util.Scanner;

void main() {

    Scanner userInput = new Scanner(System.in);

    double a, b, c;

    System.out.println("Enter value a:");
    a = userInput.nextDouble();

    while (a == 0) {
        System.out.println("a cannot be zero. Please enter a number:");
        a = userInput.nextDouble();
    }

    System.out.println("Enter value b:");
    b = userInput.nextDouble();

    System.out.println("Enter value c:");
    c = userInput.nextDouble();

    System.out.printf("Your quadratic equation is %.2fx² + %.2fx + %.2f = 0%n", a, b, c);
    System.out.println("Now we need to find Delta");

    double delta = b * b - 4 * a * c;

    System.out.printf("Delta: %.2f%n", delta);

    int numberOfRoots;

    if (delta < 0) {
        numberOfRoots = 0;
    } else if (delta == 0) {
        numberOfRoots = 1;
    } else {
        numberOfRoots = 2;
    }

    switch (numberOfRoots) {
        case 0:
            System.out.println("No real solutions for this equation");
            break;

        case 1:
            double x = -b / (2 * a);
            System.out.printf("One solution: x = %.2f%n", x);
            break;

        case 2:
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Two solutions: x1 = %.2f, x2 = %.2f%n", x1, x2);
            break;
    }

    userInput.close();
}