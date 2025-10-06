import java.util.*;

public class DegreeOfRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // int degree;
        
        // if (n < m) {
        //     degree = 360 * (m - n) / 12;
        // } else {
        //     degree = 360 * (12 + m - n) / 12;
        // }
         int degree = ((m - n + 12) % 12) * 30;
        System.out.println(degree);
        
        sc.close();
    }
}

