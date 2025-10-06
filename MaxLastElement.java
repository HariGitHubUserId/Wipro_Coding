import java.util.*;

public class MaxLastElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, arr[i]);
        }

        System.out.println(ans);
    }
}

