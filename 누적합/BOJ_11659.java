package PrefixSum;

import java.io.*;
import java.util.StringTokenizer;

// 24.03.17
public class BOJ_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] numArr = new int[N+1];
        st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= N; i++) {
            numArr[0] = 0;
            numArr[i] = numArr[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            bw.write(numArr[end] - numArr[start-1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
