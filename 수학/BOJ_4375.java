package Math;

import java.io.*;
import java.math.BigInteger;

// 24.04.11
public class BOJ_4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while ((str = br.readLine()) != null) {
            BigInteger n = new BigInteger(str);
            BigInteger base = BigInteger.ZERO;
            while(true) {
                base = base.multiply(BigInteger.TEN).add(BigInteger.ONE);
                if (base.mod(n).equals(BigInteger.ZERO)) {
                    bw.write(base.toString().length() + "\n");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
