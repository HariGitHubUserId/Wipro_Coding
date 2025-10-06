import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanTriplet {

    public static boolean hasPythagoreanTriplet(int[] arr, int n) {
        // Square all elements
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * arr[i];
        }

        // Sort the squared array
        Arrays.sort(arr);

        // Fix the largest element and use two-pointer approach
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == arr[i]) {
                    return true; // Triplet found
                } else if (sum < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false; // No triplet found
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

        if (hasPythagoreanTriplet(arr, n)) {
            System.out.println("There exists a Pythagorean triplet.");
        } else {
            System.out.println("No Pythagorean triplet exists.");
        }
    }
}

