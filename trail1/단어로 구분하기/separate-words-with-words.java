import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = 10;
        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++){
            arr[i] = sc.next();
            System.out.println(arr[i]);
        }
        
        sc.close();
    }
}