import java.util.Arrays;
import java.util.Random;

public class MinMaxLambda {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 1, 101).toArray();

        Arrays.stream(array).forEach(element -> System.out.print(element + " "));
        System.out.println();

        int min = Arrays.stream(array).min().orElseThrow();

        int max = Arrays.stream(array).max().orElseThrow();

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
