import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        
        // 남자 0, 여자 1, 성인 19세 이상
        int gender = sc.nextInt();
        int age = sc.nextInt();

        if (gender == 0) {
            if (age >= 19 ) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else {
            if (age >= 19) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}