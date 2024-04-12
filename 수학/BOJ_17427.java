package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24.04.12
public class BOJ_17427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += i * (N / i);
        }
        System.out.println(sum);
    }
}
