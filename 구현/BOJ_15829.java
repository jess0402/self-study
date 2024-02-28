package Implementation;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_15829 {
    static final int M = 1234567891;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();

        BigInteger sum = new BigInteger("0");
        for(int i = 0; i < l; i++) {
            int num = (int) str.charAt(i) - 96;
            sum = sum.add(BigInteger.valueOf(num).multiply(BigInteger.valueOf(31).pow(i)));
        }

        bw.write(String.valueOf(sum.mod(BigInteger.valueOf(M))));
        bw.flush();
        bw.close();
    }
}
