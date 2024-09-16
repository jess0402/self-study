package BruteForce;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 24.09.16
public class BOJ_4673 {
    static boolean[] check = new boolean[10001];

    public static void main(String[] args) throws IOException {

        for(int i = 1; i < 10001; i++) {
            int n = d(i);
            if(n < 10001) {
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < check.length; i++) {
            if(!check[i])
                sb.append(i).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static int d(int number) {
        int sum = number;
        while(number != 0){
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}
