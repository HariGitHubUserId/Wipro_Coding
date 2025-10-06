import java.util.*;
import java.util.stream.IntStream;

public class EvenNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Total numbers

        int sum = IntStream.range(0, N) // Loop from 0 to N-1
                .map(i -> sc.nextInt()) // Read each number
                .filter(num -> num % 2 == 0) // Keep only even numbers
                .sum(); // Add them up

        System.out.println(sum); // Print result
    }
}

