package DataStructure;

import java.io.*;
import java.util.Stack;

// 24.03.06
public class BOJ_4949 {
    static Stack<Character> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        Character tmpCh;

        outer:
        while(true) {
            str = br.readLine();
            if(str.equals(".")) break;
            stack = new Stack<>();

            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ch == '(' || ch == '['){
                    stack.push(ch);
                } else if(ch == ')' || ch == ']') {
                    if(stack.isEmpty()) {
                        bw.write("no\n");
                        continue outer;
                    }
                    tmpCh = stack.pop();
                    if((ch == ')' && tmpCh == '(') || (ch == ']' && tmpCh == '[')) {
                        continue;
                    } else {
                        bw.write("no\n");
                        continue outer;
                    }
                }
            }
            if(!stack.isEmpty()){
                bw.write("no\n");
                continue;
            }
            bw.write("yes\n");
        }
        bw.flush();
        bw.close();
    }
}
