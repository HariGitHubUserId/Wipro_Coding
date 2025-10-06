import java.util.*;

public class MissingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long sumA = 0, sumB = 0, sumC = 0;

        // Sum of first array
        for(int i = 0; i < N; i++){
            sumA += sc.nextInt();
        }

        // Sum of second array
        for(int i = 0; i < N - 1; i++){
            sumB += sc.nextInt();
        }

        // Sum of third array
        for(int i = 0; i < N - 2; i++){
            sumC += sc.nextInt();
        }

        long X = sumA - sumB; // first missing number
        long Y = sumB - sumC; // second missing number

        System.out.println(X);
        System.out.println(Y);
    }
}

