import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        // n 년
        int n = sc.nextInt();

        // n 년간 자동차 가격
        int[] carPrice = new int[n];

        for (int i = 0; i < n; i++) {
            carPrice[i] = sc.nextInt();
        }
        
        int minPrice = carPrice[0];
        int maxRevenue = 0;

        for (int i = 1; i < n; i++) {
            int revenue = carPrice[i] - minPrice;
            
            if (revenue > maxRevenue) {
                maxRevenue = revenue;
            }

            if (carPrice[i] < minPrice) {
                minPrice = carPrice[i];
            }
        }
        System.out.print(maxRevenue);
        sc.close();
    }
}
