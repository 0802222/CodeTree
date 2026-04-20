import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int[][] arr = new int[N][M];
    int num = 0;

    for (int i = 0; i < M; i++) {
        if (i % 2 == 0) {
            for (int j = 0; j < N; j++) {
                arr[j][i] = num++;
            }
        } else {
            for (int j = N - 1; j >= 0; j--) {
                arr[j][i] = num++;
            }
        }
    }

    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            sb.append(arr[i][j]);
            if (j < M - 1) {
                sb.append(" ");
            }
        }
        sb.append("\n");
    }
    System.out.print(sb.toString());
    }
}