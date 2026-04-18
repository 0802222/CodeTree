import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        // 수열의 길이
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        // 수열
        int[] A = new int[N1];
        int[] B = new int[N2];

        for (int i = 0; i < N1; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N2; i++) {
            B[i] = sc.nextInt();
        }

        boolean found = false;

        // A에서 길이 N2인 구간들을 전부 검사
        for (int i = 0; i <= N1 - N2; i++) {
            boolean same = true;

            for (int j = 0; j < N2; j++) {
                if (A[i + j] != B[j]) {
                    same = false;
                    break;
                }
            }

            if (same) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}