package Sorting;

import java.io.*;
import java.nio.Buffer;

public class BOJ_10989_2 {
    private static int n;
    private static int[] numArr = new int[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            numArr[Integer.parseInt(br.readLine())]++;
        }

        for(int i = 0; i < 10001; i++) {
            int cnt = numArr[i];
            while(cnt > 0) {
                sb.append(i).append("\n");
                cnt--;
            }
        }

        System.out.println(sb);
    }
}
