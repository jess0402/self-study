package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> d = new LinkedList<>();
		
		String command;
		int num;
		
		int cnt = Integer.parseInt(br.readLine());
		
		while(cnt != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			command = st.nextToken();
			
			switch(command) {
			case "push_front" :
				num = Integer.parseInt(st.nextToken());
				d.addFirst(num);
				break;
			case "push_back" :
				num = Integer.parseInt(st.nextToken());
				d.addLast(num);
				break;
			case "pop_front" :
				sb.append(d.isEmpty() ? "-1" : d.pollFirst()).append("\n");
				break;
			case "pop_back" :
				sb.append(d.isEmpty() ? "-1" : d.pollLast()).append("\n");				
				break;
			case "size" :
				sb.append(d.size()).append("\n");
				break;
			case "empty" :
				sb.append(d.isEmpty() ? "1" : "0").append("\n");
				break;
			case "front" :
				sb.append(d.isEmpty() ? "-1" : d.getFirst()).append("\n");
				break;
			case "back" :
				sb.append(d.isEmpty() ? "-1" : d.getLast()).append("\n");
				break;
			default :
				break;
			}
			
			cnt--;
		}
		
		bw.append(sb.toString());
		bw.flush();
		bw.close();

	}

}
