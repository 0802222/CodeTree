import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();   // 첫 번째 단어
        String b = sc.next();   // 두 번째 단어

        if (a.length() > b.length()) {
            System.out.println(a + " " + a.length());
        } else if (a.length() < b.length()) {
            System.out.println(b + " " + b.length());
        } else {
            System.out.println("same");
        }
    }
}