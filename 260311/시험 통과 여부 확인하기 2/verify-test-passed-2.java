import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] score = new int[4];
        double avg = 0;
        int passCount = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = 0; j < score.length; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }

            avg = (double) sum / score.length;

            if (avg >= 60.0) {
                System.out.println("pass");
                passCount++;
            } else {
                System.out.println("fail");
            }
        }
        System.out.print(passCount);
        sc.close();
    }
}