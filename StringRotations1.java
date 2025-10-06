import java.util.Scanner;

public class StringRotations1 {

    public static String[] generateRotations(String str) {
        int n = str.length();
        String[] rotations = new String[n];

        String rotated = str;
        for (int i = 0; i < n; i++) {
            rotations[i] = rotated;
            // Rotate string by moving first character to the end
            rotated = rotated.substring(1) + rotated.charAt(0);
        }

        return rotations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String[] rotations = generateRotations(str);

        System.out.println("All rotations of the string:");
        for (String s : rotations) {
            System.out.println(s);
        }
    }
}

