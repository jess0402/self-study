package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Stack;

public class BOJ_9012 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < cnt; i++) {
			String str = br.readLine();
			int len = str.length();
		
			stack.removeAllElements();
			for(int j = 0; j < len; j++) {
				char target = str.charAt(j);
				
				if(target == '(') {
					stack.add(target);
				} else {
					if(stack.isEmpty()) {
						stack.add(target);
						break;
					} else {
						stack.pop();
					}
				}
			}
			
			if(stack.isEmpty()) {
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}

		}
	
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
