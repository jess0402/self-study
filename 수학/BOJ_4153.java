package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 24.01.26
public class BOJ_4153 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		
		int idx = 0;
		while(true) {
			String str = br.readLine();
			if(str.equals("0 0 0")) break;
				
			int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
			Arrays.sort(arr);
			
			int result = arr[0]*arr[0] + arr[1]*arr[1];
			
			String answer = result == arr[2]*arr[2] ? "right" : "wrong";
			sb.append(answer + "\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
