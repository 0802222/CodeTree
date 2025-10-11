import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // BigDecimal로 변환
        BigDecimal bdA = new BigDecimal(a);
        BigDecimal bdB = new BigDecimal(b);

        BigDecimal result = bdA.divide(bdB, 20, RoundingMode.FLOOR);

        System.out.println(result.toPlainString());
        sc.close();
    }
}