import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int rows = 4;
        int cols = 4;

        int[][] arr = new int[rows][cols];


        for (int i = 0; i < arr.length; i++) {

            int total = 0;

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                total += arr[i][j];
            }
            System.out.println(total);
        }
    }
}