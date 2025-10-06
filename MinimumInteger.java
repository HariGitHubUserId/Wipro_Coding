import java.util.*;
import java.util.stream.IntStream;

public class MinimumInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // number of integers
        int[] numbers = IntStream.range(0, N)
                                 .map(i -> sc.nextInt())
                                 .toArray();
        int minValue = Arrays.stream(numbers).min().getAsInt();
        System.out.println(minValue);
        sc.close();
    }
}



