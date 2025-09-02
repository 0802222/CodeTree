import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int aMath = sc.nextInt();
        int aEng = sc.nextInt();
        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

        int result = (aMath > bMath && aEng > bEng) ? 1 : 0;
        System.out.println(result);
    }
}