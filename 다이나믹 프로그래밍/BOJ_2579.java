package DynamicProgramming;

import java.io.*;

// 24.03.12
public class BOJ_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] DP = new int[N+1];
        int[] stair = new int[N+1];

        for(int i = 1; i <= N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        // index = 0 은 시작점
        DP[1] = stair[1];

        if(N >= 2) {
            DP[2] = stair[1] + stair[2];
        }

        for (int i = 3; i <= N; i++) {
            DP[i] = Math.max(DP[i - 2] , DP[i - 3] + stair[i - 1]) + stair[i];
        }

        System.out.println(DP[N]);
    }
}
