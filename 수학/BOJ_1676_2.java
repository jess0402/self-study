package Math;

import java.io.*;

public class BOJ_1676_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            int num = i;
            while(num % 5 == 0) {
                cnt++;
                num /= 5;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();

    }
}
