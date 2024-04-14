package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11050 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int n_k = n - k;
		
		int numerator = factorial(n);   // 분자
		int denominator = factorial(k) * factorial(n-k); // 분모 
		
		System.out.println(numerator/denominator);
	}
	
	public static int factorial(int n) {
		
		if(n == 0)
			return 1;
		
		for(int i = n-1; i > 0; i--) {
			n *= i;
		}
		
		return n;
	}

}
