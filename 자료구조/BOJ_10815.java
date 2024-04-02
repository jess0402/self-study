package DataStructure;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

// 24.04.03
public class BOJ_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < N; i++) {
            numMap.put(Integer.parseInt(st.nextToken()), 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int findNum = Integer.parseInt(st.nextToken());
            if(numMap.get(findNum) != null)  bw.write(1 + " ");
            else bw.write(0 + " ");
        }

        bw.flush();
        bw.close();

    }
}
