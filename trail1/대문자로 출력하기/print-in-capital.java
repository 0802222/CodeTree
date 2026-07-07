import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();          // 한 줄 입력 (길이 ≤ 100)

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 알파벳만 필터링
            if (Character.isLetter(c)) {
                // 대문자로 변환해서 추가
                sb.append(Character.toUpperCase(c));
            }
        }

        System.out.println(sb.toString());
    }
}