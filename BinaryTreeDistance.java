import java.util.Scanner;

public class BinaryTreeDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first encoding (X): ");
        String X = sc.nextLine();

        System.out.print("Enter second encoding (Y): ");
        String Y = sc.nextLine();

        int i = 0;
        while (i < X.length() && i < Y.length() && X.charAt(i) == Y.charAt(i)) {
            i++;
        }

        int distance = (X.length() - i) + (Y.length() - i);
        System.out.println("Shortest distance between nodes: " + distance);
    }
}
