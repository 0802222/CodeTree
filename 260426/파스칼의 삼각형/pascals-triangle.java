import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                
                // 파스칼 삼각형 규칙 1. 첫번째 열은 항상 1
                // 파스칼 삼각형 규칙 2. 각 행의 마지막 원소도 항상 1
                if(j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    // 파스칼 삼각형 규칙 3. 그 사이값들은 아래처럼 채운다.
                    arr[i][j] = (arr[i - 1][j - 1] + arr[i -1][j]);
                }
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}