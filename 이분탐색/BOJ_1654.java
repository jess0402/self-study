package BinarySearch;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24.03.05
public class BOJ_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] lines = new int[K];

        long max = 0;
        for(int i = 0; i < K; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            if(lines[i] > max) max = lines[i];
        }

        max++;

        long min = 0;
        long mid = 0;

        while(min < max) {
            mid = (min + max) / 2;

            long count = 0;

            for (int i = 0; i < K; i++) {
                count += (lines[i] / mid);
            }

            if (count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        bw.write(min - 1 + "");
        bw.flush();
        bw.close();

    }
}
