package DataStructure;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 24.03.08
public class BOJ_17219 {
    static Map<String, String> passwordMap = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String site = st.nextToken();
            String password = st.nextToken();

            passwordMap.put(site, password);
        }

        for(int i = 0; i < M; i++) {
            bw.write(passwordMap.get(br.readLine()) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
