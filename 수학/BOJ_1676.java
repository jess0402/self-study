package Math;

import java.io.*;
import java.math.BigInteger;

public class BOJ_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        BigInteger big = new BigInteger("1");
        for(int i = 1; i <= n; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        String n_fact = String.valueOf(big);

        int cnt = 0;
        for (int i = n_fact.length() - 1; i >= 0; i--) {
            char c = n_fact.charAt(i);
            if (c == '0') {
                cnt++;
            } else {
                break;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
