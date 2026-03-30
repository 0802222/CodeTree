import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int[] count = new int[4];
        

        while (sc.hasNext()) {
            String coldSymptoms = sc.next();
            int bodyTemperature = sc.nextInt();

            if (coldSymptoms.equals("Y") && bodyTemperature >= 37) {
                count[0]++;
            } else if (coldSymptoms.equals("N") && bodyTemperature >= 37) {
                count[1]++;
            } else if (coldSymptoms.equals("Y") && bodyTemperature < 37) {
                count[2]++;
            } else if (coldSymptoms.equals("N") && bodyTemperature < 37) {
                count[3]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(count[i] + " ");
        }

        if (count[0] >= 2) {
                System.out.print("E");
        }
        sc.close();
    }
}