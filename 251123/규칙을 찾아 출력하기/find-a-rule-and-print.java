import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int width = 2 * n - 1; // 전체 출력 폭

        for (int i = 1; i <= n; i++) {       // i = 행 번호
            for (int j = 1; j <= width; j++) { // j = 열 번호

                if (i == 1 || i == n) {
                    System.out.print(j % 2 == 1 ? "*" : " ");
                } else {
                    // 중간 줄
                    int leftEnd = 2 * (i - 1) - 1; // 왼쪽 삼각형 끝나는 지점

                    if ((j % 2 == 1 && j <= leftEnd) || j == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}