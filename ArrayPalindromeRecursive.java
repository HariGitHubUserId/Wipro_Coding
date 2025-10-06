import java.util.Scanner;

public class ArrayPalindromeRecursive {

    public static boolean isPalindromeRecursive(int[] arr, int start, int end) {
        // Base case: crossed indices
        if (start >= end) return true;

        // If mismatch found
        if (arr[start] != arr[end]) return false;

        // Recursive call
        return isPalindromeRecursive(arr, start + 1, end - 1);
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

        boolean result = isPalindromeRecursive(arr, 0, n - 1);
        if (result) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}

