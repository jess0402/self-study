package DataStructure;

import java.io.*;
import java.util.Stack;

// 24.03.04
public class BOJ_1874 {
    static Stack<Integer> stack = new Stack<>();
    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int idx = 0;
        int stackNum = 1;
        int tmp = 0;


        while(idx != n) {
            int target = arr[idx];

            if(target > stackNum) {
                stack.push(stackNum++);
                sb.append("+").append("\n");
            } else if(target == stackNum) {
                sb.append("+").append("\n");
                sb.append("-").append("\n");
                stackNum++;
                idx++;
            } else {
                tmp = stack.pop();
                sb.append("-").append("\n");

                if(tmp > target) {
                    sb = new StringBuilder();
                    sb.append("NO");
                    break;
                } else if(tmp == target) {
                    idx++;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
