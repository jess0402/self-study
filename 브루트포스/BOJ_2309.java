package BruteForce;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

// 24.04.12
public class BOJ_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int sum = 0;

        for(int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
            sum += n;
        }
        Arrays.sort(arr);

        int rest = sum - 100;
        outer:
        for(int i = 0; i < 8; i++) {
            for(int j = i+1 ; j < 9; j++) {
                if((arr[i] + arr[j]) == rest) {
                    arr[i] = 0;
                    arr[j] = 0;
                    break outer;
                }
            }
        }

        for(int i = 0; i < 9; i++) {
            if(arr[i] == 0) continue;
            else bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
