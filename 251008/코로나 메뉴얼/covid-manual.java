import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int emergencyCount = 0;

        for (int i = 0; i < 3; i++) {
            String hasColdSymptoms = sc.next();
            int bodyTemperatureC = sc.nextInt();

            String code = "D";

            if (hasColdSymptoms.equals("Y")) {
                if (bodyTemperatureC >= 37) code = "A";
                else code = "C";
            } else if (hasColdSymptoms.equals("N")) {
                if (bodyTemperatureC >= 37) code = "B";
                else code = "D";
            }

            if (code.equals("A")) emergencyCount++;
        }
        System.out.println(emergencyCount >= 2 ? "E" : "N");       

        sc.close(); 
    }
}