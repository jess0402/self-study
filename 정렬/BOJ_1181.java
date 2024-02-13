package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int cnt = Integer.parseInt(br.readLine());
		
		String[] wordArr = new String[cnt];
		
		for(int i = 0; i < cnt; i++) {
			wordArr[i] = br.readLine();
		}
		
		Arrays.sort(wordArr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// 단어 길이로 비교
				int lengthComparison = Integer.compare(s1.length(), s2.length());
				
				if(lengthComparison == 0) {
					return s1.compareTo(s2);
				}
				return lengthComparison;
			}
		});
		
		String tmp = wordArr[0];
		sb.append(wordArr[0] + "\n");
		
		for(int i = 1; i < cnt; i++) {
			tmp = wordArr[i-1];
			if(tmp.equals(wordArr[i])) {
				continue;
			}
			sb.append(wordArr[i] + "\n");
		}
		
		bw.append(sb.toString());
		bw.flush();
		bw.close();
		
	}

}
