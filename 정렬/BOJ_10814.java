package boj;

import java.awt.color.CMMException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		
		String[][] memberArr = new String[cnt][2];
		
		for(int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String age = st.nextToken();
			String name = st.nextToken();
			
			memberArr[i][0] = age;
			memberArr[i][1] = name;
			
		}
		
		Arrays.sort(memberArr, new Comparator<String[]>() {
			// 나이순으로 정렬
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});
		
		for(int i = 0; i < cnt; i++) {
			sb.append(memberArr[i][0] + " " + memberArr[i][1] + "\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
		
	}

}
