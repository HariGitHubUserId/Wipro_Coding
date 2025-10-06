import java.util.*;

public class CellCompetitionOptimized {

    public static int[] cellCompete(int[] cells, int days) {
        int n = cells.length;
        int[] next = new int[n]; // Temporary array reused for all days

        for (int d = 0; d < days; d++) {
            for (int i = 0; i < n; i++) {
                int left = (i == 0) ? 0 : cells[i - 1];
                int right = (i == n - 1) ? 0 : cells[i + 1];

                next[i] = (left == right) ? 0 : 1; // Apply rules
            }
            // Swap references instead of copying
            int[] temp = cells;
            cells = next;
            next = temp;
        }

        return cells;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cells = new int[8];

        System.out.println("Enter 8 integers (0 or 1) for initial cell states:");
        for (int i = 0; i < 8; i++) {
            cells[i] = sc.nextInt();
        }

        System.out.println("Enter number of days to simulate:");
        int days = sc.nextInt();

        int[] result = cellCompete(cells, days);

        System.out.println("Final state after " + days + " days:");
        for (int cell : result) {
            System.out.print(cell + " ");
        }
    }
}

