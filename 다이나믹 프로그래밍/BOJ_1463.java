package DynamicProgramming;

import java.io.*;

// 24.03.10
public class BOJ_1463 {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        bw.write(recur(N) + "");
        bw.flush();
        bw.close();
    }

    static int recur(int N) {

        if(dp[N] == null) {
            // 6으로 나누어 떨어지는 경우
            if(N % 6 == 0) {
                dp[N] = Math.min(recur(N-1), Math.min(recur(N/2), recur(N/3))) + 1;
            }
            // 3으로만 나누어 떨어지는 경우
            else if(N % 3 == 0) {
                dp[N] = Math.min(recur(N/3), recur(N-1)) + 1;
            }
            // 2로만 나누어 떨어지는 경우
            else if(N % 2 == 0) {
                dp[N] = Math.min(recur(N/2), recur(N-1)) + 1;
            }
            // 2와 3으로 나누어지지 않는 경우
            else {
                dp[N] = recur(N-1)  + 1;
            }
        }

        return dp[N];
    }
}
