import java.util.Scanner;

public class TimeToCrossPlatform {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int l = scanner.nextInt();
        int p = scanner.nextInt();
        int s = scanner.nextInt();

        int time = (l + p) / s;
        System.out.println(time);

        scanner.close();
    }
}
