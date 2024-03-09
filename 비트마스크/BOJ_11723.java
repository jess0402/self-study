package BitMask;

import java.io.*;
import java.util.StringTokenizer;

// 24.03.09
public class BOJ_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int S = 0;
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while(M --> 0) {
            st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();
            if(cmd.equals("all")) {
                S = (1 << 21) - 1;
            } else if(cmd.equals("empty")) {
                S = 0;
            } else {
                int num = Integer.parseInt(st.nextToken());
                switch (cmd) {
                    case "add" : S |= (1 << num); break;
                    case "remove" : S &= ~(1 << num); break;
                    case "check" : sb.append((S & (1 << num)) != 0 ? 1 : 0).append("\n"); break;
                    case "toggle" : S ^= (1 << num); break;
                }
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
