package DynamicProgramming;

import java.io.*;

// 24.03.11
public class BOJ_1003 {
    static Integer[][] dp = new Integer[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        while(T --> 0) {
            int N = Integer.parseInt(br.readLine());
            fibonacchi(N);
            sb.append(dp[N][0] + " " + dp[N][1]).append("\n");
        }

        System.out.println(sb);
    }

    static Integer[] fibonacchi(int N) {

        if(dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = fibonacchi(N-1)[0] + fibonacchi(N-2)[0];
            dp[N][1] = fibonacchi(N-1)[1] + fibonacchi(N-2)[1];
        }
        return dp[N];
    }
}
