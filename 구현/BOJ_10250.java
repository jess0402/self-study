package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//24.01.26
public class BOJ_10250 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int H = Integer.parseInt(st.nextToken()); // 층 수
			int W = Integer.parseInt(st.nextToken()); // 방 수
			int N = Integer.parseInt(st.nextToken()); // 몇 번째 손님
			
			
			String h;
			String w;
			if(N % H == 0) {
				h = String.valueOf(H);
				w = String.valueOf(N / H);
			} else {
				h = String.valueOf(N % H);
				w = String.valueOf(N / H + 1);
			}
			
			if(Integer.parseInt(w) < 10) {
				sb.append(h).append("0").append(w);
			} else {
				sb.append(h).append(w);
			}
			sb.append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
