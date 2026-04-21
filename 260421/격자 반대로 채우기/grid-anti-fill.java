import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] arr = new int[N][N];
        int num = 1;

        // 오른쪽 열부터 왼쪽 열까지
        for (int col = N - 1; col >= 0; col--) {
            // (N-1 - col)이 짝수냐 홀수냐로 방향 결정
            int step = (N - 1 - col) % 2;

            if (step == 0) {
                // 위 -> 아래
                for (int row = 0; row < N; row++) {
                    arr[row][col] = num++;
                }
            } else {
                // 아래 -> 위
                for (int row = N - 1; row >= 0; row--) {
                    arr[row][col] = num++;
                }
            }
        }

        // 출력 (위쪽 행부터)
        StringBuilder sb = new StringBuilder();
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
                if (j != N - 1) sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}