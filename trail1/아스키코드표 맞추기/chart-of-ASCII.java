import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.print((char) num);

            if(sc.hasNextInt()){
                System.out.print(" ");
            }

        }

        sc.close();
    }
}