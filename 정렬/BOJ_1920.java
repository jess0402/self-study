package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] numArr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			numArr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 이분 탐색을 사용하기 위해 배열 오름차순 정렬
		Arrays.sort(numArr);
		
		int m = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int targetNum = Integer.parseInt(st.nextToken());
			int in = Arrays.binarySearch(numArr, targetNum);
			
			sb.append(in < 0 ? "0" : "1").append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
