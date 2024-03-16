package DataStructure;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

// 24.03.16
public class BOJ_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        HashMap<String, Integer> clothesMap;

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            clothesMap = new HashMap<>();
            for(int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind = st.nextToken();
                if(clothesMap.containsKey(kind)) {
                    clothesMap.put(kind, clothesMap.get(kind) + 1);
                } else {
                    clothesMap.put(kind, 1);
                }
            }

            int result = 1;
            for(int val : clothesMap.values()) {
                result *= (val+1);
            }

            bw.write(result-1 + "\n");
        }
        bw.flush();
        bw.close();

    }
}
