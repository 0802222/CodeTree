import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.print(mergeTrimmed(str1, str2));
        sc.close();
    }

    public static String mergeTrimmed(String str1, String str2) {

        return str1.replaceAll("\\s+", "") + str2.replaceAll("\\s+", "");
    }
}