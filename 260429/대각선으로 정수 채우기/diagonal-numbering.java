import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        int num = 1;
        int startRow = 0;
        int startCol = 0;

        while (startRow < N && startCol < M) {
            int row = startRow;
            int col = startCol;

            while (row < N && col >= 0) {
                arr[row][col] = num++;
                row++;
                col--;
            }

            if (startCol + 1 < M) {
                startCol++;
            } else {
                startRow++;
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}