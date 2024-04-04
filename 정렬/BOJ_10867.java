package Sorting;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24.04.04
public class BOJ_10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int prev = arr[0];
        bw.write(arr[0] + " ");
        for(int i = 1; i < N; i++) {
            if(prev != arr[i]) {
                bw.write(arr[i] + " ");
                prev = arr[i];
            }
        }

        bw.flush();
        bw.close();
    }
}
