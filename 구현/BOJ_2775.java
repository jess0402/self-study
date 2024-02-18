package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2775 {

	// 24.01.29
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());	
		int[] floor = new int[15];
		
		for(int t = 0; t < tc; t++) {
			for(int i = 0; i < floor.length; i++) {
				floor[i] = i;
			}
			
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			// 1층  ~ k층
			for(int i = 1; i <= k; i++) {
				for(int j = 1; j <= n; j++) {
					floor[j] += floor[j - 1];
				}
			}
			sb.append(floor[n] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
