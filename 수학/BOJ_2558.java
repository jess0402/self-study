package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24.04.15
public class BOJ_2558 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        System.out.println(A+B);
    }
}
