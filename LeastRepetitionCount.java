import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeastRepetitionCount {

    public static int leastRepetitionCount(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find minimum frequency
        int minFreq = Integer.MAX_VALUE;
        for (int count : freqMap.values()) {
            if (count < minFreq) {
                minFreq = count;
            }
        }

        return minFreq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = leastRepetitionCount(arr);
        System.out.println("Least number repetition count: " + result);
    }
}

