package Sorting;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BOJ_10989 {
    private static int n;
    private static int[] numArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        numArr = new int[n];

        for(int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numArr);

        for(int i = 0; i < n; i++) {
            sb.append(String.valueOf(numArr[i])).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
