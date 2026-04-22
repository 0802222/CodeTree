import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        // 각 행 평균
        for (int i = 0; i < 2; i++) {
            double sumRow = 0;
            for (int j = 0; j < 4; j++) {
                sumRow += arr[i][j];
            }
            double avgRow = sumRow / 4;
            System.out.printf("%.1f ", avgRow);
        }
        System.out.println();


        // 각 열 평균
        for (int j = 0; j < 4; j++) {
            double sumCol = 0;
            for (int i = 0; i < 2; i++) {
                sumCol += arr[i][j];
            }
            double avgCol = sumCol / 2;
            System.out.printf("%.1f ", avgCol);
        }
        System.out.println();


        // 전체 평균
        double totalSum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                totalSum += arr[i][j];
            }
        }
        double totalAvg = totalSum / (2 * 4);
        System.out.printf("%.1f ", totalAvg);

        sc.close();
    }
}