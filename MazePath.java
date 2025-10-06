import java.util.*;

public class MazePath {

    // Directions: up, down, left, right
    private static final int[] rowDir = {-1, 1, 0, 0};
    private static final int[] colDir = {0, 0, -1, 1};

    public int isPath(int[][] maze) {
        int m = maze.length;
        int n = maze[0].length;
        
        if (maze[0][0] == 0) return 0; // Start blocked

        boolean[][] visited = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0], c = cell[1];

            if (maze[r][c] == 9) return 1; // Found cheese

            for (int i = 0; i < 4; i++) {
                int nr = r + rowDir[i];
                int nc = c + colDir[i];

                if (nr >= 0 && nr < m && nc >= 0 && nc < n 
                    && maze[nr][nc] != 0 && !visited[nr][nc]) {
                    queue.add(new int[]{nr, nc});
                    visited[nr][nc] = true;
                }
            }
        }

        return 0; // No path
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter number of columns:");
        int n = sc.nextInt();

        int[][] maze = new int[m][n];
        System.out.println("Enter the maze (0 = wall, 1 = path, 9 = cheese):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        MazePath mp = new MazePath();
        int result = mp.isPath(maze);
        System.out.println("Path exists? " + result);
    }
}

