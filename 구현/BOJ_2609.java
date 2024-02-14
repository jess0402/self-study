package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2024.02.02
public class BOJ_2609 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int tmp1 = Integer.parseInt(st.nextToken());
		int tmp2 = Integer.parseInt(st.nextToken());
		
		int max = Math.max(tmp1, tmp2);
		int min = Math.min(tmp1, tmp2);
		
		int a = max;
		int b = min;
		while(a % b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		System.out.println(b);
		System.out.println(b * (max / b) *(min / b));
	}
}
