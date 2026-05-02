import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] grid = new int[N][N];

        for (int i = 0; i < M; i++) {
            int r = sc.nextInt(); // 1-based
            int c = sc.nextInt(); // 1-based

            grid[r - 1][c - 1] = r * c;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(grid[i][j]);
                if (j != N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}