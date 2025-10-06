import java.util.Scanner;

public class DigitOccurrenceCounter {

    public static int countDigitOccurrences(long num, int digit) {
        int count = 0;

        // Convert digit to char for comparison
        char digitChar = (char)(digit + '0');

        // Convert number to string for easy traversal
        String numStr = Long.toString(num);

        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == digitChar) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        long num = sc.nextLong();

        System.out.println("Enter the digit to count:");
        int digit = sc.nextInt();

        int result = countDigitOccurrences(num, digit);
        System.out.println("Digit " + digit + " occurs " + result + " times.");
    }
}

