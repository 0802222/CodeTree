import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        // rrn : Resident Registration Number (주민등록번호)
        String rrn = sc.next();
        String[] rrnArr = rrn.split("-");

        System.out.print(rrnArr[0] + rrnArr[1]);
    }
}