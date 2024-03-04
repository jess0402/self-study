package DataStructure;

import java.io.*;
import java.util.Stack;

// 24.03.04
public class BOJ_1874_2 {
    static int N;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        int start = 0;
        while(N --> 0) {
            int value = Integer.parseInt(br.readLine());
            if(value > start) {
                for(int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                start = value;
            } else if(stack.peek() != value) {
                bw.write("NO");
                bw.flush();
                bw.close();
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }

        bw.append(sb.toString());
        bw.flush();
        bw.close();
    }
}
