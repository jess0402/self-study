package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<>();
		
		String command;
		int num = 0;
		
		while(cnt != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			command = st.nextToken();
			
			switch (command) {
			case "push":
				num = Integer.parseInt(st.nextToken());
				q.offer(num);
				break;
			case "pop" :
				sb.append(q.peek() != null ? q.poll() : "-1").append("\n");
				break;
			case "size" :
				sb.append(q.size() + "\n");
				break;
			case "empty" :
				sb.append(q.isEmpty() ? "1" : "0").append("\n");
				break;
			case "front" :
				sb.append(q.peek() != null ? q.peek() : "-1").append("\n");
				break;
			case "back" :
				sb.append(q.isEmpty() ? "-1" : num).append("\n");
				break;

			default:
				break;
			}
			cnt--;
		}
		
		bw.append(sb.toString());
		bw.flush();
		bw.close();
		
	}

}
