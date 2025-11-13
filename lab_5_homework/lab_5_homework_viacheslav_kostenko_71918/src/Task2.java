import java.util.Random;

void main() {
    int[] array = new int[10];
    Random random = new Random();

    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(100) + 1;
    }

    System.out.println("Array values: " + Arrays.toString(array));

    int minValue = array[0];
    int maxValue = array[0];

    for (int i = 1; i < array.length; i++) {
        if (array[i] < minValue) {
            minValue = array[i];
        }
        if (array[i] > maxValue) {
            maxValue = array[i];
        }
    }

    System.out.println("Smallest value: " + minValue);
    System.out.println("Largest value: " + maxValue);
}
