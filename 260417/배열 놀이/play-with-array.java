import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N + 1]; // 1 - indexed

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        
        for (int qi = 0; qi < Q; qi++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int a = Integer.parseInt(st.nextToken());
                sb.append(arr[a]).append('\n');
            } else if (type == 2) {
                int b = Integer.parseInt(st.nextToken());
                int idx = 0;
                for (int i = 1; i <= N; i++) { 
                    if (arr[i] == b) {
                        idx = i;
                        break; // 가장 작은 인덱스를 찾으면 바로 종료
                    }
                }
                sb.append(idx).append('\n');
            } else if (type == 3) {
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                
                for (int i = s; i <= e; i++) {
                    sb.append(arr[i]);
                    if (i < e) sb.append(' ');
                }
                sb.append('\n');
            }
        }
        System.out.print(sb.toString());
    }
}

