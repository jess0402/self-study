package BruteForce;

import java.io.*;
import java.nio.Buffer;

public class BOJ_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        if(N < 100) {
            cnt = N;
        } else {
            cnt += 99;
            for(int i = 100; i <= N; i++) {
                if(isHansu(i)) cnt++;
            }
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isHansu(int num) {
        if(num < 100)
            return true;
        else {

            int hundreds = num / 100;
            int tens = num % 100 / 10;
            int ones = num % 10;

            if((hundreds - tens) == (tens - ones)) return true;
            else return false;
        }
    }
}
