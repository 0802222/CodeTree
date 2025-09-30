public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        int a = 5;
        int b = 6;
        int c = 7;
        int temp1, temp2;

        temp1 = a;      // temp1 = 5
        a = c;          // a = 7
        temp2 = b;      // temp2 = 6
        b = temp1;      // b = 5 
        c = temp2;

        System.out.println(a); // 7
        System.out.println(b); // 5
        System.out.println(c); // 6
    }
}