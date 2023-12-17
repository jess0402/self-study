package self;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String str = br.readLine();

            if(str.equals("0")) break;

            StringBuilder sb = new StringBuilder(str);
            String strReverse = sb.reverse().toString();

            if(str.equals(strReverse)){
                bw.write("yes" + "\n");
            } else {
                bw.write("no" + "\n");
            }

        }

        bw.flush();
        bw.close();

    }
}
