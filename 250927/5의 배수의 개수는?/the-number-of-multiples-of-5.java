import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int rows = 4;
        int cols = 4;

        int[][] arr = new int[rows][cols];

        int cnt = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
                
                if (arr[i][j] % 5 == 0) {
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}