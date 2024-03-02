package Math;

import java.io.*;

// 24.03.02
public class BOJ_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        int range = 1;

        if(N != 1) {
            while (N > range) {
                range += cnt * 6;
                cnt++;
            }
        }

        bw.write(cnt + "");
        bw.flush();
        bw.close();
    }
}