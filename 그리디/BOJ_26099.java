package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24.04.09
public class BOJ_26099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long answer = 0;
        while(N > 0) {
            if((N % 5) == 0) {
                answer += (N / 5);
                break;
            } else {
                answer++;
                N -= 3;
                if(N < 0) answer = -1;
            }
        }
        System.out.print(answer);
    }
}
