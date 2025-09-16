import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};

        char x = sc.next().charAt(0);
        int count = 0;

        for(int i = 0; i <arr.length; i++) {
            if (arr[i].charAt(2) == x) {
                System.out.println(arr[i]);
                count++;
            }
            if (arr[i].charAt(3) == x) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}