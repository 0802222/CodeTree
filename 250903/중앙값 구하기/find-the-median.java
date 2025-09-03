import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        // ex) 26, 22, 30
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (b > c) {             // 중간값 비교를 위해 b가 내려옴
                System.out.println(b);
            } else {                 // b < c
                if (a > c) {
                    System.out.println(c);
                } else {             // a < c
                    System.out.println(a);
                }
            }
        } else { // a < b
            if (a > c) {
                System.out.println(a);
            } else {                 // a < c
                if(b > c) {
                System.out.println(c);
                } else {             // b < c
                System.out.println(b);
                }
            }
        }
    }
}