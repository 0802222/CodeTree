import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();

        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'e') {
                idx = i;
                break;
            }
        }

        char[] result = new char[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            if (i == idx) {
                continue;
            }
            result[j++] = arr[i];
        }

        System.out.print(new String(result));
        sc.close();
    }
}