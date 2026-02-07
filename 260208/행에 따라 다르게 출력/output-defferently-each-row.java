import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {  // 홀수 행: 1씩 증가
                for (int j = 0; j < n; j++) {
                    System.out.print(val + " ");
                    val++;
                }
            } else {  // 짝수 행: 2씩 증가
                val++;
                for (int j = 0; j < n; j++) {
                    System.out.print(val + " ");
                    val += 2;
                }
                val--;
            }
            System.out.println();
        }
        sc.close();
    }
}